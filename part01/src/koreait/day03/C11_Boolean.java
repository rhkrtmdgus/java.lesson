package koreait.day03;

import java.util.Scanner;


public class C11_Boolean {

	public static void main(String[] args) {
		
		boolean result;
		
		result = 10 > 5;
		System.out.println("10 > 5 �� �����? : " + result);
		System.out.println("9 != 9 ����� ? : " + (9!=9));
		System.out.println("9 == 9 ����� ? : " + (9==9));
		
		int korean, math;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("������ ��� Ȯ���ϱ� : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		
		System.out.println("������ ��� Ȯ���ϱ� : or");
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));

		
		System.out.println("������ ��� Ȯ���ϱ� : not");
		System.out.println(" not ture = " + !true);    //true ���� �ݴ�(not)������ �ٲ�
		System.out.println(" not false = " + !false);

		
		System.out.print("���� ���� �Է�");
		korean = sc.nextInt();
		
		System.out.print("���� ���� �Է�");
		math = sc.nextInt();
		
		
		System.out.println("����л�? " + (korean>=80 && math>=80));
		System.out.println("Ư���л�? " + (korean>=90 || math>=90));
		System.out.println("Ư���� �л�? " + !(korean >= 20 && korean <= 80));
		
		sc.close();
		
		/*
		 * �������� �⺻ ���� : boolean �� true or false ���� ���� ����. (Boolean ���� Ŭ���� ����)
		 * 
		 * 
		 * 
		 */
		
		
		
	}

}
