package koreait.day04;

public class C19_MethodTest {

	public static void main(String[] args) {
		// String Ŭ������ �޼ҵ带 ����.
		// �� �޼ҵ��� ���� ����
		
		// �޼ҵ��� �ֿ� ��� : ��ȯ ��, ����(argument) �Ǵ� �Ű� ���� (parameter), �޼ҵ� �̸�, public �Ǵ� static
		
		System.out.println("1.");
		methodA(); // �޼ҵ� ȣ��(����)
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
		System.out.println("return = " + methodD()); // ��ȯ ���� �޾Ƽ� ����ϴ� ����
		int temp = methodD();
		System.out.println("return = " + temp);
		System.out.println( );
		System.out.println("5.");
		double sd = methodE(20, 15);
		System.out.println("��� �� : " + sd);
		
		System.out.println("6.");
		System.out.println(methodF('i', 4));
	}
	
	// �޼ҵ� ����
	public static void methodA() {
		System.out.println("ù��° �޼ҵ� ���� �����Դϴ�.");
	}
	
	public static void methodB(int a, int b) {
		System.out.println("##�ι�° �޼ҵ� ���� �����Դϴ�.##");
		System.out.println("���޹��� �� a = " + a + ", b =" + b );
	}
	
	public static void methodC(int a, double b) {
		System.out.println("##����° �޼ҵ� ���� �����Դϴ�.##");
		System.out.println("���޹��� �� a = " + a + ", b =" + b );
	}
	
	public static int methodD() {
		System.out.println("##�׹�° �޼ҵ� ���� �����Դϴ�.##");
		return 999;
		
	}
	
	public static double methodE(int a, double b) {
		System.out.println("##�ټ���° �޼ҵ� ���� �����Դϴ�.##");
		return a + b ;
		
	}
	
	public static char methodF(char ch , int size) {
		System.out.println("##������° �޼ҵ� ���� �����Դϴ�.##");
		return (char) (ch + size);
		
	}
	
	
}
