package koreait.day05;

import java.util.Scanner;

public class C27_ArrayTest {
	// 작성자 : 곽승현
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] nums = new int [5];
		int sum = 0;
		double average = 0;
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("nums["+ i + "] 의 배열 값(정수)을 쓰시오 : ");
			nums[i] += sc.nextInt();
			int a = nums[i];
			sum += nums[i];
			
		}
			average = sum / nums.length;
			
		
		System.out.println("배열 총 합계는 ? " + sum);
		System.out.println("배열 값 평균은? " + average);   
		
		int max = maxOfArray(nums);
		int min = minOfArray(nums);
		System.out.println("배열 최대값 : " + max);
		System.out.println("배열 최소값 : " + min);
		
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

