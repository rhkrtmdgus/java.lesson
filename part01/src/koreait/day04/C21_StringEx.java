package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
	public static void main(String[] args) {

		/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
		 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
		 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
		 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
		 *   
		 *   alt + shift + r ��ü �� ����
		 *   
		 */  
		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean check = true;
		
		System.out.print("�̸����� �Է��ϼ��� : ");
		email = sc.nextLine();
		System.out.println("-------------------------------------");
		int idx = email.indexOf('@');
		
		if (idx >= 0) {
			String del = email.substring(0, idx);
			String domainCheck = email.replace(del, "");
			if (domainCheck.equals("@gmail.com")) {
				if (del.indexOf("$") < 0 && del.indexOf("%") < 0) {
					System.out.println("���̵� ���� : " + del);
					if (del.length() >= 6) {
						System.out.println("--------------------------");
						System.out.println("�α��� ����");
					}
					else System.out.println("���̵� 6�� �̻��̿��� �մϴ�.");
				}
				else System.out.println("���̵� $, % �� ������ �� �����ϴ�.");
				
				
			}
			else System.out.println("�޽��� : �߸��� ������ �Դϴ�.");
		}
		else System.out.println("�޽��� : �̸��� ������ �ƴմϴ�.");
		
		sc.close();
		
		
		
		    
		
		
		
	}

}
