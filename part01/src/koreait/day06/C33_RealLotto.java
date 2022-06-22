package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
	// 작성자 : 곽승현
	public static void main(String[] args) {
		
		int[] numbers = new int[45];   
		Random r = new Random();       // 랜덤 메소드 객체 생성
		
		for (int i = 0; i < 45; i++) { 
			numbers[i] = i + 1;		   // 인덱스 0번부터 인덱스 44까지 값 1~ 45개의 번호 저장
		}
		
		System.out.println("numbers 배열 초기 값 -----------------------------------------");
		System.out.println(Arrays.toString(numbers));  // 로또 번호 45번까지 String타입으로 출력
		System.out.println("------------------------------------------------------------");
		
		int [] lotto = new int[6]; // 6개의 인트 타입 배열 생성
		int k;
		for (int cnt = 0; cnt < 6; cnt++) { // 6번 뽑기
			k = r.nextInt(45-cnt); // 총 45번 중에 랜덤으로 k에 저장 후 1개씩 총 갯수 제거
			System.out.println("k = " + k + ", number = " + numbers[k]); // 랜덤값 출력
			
			lotto[cnt] = numbers[k]; // 뽑힌 번호 최종 랜덤 번호 배열에 입력 
			
		
			for (int i = k; i < numbers.length-1; i++) {
				numbers[i] = numbers[i + 1]; // 인덱스 값에 + 1 해서 인덱스와 벨류 값을 맞춤
			}
			System.out.println(Arrays.toString(numbers)); // String 타입으로 출력
		}
		
		System.out.println("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(numbers)); // 뽑힌 숫자 출력
		
		Arrays.sort(lotto); // 크기 정렬
		System.out.println(Arrays.toString(lotto)); // string 타입으로 출력
		
		
		
	}

}
