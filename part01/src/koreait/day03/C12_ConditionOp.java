package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
	// 작성자 : 곽승현

	public static void main(String[] args) {
		int korean, math;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("국어 점수 입력");
		korean = sc.nextInt();
		
		System.out.print("수학 점수 입력");
		math = sc.nextInt();
		
		// 논리 연산문
//		System.out.println("모범학생? " + ((korean>=80 && math>=80)? "맞습니다":"아닙니다"));
		
		// 조건문
		//{} 는 명령문 블록이고 여러 개의 명령들을 감싸는 기호
		// {}는 명령어가 1개일 때 생략 가능
		if (korean>=80 && math>=80) {
			System.out.println("맞습니다.");                                                                                
			
		}else {
			System.out.println("아닙니다.");
			
		}
		
		if(korean>=90 || math>=90) 
			System.out.println("맞습니다");
		else
			System.out.println("아닙니다");
		
		// 프로그램의 처리조건이  else{}에 해당하는 내용이 없으면 작성 안 합니다.
		if(!(korean >= 20 && korean <= 80)) {
			System.out.println("특이합니다.");
		}
	}

}
