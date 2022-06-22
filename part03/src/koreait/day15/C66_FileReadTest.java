package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {

	public static void main(String[] args) {
		
		String filename = "D:\\kje_java\\workspace\\part03\\src\\koriaitfile2.txt";
		//io�� �Է� ���
		
		//Scanner : �Է� ����� ���� Ŭ����
		//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try~ catch �ʿ��ϴ�
		File file = new File(filename);
		Scanner sc = null;
		
		try {
			sc = new Scanner(file); 
			
			while(sc.hasNext()) {
			System.out.println("���Ͽ��� ���� ���� :" + sc.nextLine());// ���ٸ� �Էµ�
			}
			
		} catch (FileNotFoundException e) {
			//��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
//			e.printStackTrace();   ���� ����
			
 			System.out.println("����� ���� �߻� : " + e.getMessage());
			
		}finally {
			if(sc != null)
				sc.close();
		}
		

		
		
		
		
	}

}
