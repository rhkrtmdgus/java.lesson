package koreait.day02;

public class C04_DoubleData {

	public static void main(String[] args) {
		System.out.println("Float 실수 데이터 ---------------");
		System.out.println("메모리 크기 : " + Float.BYTES);
		System.out.println("Float 실수의 최소값 : " + Float.MIN_VALUE);
		System.out.println("Float 실수의 최대값 : " + Float.MAX_VALUE);
		System.out.println();
		// 1.4E-45 는 1.4 X 10의 -45승 , 3.4028235E38는 10의 38승
		
		System.out.println("Double 실수 데이터 ---------------");
		System.out.println("메모리 크기 : " + Double.BYTES);
		System.out.println("Double 실수의 최소값 : " + Double.MIN_VALUE);
		System.out.println("Double 실수의 최대값 : " + Double.MAX_VALUE);
		System.out.println();
	}

}


/*   1.234 (가수) * 10의 23(지수)승 
 * 
 * 실수 데이터 기본 형식 : float ,double 
 * 	   Wrapper 클래스는 Float, Double
 * 		1.234는 double 형식입니다.	
 */
