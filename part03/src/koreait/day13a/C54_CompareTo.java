package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		
		//String은 알파벳 (사전식 ) 비교 뺄셈으로 비교
		System.out.println("kim과 momo비교 : " + na.compareTo(you)); // -2 음수
		System.out.println("kim과 son" + na.compareTo(he));		//24 양수
		
		int a = 12, b = 45;
		System.out.println("a - b : " + (a - b));
	
		Integer aa = 12;
		Integer bb = 45;
		System.out.println("12와 45 : " + aa.compareTo(bb));
		aa = 90;
				
		System.out.println("90과 45 : " + aa.compareTo(bb));
		aa = 45;
		System.out.println("45과 45 : " + aa.compareTo(bb));
		
		// compareTo 와 같은 비교는 sort ( 정렬 ) 에 사용됩니다.
		// 정렬은 오름차순, 내림 차순 2가지 형태로 나타낼 수 있습니다.
		
	}

}
