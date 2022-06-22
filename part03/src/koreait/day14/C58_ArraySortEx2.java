package koreait.day14;

import java.util.Arrays;

public class C58_ArraySortEx2 {

	public static void main(String[] args) {
		
		//문자열 배열 정렬 알고리즘
		
		String [] names = {"세구", "버거", "릴파", "비챤", "이네", "르르"};
		String temp = "";
		
		System.out.println(Arrays.toString(names));
		
		for(int i = 0; i < names.length-1; i++ ) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(names));
	}

}
