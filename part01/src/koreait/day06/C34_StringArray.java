package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {
		
		String message = "hi java!"; //message는 참조형 변수
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		for (int i = 0; i < engKey.length; i++) {
			System.out.println(engKey[i]);
		}
		
		String[] koreans = new String[5];  // 아무것도 참조하지 않은 상태
		for (int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]); 
		}
		
		System.out.println("1. engKey 배열 요소 값이 참조하는 문자열의 길이");
		for (int i = 0; i < engKey.length; i++) {
			System.out.println(engKey[i] + ":" + engKey[i].length()); 
			
		}
		 // 참조하고 있는 객체가 없을 때 메소드/필드 참조하면 오류
		koreans[0] = "계속하다.";
		koreans[1] = "멈추다";
		koreans[2] = "공용의";
		
		
		System.out.println("2. koreans 배열 요소 값이 참조하는 문자열의 길이");
		for (int i = 0; i < koreans.length; i++) {
			if (koreans[i] != null) //***
			System.out.println(koreans[i] + ":" + koreans[i].length()); 
		
		
		
		}
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("static 뜻? >>>");
//		koreans[3] = sc.nextLine();
//		System.out.print("dynamic 뜻? >>>");
//		koreans[4] = sc.nextLine();
//	
//		System.out.println("3. 모두 입력된 koreans 배열 확인");
//		for (int i = 0; i < koreans.length; i++) {
//			System.out.println(koreans[i] + ":" + koreans[i].length()); 
//			
//		}
		
		System.out.print("찾을 단어는 ? >>>");
		String find = sc.nextLine();
		int ea = 0;
		for (int i = 0; i < engKey.length; i++) {
			
			if (find.equals(engKey[i])) {
				System.out.println("찾았습니다.");
				ea = i;
				break;
			}
			
			
		}
		if (ea > 0)
			System.out.println("단어 위치 : " + ea);
		else System.out.println("못 찾음");
		
		
		
		
		
	}
}
