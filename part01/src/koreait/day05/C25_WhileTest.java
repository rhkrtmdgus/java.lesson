package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		
		
//		int j = 0;
//		
//		while (j<5) {
//			System.out.println("hello(" + (j + 1) + ")");
//			j++;
//		}
		
	
		int k = 0, sum=0;
		Scanner sc = new Scanner(System.in);
//		while (k != -1) {
//			System.out.print("정수 입력>>> ");
//			k = sc.nextInt();
//			if (k != -1) {
//				sum += k;
//			}
//				
//		}
//		
//		System.out.println("sum " + sum);	
		sum = 0;
		k = 0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다. [ver2] ");
		
		
		
		boolean isState = true;
		while (isState) {
			System.out.println("정수 입력 >>> ");
			k = sc.nextInt();
			sum += k;
			if (k == -1) {
				break;
				
			}
		}
		sum += 1;
		
		System.out.println(sum);
		sc.close();
	
	}

}
