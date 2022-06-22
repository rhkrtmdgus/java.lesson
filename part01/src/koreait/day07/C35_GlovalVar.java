package koreait.day07;

public class C35_GlovalVar {
	
	int count;
	String message;
	static int num;
	
	public static void main(String[] args) { // static 끼리만 접근 가능
		int num = 10;
		System.out.println("num = " + num);
	//	System.out.println("message = " + message);  오류 : static이 아닌 변수는 사용 못 함
		
		methodB();
		
	}
	
	public void methodA() {
		int num = 99;
		System.out.println("num = " + num);
		System.out.println("message = " + message);
		
	}
	
	public static void methodB() {
		int num = 77;
		System.out.println("num = " + num);
		System.out.println("num = " + C35_GlovalVar.num);
		
	}
	
	

}
