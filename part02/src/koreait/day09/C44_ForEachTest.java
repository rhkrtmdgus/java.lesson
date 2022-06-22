package koreait.day09;

public class C44_ForEachTest {

	public static void main(String[] args) {
		
		int[] itest = {1, 2, 3, 4, 5, 6};
		String[] stest = {"break", "public", "each", "package", "while"};
		
		for (int i = 0; i < itest.length; i++) {
			System.out.println("i" + i + ", itest[i] = " + itest[i]);
		}
		// temp 변수 사용
		for (int i = 0; i < stest.length; i++) {
			System.out.println("i" + i + ", itest[i] = " + stest[i]);
		}
		
		for (int i = 0; i < itest.length; i++) {
			System.out.println("i" + i + ", itest[i] = " + itest[i]);
		}

		
		for (int temp : itest) { // 배열에 저장된 값만 순서대로 꺼내서 temp에 저장 
			System.out.println(temp);
		}
		
		
		for (String temp : stest) {
			System.out.println(temp);
		}
		
	}

}
