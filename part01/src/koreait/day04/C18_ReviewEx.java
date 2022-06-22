package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	// 작성자 : 곽승현
	public static void main(String[] args) {
		
		int korean, english, science, sum;
		double average;
		String best;  // 특기과목명 참조할 변수
		String bestSubject = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적을 입력하세요");
		System.out.print("국어 >> ");
		korean = sc.nextInt();
		System.out.print("영어 >> ");
		english = sc.nextInt();
		System.out.print("과학 >> ");
		science = sc.nextInt();
		System.out.println();
		
		
		System.out.println(">>처리되었습니다.");
		sum = korean + english + science;
		System.out.println("총점 : " + sum);
		average = (double)(korean + english + science) / 3;
		
		System.out.printf("평균 : %d (%.2f) , 과목 수 : %d\n", (int)average, average, 3);
		
		
		int best2 = 0;
		
		if (korean > english) {
			best2 = korean;
			bestSubject = "국어";
		}
		if (english > korean) {
			best2 = english;
			bestSubject = "영어";
		}
		if (best2 < science) {
			best2 = science;
			bestSubject = "과학";
		}
		best = "" + best2;
		
		
		System.out.printf("이 학생의 특기과목은 %s. %s 점. 입니다.\n", bestSubject, best);
		
		
		
		
	}

}
