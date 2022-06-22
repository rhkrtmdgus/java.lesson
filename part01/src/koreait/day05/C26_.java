package koreait.day05;

import java.util.Scanner;

public class C26_ {

		// 작성자 : 곽승현
	public static void main(String[] args) {
		
		
		//연습문제 : 가상 은행의 예금/출금/잔고조회 실행
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sel;
		int balance = 0; //잔액
		
		while(run) {
			int money;
			System.out.println("┌─────────────────────────────────────┐");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 확인 | 4.종료          |");
			System.out.println("└─────────────────────────────────────┘");
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();
			
			switch (sel) {
			case 1:  // 예금처리
					System.out.print("예금액 : ");
					money = sc.nextInt();
					balance += money;
					
					System.out.println("고객님의 잔액은 " + balance + "원 입니다. ");
					break;
			case 2:	// 출금처리
					System.out.print("출금액 : ");
					money = sc.nextInt();
					if (balance >= money) {
						balance -= money;
						System.out.println("고객님의 잔액은 " + balance + "원 입니다. ");
						break;
					}
					else
						System.out.println("잔액이 부족합니다.");
					break;
					
			case 3: //잔고 출력
					System.out.println("현재 잔고 " + balance + "원 입니다.\n");
					break;
			
			case 4: //종료
				
					System.out.println("프로그램을 종료합니다.");
					run = false;
					break;
			
			default:
					System.out.println("잘못된 선택입니다. 1~4 메뉴 중에 선택하세요");
					continue;
					
			}
			
			System.out.println("------------end------------");
			
		}
		
	}

}
