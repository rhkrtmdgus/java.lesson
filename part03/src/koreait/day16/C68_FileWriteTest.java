package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Exception ó������� ���� �޼ҵ忡�� ���ǵ� �� �ٸ� ���: 1) 2)

public class C68_FileWriteTest {
	// main�޼ҵ尡 throws Exception �Ѵٸ� jvm ���� �ѱ�ϴ�. 
	public static void main(String[] args) {
		
		String filename = "D:\\\\iclass95\\\\koriaitfile.txt";
		
		try {
			fileWrite2(filename);
//			filename = "D:\\\\iclass95\\\\koriaitfile.txt";
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� ���� : " + e.getMessage());
			System.out.println("������ �����ϴ��� Ȯ���ϼ���.");
		}
		
		
		
	
	}
	//��� 1 Exception�� try~catch �� ���� ó�� 
	public static void fileWrite(String filename) {
		File file = new File(filename);
		PrintWriter pw = null;
		try {
			
			pw = new PrintWriter(file); // file �� ������ ��ġ�� ����� ���� ��ü

			pw.print("��� 90 89 82\n");
			pw.print("weaklfwefwefwnkwenvlawknn;ewknalnawe\n");
			pw.print("wea5464654654klfwefwefwnkwenvlawknn;ewknalnawe\n");
			pw.print("���� 90 89 82\n");
			pw.print("���� 90 89 82\n");
			System.out.println("������ ����� �Ϸ�Ǿ����ϴ�.");  // System.out : ǥ�� ��� (�ܼ� ���)
			
		} catch (FileNotFoundException e) {
			System.out.println("���� �߻� : " + e.getMessage());
		}finally {
			pw.close();
			
		}
	}
	//��� 2 : throws Ű����� �ش� Exception�� ȣ���ϴ� ������ �ѱ��. ( ���ѱ�� )
	// ���� : throws �ڿ��� "," �� �����ؼ� �������� ���� ����
	//			Exception ó���ؾ� �� �޼ҵ尡 ���� ���ǵǰ� ���� �� �Ѱ����� ��� ó���� �� �ֽ��ϴ�.
	public static void fileWrite2(String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = null;
		pw = new PrintWriter(file); // file �� ������ ��ġ�� ����� ���� ��ü	
			
		pw.print("��� 90 89 82\n");
		pw.print("���� 90 89 82\n");
		pw.print("���� 90 89 82\n");
		
		pw.close();
			
	}
	
	public static void fileRead(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		
		
		}
		sc.close();
	}

}
