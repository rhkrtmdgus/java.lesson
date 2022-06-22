package koreait.day06;

public class C32_ArrayManipulation {

	public static void main(String[] args) {
		
		int[] test = {11, 22, 33, 44, 55, 66, 77};
		
		
		//ÀÎµ¦½º 2¿¡ »ğÀÔÇÒ ¶§
		for(int i = test.length-2; i >= 2; i--) {
			test[i+1] = test[i];
			
		}
		// 
		
		
		
		test[2] = 23;
		for (int i = 0; i < test.length; i++)
			System.out.println(test[i] + "\t");
		
		
		
		
	}

}
