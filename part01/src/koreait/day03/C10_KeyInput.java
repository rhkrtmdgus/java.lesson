package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {
	// �ۼ��� : ������
	public static void main(String[] args) {
		
		// sc�� ���� ���Դϴ�. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� �����Դϴ�. >> ������ ����
		Scanner sc = new Scanner(System.in);   // Ű���� �Է��� ���� ���� ����
		
		int data;
		float dw;
		
		System.out.print("���� ���� �Է��ϼ��� : ");
		
		data = sc.nextInt();  // ����ڷκ��� Ű���� �Է¹ް� �� ���� ������ ��ȯ�Ͽ� data ������ ����.
		
		System.out.println("�Էµ� ���� " + data + "�Դϴ�.");
		
		double point;
		System.out.print("�Ǽ� ���� �Է��ϼ��� : ");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + "�Դϴ�.");
		
		
		
		
	}

}
/*
 * 	ǥ�� ��� : System.out
 *  ǥ�� �Է� : System.in     -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 						   -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 * 
 */
