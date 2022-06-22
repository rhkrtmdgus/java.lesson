package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {
		
		String filename = "D:\\kje_java\\workspace\\part03\\src\\koriaitfile.txt";
		//io�� �Է� ���
		
		File file = new File(filename);
		PrintWriter pw = null;
		try {
			
			//��� ����� ���� Ŭ����
			//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try~ catch �ʿ��ϴ�
			pw = new PrintWriter(file); // file �� ������ ��ġ�� ����� ���� ��ü

			pw.print("��� 90 89 82\n");
			pw.print("weaklfwefwefwnkwenvlawknn;ewknalnawe\n");
			pw.print("wea5464654654klfwefwefwnkwenvlawknn;ewknalnawe\n");
			pw.print("���� 90 89 82\n");
			pw.print("���� 90 89 82\n");
			System.out.println("������ ����� �Ϸ�Ǿ����ϴ�.");  // System.out : ǥ�� ��� (�ܼ� ���)
			
		} catch (FileNotFoundException e) {
			//��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
			System.out.println("���� �߻� : " + e.getMessage());
		}finally {
			pw.close();
		}
		

		
		
		
		
	}

}
