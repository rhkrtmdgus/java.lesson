package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
		// �ۼ��� : ������
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] left = new int[10];
		int[] right = new int[10];
		int[] answer = new int[10];
		int rightAnswer = 0;
		int[] question = new int[10];
		
		System.out.println("-------------------------");
		System.out.println("���� �� ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-------------------------");
		System.out.println("�����մϴ�.");
		
		int k;
		
		for (int i = 1; i < 6; i++) {
			
			int a = rd.nextInt(100)+1;
			int b = rd.nextInt(100)+1;
						
			System.out.print("���� " + i + ". "+ a + " + " + b + " = " + "�� �Է� -> ");
			k = sc.nextInt();
			left[i-1] = a;
			right[i-1] = b;
			if (a + b != k) {
				question[i-1] = i;
				answer[i-1] = a + b;
			}
			else rightAnswer += 1;
			
		}
		
		System.out.println("-------------------------");
		System.out.println("ä�� �մϴ�. ���� ���� " +	rightAnswer + " ( " + rightAnswer*10 + " ��)");
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");
		for (int j = 0; j < 5; j++) {
			
			if (question[j] > 0) {
				System.out.println("���� " + (j+1) + ". "+ left[j] + " + " + right[j] + " = " + answer[j]);
			}
				
		}
	}

}
