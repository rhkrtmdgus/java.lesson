package koreait.day05;

import java.util.Scanner;


public class C23_ForTest {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("헬로우~");
//			System.out.println(i);
//			System.out.println("///////");
//		}
//		
//		System.out.println("--------------");
//		for (int i = 0; i < 10; i+= 2) {
//			System.out.println("HELLO!!!!");
//		}
//		
//		System.out.println("--------------");
//		
//		for (int i = 0; i < 0; i++) {
//			System.out.println("헬로우!!!!");
//		}
//		
//		System.out.println("--------------");
//		
//		for (int i = 10; i > 0 ; i--) {
//			System.out.println("헬로우!");
//			System.out.println(i);
//			System.out.println("//////");
//		}
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("hello!(" + (i + 1) + ")");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[영화감상 후기]]");
		System.out.print("평점을 몇 점 주시겠습니까? (1 ~ 5) >>> ");
		int count = sc.nextInt();
		
		System.out.println("방법 1");
		for (int i = 0; i < count; i++) {
			System.out.print("★");
		}
		
		System.out.println("\n방법 2");
		for (int i = 0; i < count; i++) {
			System.out.print("★");
		}
		for (int i = 0; i < 5 - count; i++) {
			System.out.print("☆");
		}
		
		sc.close();
		
		
		
		
	}

}
