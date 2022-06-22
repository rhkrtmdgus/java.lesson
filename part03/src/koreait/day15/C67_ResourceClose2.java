package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.Stream;

public class C67_ResourceClose2 implements AutoCloseable {

	public static void main(String[] args) {
		
		String filename = "D:\\kje_java\\workspace\\part03\\src\\koriaitfile.txt";
		//io�� �Է� ���
		
		//Scanner : �Է� ����� ���� Ŭ����
		//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try~ catch �ʿ��ϴ�
		File file = new File(filename);
		
		try(Scanner sc = new Scanner(file)){
			
			
			while(sc.hasNext()) {
				System.out.println("���Ͽ��� ���� ���� :" + sc.nextLine());
			}
		
			System.out.println("���� �б� �Ϸ�");
		}catch(FileNotFoundException e){
			
//			e.printStackTrace();
			System.out.println("����� ���� �߻� : " + e.getMessage());
			System.out.println("������ ������ �����ϴ�.");
			
		}

		
		
		
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
