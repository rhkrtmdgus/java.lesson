package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		int[] x1 = new int[size];
		int[] x2 = new int[size];
		int[] no = new int[size];
		int n1, n2, ans;
		int cnt = 0;
		System.out.println("--------------------------");
		System.out.println("빨간 펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("--------------------------");
		System.out.println("시작합니다.");
		for (int i = 0; i < size; i++) {
			n1 = r.nextInt(89)+11;
			n2 = r.nextInt(89)+11;
			System.out.println("문제 " + (i + 1) + ". " + n1 + "+ " + n2 + " = 답 입력 -> ");
			
		}
		
		
		
	}

}
