package koreait.day02;

public class C05_IntegerVar {

	public static void main(String[] args) {  // 메인메소드 시작
		
		/* 1. main 메소드 안에서만 사용하는 지역변수를 선언합니다.
		 * 2. 기본형 (primitive) 데이터 타입 : 정수형식
 		 * 		정수형식 byte, short, int, long 키워드(역할이 정해진 단어)
		 */
		
		byte n1;
		short n2;
		int n3;
		long n4;
		
		//변수를 선언하면서 초기값도 주었다.
		byte m1 = 100;
		short m2 = 100;
		int m3 = 100;
		long m4 = 100;
		
	//	System.out.println(n1); // 값이 없는 변수 , 초기값이 없다.
		System.out.println(m1);
		
		
		n1 = 123;
		n1 = 99;
	//	n1 = 999;
		n2 = 29999;
	//	n2 = -40000;
		n3 = -40000;
		n3 = 123456789;
	//	n3 = 1234567890123;
	//	n4 = 1234567890123;
	//	n4 = 1234567890123;
		n4 = 123;
		n4 = 1234567890123L; // long  리터럴 표시는 L, l 을 마지막에 쓴다.
		
		System.out.println("변수 n1 = " + n1 );
		System.out.println("변수 n2 = " + n2 );
		System.out.printf("변수%s = %d \n" , "n3", n3);
		System.out.printf("변수%s = %d \n" , "n4", n4);
		
		
		
		
	} // main method end

} 


/*변수 : 메모리에 저장된 값 중에서 변경할 수 있는 데이터를 말합니다.
 *    변수는 프로그램이 실행되는 동안에 임시로 사용하는 메모리 공간입니다.
 *	    데이터가 저장된 메모리에 접근하기 위해서 변수명(식별자)을 부여합니다.
 *    변수 선언한다 -> 변수명과 데이터 형식을 지정하는 것.-> 메모리에 공간 할당 됩니다.
 */
