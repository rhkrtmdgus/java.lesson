package koreait.day03;

import java.util.Scanner;

public class C12_test {
	// 작성자 : 곽승현
	public static void main(String[] args) {
		
		
		int n1, n2, n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n1을 입력하세요 : ");
		n1 = sc.nextInt();
		System.out.print("n2를 입력하세요 : ");
		n2 = sc.nextInt();
		System.out.print("n3를 입력하세요 : ");
		n3 = sc.nextInt();
		System.out.println();
		
		System.out.printf("n1=%d\t n2=%d\t n3=%d\t\n", n1, n2, n3);
		System.out.println("-----------------------");
			
		int max;
		int min;
		
		if (n1 > n2) {
			max = n1;
			min = n2;
		}
		else {
			max = n2;
			min = n1;
		}
		
		if (max < n3) {
			
			max = n3;
		}
		else {
			min = n3;
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
	}

}
