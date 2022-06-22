package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 업력 >>> ");
			//int n = sc.nextInt();
			int n = Integer.parseInt(sc.nextLine());
			//숫자 외에 다른 문자 입력하면 Exception 오류 발생 NumberFormatEXCEPTION
			
			System.out.println("당신이 입력한 값 : " + n);
	//	} catch (Exception e) {
		
		
//		} catch (NullPointerException e) {
		} catch (NullPointerException | NumberFormatException e) {
			// 발생한 오류 정보를 Exception 객체로 관리하고 이에 대한 참조변수는 e입니다.
			System.out.println("오류 발생 : " + e.getMessage());
			System.out.println("사용자 기능에 문제가 발생했습니다.");
			
		}finally {
			sc.close();
		}
		
		
		
		
		System.out.println("프로그램 끝");
		
	}

}
