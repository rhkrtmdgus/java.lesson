package koreait.day06;

import java.util.Random;

public class C30_RandomTest {

	public static void main(String[] args) {

		Random r = new Random();
		
		System.out.println("1. 정수형 랜덤값 10개 출력");
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt();
			System.out.println(inum);
		}
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt(100)+1;
			System.out.println(inum);
		}
		
		
		
		
	}

}
