package koreait.day16;

import java.util.Scanner;

public class C69_MyExceptionTest {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("���̸� �Է� >>> ");
		try {
			int age = Integer.parseInt(sc.nextLine());
			if (age < 0 || age > 100) 									
					throw new AgeException("������ ������ 0~ 100�Դϴ�."); // Ŭ���� ��� ���� ���� , Ŭ�������� �߰����� ������ ���� ��
					//throw new Exception("������ ������ 0~ 100�Դϴ�.");  �޽����� �ٲ� ��
			System.out.println("����� ���̴� " + age + "�� �½��ϱ�?");
			if(age == 0)
				throw new NullPointerException();
			
		} catch (NumberFormatException e) {
			System.out.println("���̴� ���ڸ� �Է��ϼ���");
		}catch (Exception e) {
			System.out.println("����� ���� ���� : " + e.getMessage());
		}
		
		
		
				
	}

}



// ����� Exception�� ����ϴ�.  : Exception ���
class AgeException extends Exception{
	
	
	//Serializable �������̽��� ���õ� ��
	private static final long serialVersionUID = 1L;
	
	//����ڰ� ���Ƿ� �޽����� ���� �� �ֽ��ϴ�.
	public AgeException(String message) {
		super(message); // Exception�� message �ʵ带 ����
	}
	
}