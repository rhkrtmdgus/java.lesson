package koreait.day07;

public class C35_GlovalVar {
	
	int count;
	String message;
	static int num;
	
	public static void main(String[] args) { // static ������ ���� ����
		int num = 10;
		System.out.println("num = " + num);
	//	System.out.println("message = " + message);  ���� : static�� �ƴ� ������ ��� �� ��
		
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
