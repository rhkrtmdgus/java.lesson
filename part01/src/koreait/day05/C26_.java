package koreait.day05;

import java.util.Scanner;

public class C26_ {

		// �ۼ��� : ������
	public static void main(String[] args) {
		
		
		//�������� : ���� ������ ����/���/�ܰ���ȸ ����
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sel;
		int balance = 0; //�ܾ�
		
		while(run) {
			int money;
			System.out.println("������������������������������������������������������������������������������");
			System.out.println("| 1.���� | 2.��� | 3.�ܰ� Ȯ�� | 4.����          |");
			System.out.println("������������������������������������������������������������������������������");
			System.out.print("�޴� ���� : ");
			sel = sc.nextInt();
			
			switch (sel) {
			case 1:  // ����ó��
					System.out.print("���ݾ� : ");
					money = sc.nextInt();
					balance += money;
					
					System.out.println("������ �ܾ��� " + balance + "�� �Դϴ�. ");
					break;
			case 2:	// ���ó��
					System.out.print("��ݾ� : ");
					money = sc.nextInt();
					if (balance >= money) {
						balance -= money;
						System.out.println("������ �ܾ��� " + balance + "�� �Դϴ�. ");
						break;
					}
					else
						System.out.println("�ܾ��� �����մϴ�.");
					break;
					
			case 3: //�ܰ� ���
					System.out.println("���� �ܰ� " + balance + "�� �Դϴ�.\n");
					break;
			
			case 4: //����
				
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
					break;
			
			default:
					System.out.println("�߸��� �����Դϴ�. 1~4 �޴� �߿� �����ϼ���");
					continue;
					
			}
			
			System.out.println("------------end------------");
			
		}
		
	}

}
