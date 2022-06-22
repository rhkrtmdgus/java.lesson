package koreait.day04;

public class C19_MethodTest {

	public static void main(String[] args) {
		// String 클래스의 메소드를 이해.
		// ㄴ 메소드의 구조 연습
		
		// 메소드의 주요 요소 : 반환 값, 인자(argument) 또는 매개 변수 (parameter), 메소드 이름, public 또는 static
		
		System.out.println("1.");
		methodA(); // 메소드 호출(실행)
		System.out.println( );
		System.out.println("2.");
		methodB(11, 33);
		methodB(929, 111);
		System.out.println( );
		System.out.println("3.");
		methodC(929,12.1);
		methodC(929,121);
		System.out.println( );
		System.out.println("4.");
		methodD();
		System.out.println("return = " + methodD()); // 반환 값을 받아서 출력하는 예시
		int temp = methodD();
		System.out.println("return = " + temp);
		System.out.println( );
		System.out.println("5.");
		double sd = methodE(20, 15);
		System.out.println("출력 값 : " + sd);
		
		System.out.println("6.");
		System.out.println(methodF('i', 4));
	}
	
	// 메소드 선언
	public static void methodA() {
		System.out.println("첫번째 메소드 정의 연습입니다.");
	}
	
	public static void methodB(int a, int b) {
		System.out.println("##두번째 메소드 정의 연습입니다.##");
		System.out.println("전달받은 값 a = " + a + ", b =" + b );
	}
	
	public static void methodC(int a, double b) {
		System.out.println("##세번째 메소드 정의 연습입니다.##");
		System.out.println("전달받은 값 a = " + a + ", b =" + b );
	}
	
	public static int methodD() {
		System.out.println("##네번째 메소드 정의 연습입니다.##");
		return 999;
		
	}
	
	public static double methodE(int a, double b) {
		System.out.println("##다섯번째 메소드 정의 연습입니다.##");
		return a + b ;
		
	}
	
	public static char methodF(char ch , int size) {
		System.out.println("##여섯번째 메소드 정의 연습입니다.##");
		return (char) (ch + size);
		
	}
	
	
}
