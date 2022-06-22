package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
		// 작성자 : 곽승현
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] left = new int[10];
		int[] right = new int[10];
		int[] answer = new int[10];
		int rightAnswer = 0;
		int[] question = new int[10];
		
		System.out.println("-------------------------");
		System.out.println("빨간 펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------");
		System.out.println("시작합니다.");
		
		int k;
		
		for (int i = 1; i < 6; i++) {
			
			int a = rd.nextInt(100)+1;
			int b = rd.nextInt(100)+1;
						
			System.out.print("문제 " + i + ". "+ a + " + " + b + " = " + "답 입력 -> ");
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
		System.out.println("채점 합니다. 맞은 갯수 " +	rightAnswer + " ( " + rightAnswer*10 + " 점)");
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		for (int j = 0; j < 5; j++) {
			
			if (question[j] > 0) {
				System.out.println("문제 " + (j+1) + ". "+ left[j] + " + " + right[j] + " = " + answer[j]);
			}
				
		}
	}

}
