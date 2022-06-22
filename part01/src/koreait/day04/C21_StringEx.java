package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
	public static void main(String[] args) {

		/*  구글 이메일 계정을 체크하는 기능 구현 
		 *  1. @ 기호가 1개 포함되어야 합니다.	(메시지 : 이메일 형식이 아닙니다.)
		 *  2. 1번이 참일 때 @ 뒤에는 gmail.com 이어야 합니다. (메시지 : 도메인 이름이 틀립니다.)
		 *  3. 2번이 참일 떄 @ 앞까지의 문자열(계정이름)만 추출합니다.
		 *  4. 3번의 계정이름은 6글자 이상이어야 합니다.
		 *  5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다. 
		 *   
		 *   alt + shift + r 전체 명 변경
		 *   
		 */  
		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean check = true;
		
		System.out.print("이메일을 입력하세요 : ");
		email = sc.nextLine();
		System.out.println("-------------------------------------");
		int idx = email.indexOf('@');
		
		if (idx >= 0) {
			String del = email.substring(0, idx);
			String domainCheck = email.replace(del, "");
			if (domainCheck.equals("@gmail.com")) {
				if (del.indexOf("$") < 0 && del.indexOf("%") < 0) {
					System.out.println("아이디 추출 : " + del);
					if (del.length() >= 6) {
						System.out.println("--------------------------");
						System.out.println("로그인 성공");
					}
					else System.out.println("아이디 6자 이상이여야 합니다.");
				}
				else System.out.println("아이디에 $, % 를 포함할 수 없습니다.");
				
				
			}
			else System.out.println("메시지 : 잘못된 도메인 입니다.");
		}
		else System.out.println("메시지 : 이메일 형식이 아닙니다.");
		
		sc.close();
		
		
		
		    
		
		
		
	}

}
