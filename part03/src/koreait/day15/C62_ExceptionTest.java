package koreait.day15;

import java.util.Scanner;

public class C62_ExceptionTest {

	public static void main(String[] args) {
		
//		int a = 4.1;
	
//		//Exception 1
//		String message = null;
//		char temp = message.charAt(0);  //message ���ڿ����� ù��°(0) ���� 1�� �����ɴϴ�.
//		
//		
//		//Exception ����2
//		int[] nums = new int[5];		//�迭���� : ��� 5���Դϴ�.
//		nums[5] =100;
//				
		//Exception ����3
		Scanner sc = new Scanner(System.in);
		//int aa = sc.nextInt();			//Ű�����Է��� ������ ��ȯ�ؼ� ������ �����մϴ�.
		
		int aa = Integer.parseInt(sc.nextLine());
		
		System.out.println("dadw" + aa);

		
	
		
	}
	
	

}


/*
Exception ��� : ���������� �ƴմϴ�. �����ϸ鼭 �߻��ϴ� ���� �Դϴ�.(�߻����ɼ��� ����ؼ� ���α׷����ؾ��մϴ�.)
     -> ���ο� ���� �ٸ��̸� XXXXException �� �߻��ϰ� �̵��� Exception Ŭ������ �ڽ� Ŭ�����Դϴ�.
     -> Exception �� ���� �߿� �߻��ϸ� �� ���Ĵ�?..... ���α׷��� �� �������� �ߴܵ˴ϴ�. 
         ����, Exception �� �����ϰ� ���α׷��� �ߴܵ��� �ʵ��� ���α׷� ������ �ؾ��մϴ�.
*/