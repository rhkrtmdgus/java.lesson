package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {
	//�ۼ��� : ������
	public static void main(String[] args) {
		
		
		int width;
		int height;
		double half;
		
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�簢���� ���α���(����)�� �Է��ϼ��� : ");
		width = sc.nextInt();
		
		System.out.print("�簢���� ���α���(����)�� �Է��ϼ��� : ");
		height = sc.nextInt();
		int area1 = width * height;
		System.out.println();
		System.out.println("-----------------------------");
		
		
		
		System.out.println("�簢�� ���̸� ���߽��ϴ� = " + area1 + "��");
		System.out.println("-----------------------------");
		System.out.println();
		
		System.out.println("[[���� ������ ���� ���ϱ�]]");
		System.out.println();
		System.out.print("���� ������(�Ǽ�)�� �Է��ϼ��� : ");
		half = sc.nextDouble();
		
		double circumference = half * 3.14 * 2; // �ѷ�
		double area2 = 3.14 * half * half; // ����
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.printf("�� �ѷ��� ���߽��ϴ� = %.3f cm \n", circumference);
		System.out.printf("�� ���̸� ���߽��ϴ� = %.3f �� \n", area2);
		System.out.println("-----------------------------");
		
		//final Test
		//    ���� ���� �տ� final Ű���带 ���̸� ���� �������� ���� 
		
		
	}

}
