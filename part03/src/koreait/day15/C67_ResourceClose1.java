package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.Stream;

public class C67_ResourceClose1 implements AutoCloseable {

	public static void main(String[] args) {
		
		String filename = "D:\\iclass95\\koriaitfile.txt";
		//io�� �Է� ���
		
		//Scanner : �Է� ����� ���� Ŭ����
		//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try~ catch �ʿ��ϴ�
		File file = new File(filename);
		PrintWriter pw = null;
		
		try(PrintWriter pw1 = new PrintWriter(file)){
			pw1.write("��� 90 89 82\n");
			pw1.write("��� 90 89 82\n");
			pw1.write("��� 90 89 82\n");
			pw1.write("��� 90 89 82\n");
			pw1.write("��� 90 89 82\n");
			
			System.out.println("������ ����� �Ϸ�Ǿ����ϴ�.");
			
			pw1.close();
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	
			
			
		
		
		
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
