package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {

	public static void main(String[] args) {
		
		char [] carr1 = {'i', 'a', 'm', ' ', 'j', 'a', 'v', 'a'	}; //8 �� ���ڿ�
		char [] carr2 = new char[20];
		System.out.println("[[[[ char �迭 �׽�Ʈ - 1 ]]]]");
		System.out.println("carr1 : " + Arrays.toString(carr1));
		System.out.println("carr2 : " + Arrays.toString(carr2));
		System.out.println("carr1 �迭 ����(ũ��) : " + carr1.length);
		System.out.println("carr2 �迭 ����(ũ��) : " + carr2.length);
		System.out.println("carr1 �迭 3��° �������� ��(����) : " + carr1[2] );
		System.out.println("carr2 �迭 3��° �������� ��(����) : " + carr2[2] );
		
		System.out.println("carr1 �迭 3��° �������� ��(����) : " + (int)carr1[2] );
		System.out.println("carr2 �迭 3��° �������� ��(����) : " + (int)carr2[2] );
		
		System.out.println("\n[[[[ char �迭 �׽�Ʈ - 2 ]]]]");
		System.out.println("1. for������ ���");
		for (int i = 0; i < carr1.length; i++ ) {
			System.out.println("carr1[" + i + "] �� ������ �� : " + carr1[i]);
		}
		System.out.println("\n2.for������ ���");
		for (int i = 0; i < carr1.length; i++) {
			System.out.println(carr1[i]);
			
		}
		
		System.out.println("\n3. �迭 �̸� (������ ����) ���� ���");
		System.out.println(carr1);
		
		String msg = "iam java";
		System.out.println(msg);
		
		System.out.println("\n[[[[ char �迭 �׽�Ʈ - 3 ]]]]");
		System.out.println("4. ���ڿ��� �迭�� ����");
		carr2 = "hello hi good bye".toCharArray();
		
		
		
		
	}

}
