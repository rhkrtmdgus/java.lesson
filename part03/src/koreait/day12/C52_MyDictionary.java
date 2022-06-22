package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		
		//HashMap<String, String> dic = new HashMap<>();
		TreeMap<String, String> dic = new TreeMap<>(); // ������ �Ǵ� Map
		
		
		Scanner sc = new Scanner(System.in);
		boolean is = true;
		
		while (is) {
			System.out.println("���� ��� ��  1. �ܾ����� 2.�ܾ�˻� 3.�ܾ��� ���� 4.���α׷� ������");
			System.out.print("���� >> " );
						
			switch (sc.nextLine()){
				case "1":
					System.out.print("English -> ");	
					String e = sc.nextLine();
					System.out.print("korean -> ");	
					String k = sc.nextLine();
					dic.put(e, k);
					break;
							
				case "2":
					System.out.print("English -> ");
					String en = sc.nextLine();
					System.out.println("�˻��߽��ϴ� ���>> " + dic.get(en));
					break;
				case "3":
					System.out.println("�ܾ��� ��ü���� : " + dic);
					break;
					
				case "4":
					sc.close();
					is = false;
					break;
					
				default:
					System.out.println("?? �ٽ� �Է��ϼ��� ??");
					
			}
		}
		
		System.out.println("���� �մϴ�");
		
		
		
		
	}

}
