package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {
		
		String message = "hi java!"; //message�� ������ ����
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		for (int i = 0; i < engKey.length; i++) {
			System.out.println(engKey[i]);
		}
		
		String[] koreans = new String[5];  // �ƹ��͵� �������� ���� ����
		for (int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]); 
		}
		
		System.out.println("1. engKey �迭 ��� ���� �����ϴ� ���ڿ��� ����");
		for (int i = 0; i < engKey.length; i++) {
			System.out.println(engKey[i] + ":" + engKey[i].length()); 
			
		}
		 // �����ϰ� �ִ� ��ü�� ���� �� �޼ҵ�/�ʵ� �����ϸ� ����
		koreans[0] = "����ϴ�.";
		koreans[1] = "���ߴ�";
		koreans[2] = "������";
		
		
		System.out.println("2. koreans �迭 ��� ���� �����ϴ� ���ڿ��� ����");
		for (int i = 0; i < koreans.length; i++) {
			if (koreans[i] != null) //***
			System.out.println(koreans[i] + ":" + koreans[i].length()); 
		
		
		
		}
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("static ��? >>>");
//		koreans[3] = sc.nextLine();
//		System.out.print("dynamic ��? >>>");
//		koreans[4] = sc.nextLine();
//	
//		System.out.println("3. ��� �Էµ� koreans �迭 Ȯ��");
//		for (int i = 0; i < koreans.length; i++) {
//			System.out.println(koreans[i] + ":" + koreans[i].length()); 
//			
//		}
		
		System.out.print("ã�� �ܾ�� ? >>>");
		String find = sc.nextLine();
		int ea = 0;
		for (int i = 0; i < engKey.length; i++) {
			
			if (find.equals(engKey[i])) {
				System.out.println("ã�ҽ��ϴ�.");
				ea = i;
				break;
			}
			
			
		}
		if (ea > 0)
			System.out.println("�ܾ� ��ġ : " + ea);
		else System.out.println("�� ã��");
		
		
		
		
		
	}
}
