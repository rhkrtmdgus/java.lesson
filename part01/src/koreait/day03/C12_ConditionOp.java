package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
	// �ۼ��� : ������

	public static void main(String[] args) {
		int korean, math;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("���� ���� �Է�");
		korean = sc.nextInt();
		
		System.out.print("���� ���� �Է�");
		math = sc.nextInt();
		
		// �� ���깮
//		System.out.println("����л�? " + ((korean>=80 && math>=80)? "�½��ϴ�":"�ƴմϴ�"));
		
		// ���ǹ�
		//{} �� ��ɹ� ����̰� ���� ���� ��ɵ��� ���δ� ��ȣ
		// {}�� ��ɾ 1���� �� ���� ����
		if (korean>=80 && math>=80) {
			System.out.println("�½��ϴ�.");                                                                                
			
		}else {
			System.out.println("�ƴմϴ�.");
			
		}
		
		if(korean>=90 || math>=90) 
			System.out.println("�½��ϴ�");
		else
			System.out.println("�ƴմϴ�");
		
		// ���α׷��� ó��������  else{}�� �ش��ϴ� ������ ������ �ۼ� �� �մϴ�.
		if(!(korean >= 20 && korean <= 80)) {
			System.out.println("Ư���մϴ�.");
		}
	}

}
