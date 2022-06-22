package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * �л� ����(����) ���� ������ ����ϴ�.
		 * �л� �ο��� 100�� = ������ ���������� �׽�Ʈ (0<= ���� <= 100)
		 * 
		 * 90~100 : 0�� (�Ҽ��� 1�ڸ� %)
		 * 80~89 : 0�� (�Ҽ��� 1�ڸ� %)
		 * 70~79 : 0�� (�Ҽ��� 1�ڸ� %)
		 * 60~69 : 0�� (�Ҽ��� 1�ڸ� %)
		 * 60�̸� : 0�� (�Ҽ��� 1�ڸ� %)
		 * 
		 * 
		 */
		
		int [] koreans = new int [300];
		int [] counts = new int [5];
		Random r = new Random();	
		
		for (int i = 0; i < koreans.length; i++) {
			koreans[i] = r.nextInt(101);
			if (koreans[i] >= 90)
				counts[0] += 1;
			else if (koreans[i] >= 80 && koreans[i] <= 89)
				counts[1] += 1;
			else if (koreans[i] >= 70 && koreans[i] <= 79)
				counts[2] += 1;
			else if (koreans[i] >= 60 && koreans[i] <= 69)
				counts[3] += 1;
			else counts[4] += 1;
	
		}
		
		int a = counts[0];
		int b = counts[1];
		int c = counts[2];
		int d = counts[3];
		int e = counts[4];
		
		
		
		System.out.printf("���������� 90~100 ���� �л� �� : %d (���� %.1f %%)", a, (double)a/koreans.length*100);
		System.out.println();
		System.out.printf("���������� 90~100 ���� �л� �� : %d (���� %.2f %%)", b, (double)b/koreans.length*100);
		System.out.println();
		System.out.printf("���������� 90~100 ���� �л� �� : %d (���� %.2f %%)", c, (double)c/koreans.length*100);
		System.out.println();
		System.out.printf("���������� 90~100 ���� �л� �� : %d (���� %.2f %%)", d, (double)d/koreans.length*100);
		System.out.println();
		System.out.printf("���������� 90~100 ���� �л� �� : %d (���� %.2f %%)", e, (double)e/koreans.length*100);
		
		
		
		
			
	}

}
