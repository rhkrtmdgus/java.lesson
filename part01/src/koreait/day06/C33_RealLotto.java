package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
	// �ۼ��� : ������
	public static void main(String[] args) {
		
		int[] numbers = new int[45];   
		Random r = new Random();       // ���� �޼ҵ� ��ü ����
		
		for (int i = 0; i < 45; i++) { 
			numbers[i] = i + 1;		   // �ε��� 0������ �ε��� 44���� �� 1~ 45���� ��ȣ ����
		}
		
		System.out.println("numbers �迭 �ʱ� �� -----------------------------------------");
		System.out.println(Arrays.toString(numbers));  // �ζ� ��ȣ 45������ StringŸ������ ���
		System.out.println("------------------------------------------------------------");
		
		int [] lotto = new int[6]; // 6���� ��Ʈ Ÿ�� �迭 ����
		int k;
		for (int cnt = 0; cnt < 6; cnt++) { // 6�� �̱�
			k = r.nextInt(45-cnt); // �� 45�� �߿� �������� k�� ���� �� 1���� �� ���� ����
			System.out.println("k = " + k + ", number = " + numbers[k]); // ������ ���
			
			lotto[cnt] = numbers[k]; // ���� ��ȣ ���� ���� ��ȣ �迭�� �Է� 
			
		
			for (int i = k; i < numbers.length-1; i++) {
				numbers[i] = numbers[i + 1]; // �ε��� ���� + 1 �ؼ� �ε����� ���� ���� ����
			}
			System.out.println(Arrays.toString(numbers)); // String Ÿ������ ���
		}
		
		System.out.println("���� ���� ���� : ");
		System.out.println(Arrays.toString(numbers)); // ���� ���� ���
		
		Arrays.sort(lotto); // ũ�� ����
		System.out.println(Arrays.toString(lotto)); // string Ÿ������ ���
		
		
		
	}

}
