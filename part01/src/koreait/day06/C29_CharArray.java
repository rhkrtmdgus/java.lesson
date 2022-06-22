package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {

	public static void main(String[] args) {
		
		char [] carr1 = {'i', 'a', 'm', ' ', 'j', 'a', 'v', 'a'	}; //8 개 문자열
		char [] carr2 = new char[20];
		System.out.println("[[[[ char 배열 테스트 - 1 ]]]]");
		System.out.println("carr1 : " + Arrays.toString(carr1));
		System.out.println("carr2 : " + Arrays.toString(carr2));
		System.out.println("carr1 배열 길이(크기) : " + carr1.length);
		System.out.println("carr2 배열 길이(크기) : " + carr2.length);
		System.out.println("carr1 배열 3번째 데이터의 값(문자) : " + carr1[2] );
		System.out.println("carr2 배열 3번째 데이터의 값(문자) : " + carr2[2] );
		
		System.out.println("carr1 배열 3번째 데이터의 값(문자) : " + (int)carr1[2] );
		System.out.println("carr2 배열 3번째 데이터의 값(문자) : " + (int)carr2[2] );
		
		System.out.println("\n[[[[ char 배열 테스트 - 2 ]]]]");
		System.out.println("1. for문으로 출력");
		for (int i = 0; i < carr1.length; i++ ) {
			System.out.println("carr1[" + i + "] 의 데이터 값 : " + carr1[i]);
		}
		System.out.println("\n2.for문으로 출력");
		for (int i = 0; i < carr1.length; i++) {
			System.out.println(carr1[i]);
			
		}
		
		System.out.println("\n3. 배열 이름 (참조형 변수) 으로 출력");
		System.out.println(carr1);
		
		String msg = "iam java";
		System.out.println(msg);
		
		System.out.println("\n[[[[ char 배열 테스트 - 3 ]]]]");
		System.out.println("4. 문자열을 배열로 변경");
		carr2 = "hello hi good bye".toCharArray();
		
		
		
		
	}

}
