package koreait.day02;

public class C08_Test {
	//작성자 : 곽승현
	public static void main(String[] args) {
		
		int width = 23;
		int length = 19;
		
		int area1 = width * length;
		
		System.out.println("사각형 넓이를 구했습니다 = " + area1 + "㎠");
		
		double radius = 23.230;
		
		double circumference = radius * 3.14 * 2; // 둘레
		double area2 = 3.14 * radius * radius; // 넓이
		
		System.out.printf("원 둘레를 구했습니다 = %.3f cm \n", circumference);
		System.out.printf("원 넓이를 구했습니다 = %.3f ㎠ \n", area2);
		
		//final Test
		//    변수 선언 앞에 final 키워드를 붙이면 값을 변경하지 못함 
		
		
	}

}
