package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	// �ۼ��� : ������
	public static void main(String[] args) {
		
		int korean, english, science, sum;
		double average;
		String best;  // Ư������ ������ ����
		String bestSubject = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
		System.out.println("������ �Է��ϼ���");
		System.out.print("���� >> ");
		korean = sc.nextInt();
		System.out.print("���� >> ");
		english = sc.nextInt();
		System.out.print("���� >> ");
		science = sc.nextInt();
		System.out.println();
		
		
		System.out.println(">>ó���Ǿ����ϴ�.");
		sum = korean + english + science;
		System.out.println("���� : " + sum);
		average = (double)(korean + english + science) / 3;
		
		System.out.printf("��� : %d (%.2f) , ���� �� : %d\n", (int)average, average, 3);
		
		
		int best2 = 0;
		
		if (korean > english) {
			best2 = korean;
			bestSubject = "����";
		}
		if (english > korean) {
			best2 = english;
			bestSubject = "����";
		}
		if (best2 < science) {
			best2 = science;
			bestSubject = "����";
		}
		best = "" + best2;
		
		
		System.out.printf("�� �л��� Ư������� %s. %s ��. �Դϴ�.\n", bestSubject, best);
		
		
		
		
	}

}
