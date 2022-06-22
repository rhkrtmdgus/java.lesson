package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {
	//작성자 : 곽승현
	public static void main(String[] args) {
		
		
		int width;
		int height;
		double half;
		
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 가로길이(정수)를 입력하세요 : ");
		width = sc.nextInt();
		
		System.out.print("사각형의 세로길이(정수)를 입력하세요 : ");
		height = sc.nextInt();
		int area1 = width * height;
		System.out.println();
		System.out.println("-----------------------------");
		
		
		
		System.out.println("사각형 넓이를 구했습니다 = " + area1 + "㎠");
		System.out.println("-----------------------------");
		System.out.println();
		
		System.out.println("[[원의 도형의 넓이 구하기]]");
		System.out.println();
		System.out.print("원의 반지름(실수)를 입력하세요 : ");
		half = sc.nextDouble();
		
		double circumference = half * 3.14 * 2; // 둘레
		double area2 = 3.14 * half * half; // 넓이
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.printf("원 둘레를 구했습니다 = %.3f cm \n", circumference);
		System.out.printf("원 넓이를 구했습니다 = %.3f ㎠ \n", area2);
		System.out.println("-----------------------------");
		
		//final Test
		//    변수 선언 앞에 final 키워드를 붙이면 값을 변경하지 못함 
		
		
	}

}
