package koreait.day05;

import java.util.Scanner;

public class C27_ArrayTest {
	// �ۼ��� : ������
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] nums = new int [5];
		int sum = 0;
		double average = 0;
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("nums["+ i + "] �� �迭 ��(����)�� ���ÿ� : ");
			nums[i] += sc.nextInt();
			int a = nums[i];
			sum += nums[i];
			
		}
			average = sum / nums.length;
			
		
		System.out.println("�迭 �� �հ�� ? " + sum);
		System.out.println("�迭 �� �����? " + average);   
		
		int max = maxOfArray(nums);
		int min = minOfArray(nums);
		System.out.println("�迭 �ִ밪 : " + max);
		System.out.println("�迭 �ּҰ� : " + min);
		
	}
		
		
	public static int maxOfArray(int[] array) {
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
		
	public static int minOfArray(int[] array) {
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
	
	
		
		
		
		
		
		
		
	

}

