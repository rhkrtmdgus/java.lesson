package koreait.day05;

import java.util.Scanner;


public class C23_ForTest {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("��ο�~");
//			System.out.println(i);
//			System.out.println("///////");
//		}
//		
//		System.out.println("--------------");
//		for (int i = 0; i < 10; i+= 2) {
//			System.out.println("HELLO!!!!");
//		}
//		
//		System.out.println("--------------");
//		
//		for (int i = 0; i < 0; i++) {
//			System.out.println("��ο�!!!!");
//		}
//		
//		System.out.println("--------------");
//		
//		for (int i = 10; i > 0 ; i--) {
//			System.out.println("��ο�!");
//			System.out.println(i);
//			System.out.println("//////");
//		}
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("hello!(" + (i + 1) + ")");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[��ȭ���� �ı�]]");
		System.out.print("������ �� �� �ֽðڽ��ϱ�? (1 ~ 5) >>> ");
		int count = sc.nextInt();
		
		System.out.println("��� 1");
		for (int i = 0; i < count; i++) {
			System.out.print("��");
		}
		
		System.out.println("\n��� 2");
		for (int i = 0; i < count; i++) {
			System.out.print("��");
		}
		for (int i = 0; i < 5 - count; i++) {
			System.out.print("��");
		}
		
		sc.close();
		
		
		
		
	}

}
