package koreait.day02;

public class C04_DoubleData {

	public static void main(String[] args) {
		System.out.println("Float �Ǽ� ������ ---------------");
		System.out.println("�޸� ũ�� : " + Float.BYTES);
		System.out.println("Float �Ǽ��� �ּҰ� : " + Float.MIN_VALUE);
		System.out.println("Float �Ǽ��� �ִ밪 : " + Float.MAX_VALUE);
		System.out.println();
		// 1.4E-45 �� 1.4 X 10�� -45�� , 3.4028235E38�� 10�� 38��
		
		System.out.println("Double �Ǽ� ������ ---------------");
		System.out.println("�޸� ũ�� : " + Double.BYTES);
		System.out.println("Double �Ǽ��� �ּҰ� : " + Double.MIN_VALUE);
		System.out.println("Double �Ǽ��� �ִ밪 : " + Double.MAX_VALUE);
		System.out.println();
	}

}


/*   1.234 (����) * 10�� 23(����)�� 
 * 
 * �Ǽ� ������ �⺻ ���� : float ,double 
 * 	   Wrapper Ŭ������ Float, Double
 * 		1.234�� double �����Դϴ�.	
 */
