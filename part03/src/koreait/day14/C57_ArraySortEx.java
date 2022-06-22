package koreait.day14;

import java.util.Arrays;

public class C57_ArraySortEx {

	public static void main(String[] args) {
		
		
 		int[] nums = {3, 46, 77, 2, 99, 21};
		int temp = 0;
		
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i <= nums.length-2; i++ ) { //4¹ø
			for (int j = i+1; j <= nums.length-1; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					
					
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
