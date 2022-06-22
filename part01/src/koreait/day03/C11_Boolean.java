package koreait.day03;

import java.util.Scanner;


public class C11_Boolean {

	public static void main(String[] args) {
		
		boolean result;
		
		result = 10 > 5;
		System.out.println("10 > 5 의 결과는? : " + result);
		System.out.println("9 != 9 결과는 ? : " + (9!=9));
		System.out.println("9 == 9 결과는 ? : " + (9==9));
		
		int korean, math;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("논리연산 결과 확인하기 : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		
		System.out.println("논리연산 결과 확인하기 : or");
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));

		
		System.out.println("논리연산 결과 확인하기 : not");
		System.out.println(" not ture = " + !true);    //true 값을 반대(not)값으로 바꿈
		System.out.println(" not false = " + !false);

		
		System.out.print("국어 점수 입력");
		korean = sc.nextInt();
		
		System.out.print("수학 점수 입력");
		math = sc.nextInt();
		
		
		System.out.println("모범학생? " + (korean>=80 && math>=80));
		System.out.println("특기학생? " + (korean>=90 || math>=90));
		System.out.println("특이한 학생? " + !(korean >= 20 && korean <= 80));
		
		sc.close();
		
		/*
		 * 데이터의 기본 형식 : boolean 은 true or false 값을 갖는 형식. (Boolean 래퍼 클래스 있음)
		 * 
		 * 
		 * 
		 */
		
		
		
	}

}
