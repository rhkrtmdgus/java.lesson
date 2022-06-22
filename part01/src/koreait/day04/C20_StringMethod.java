package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message = "gmail.com";
//		message.length();
//		message.charAt(0);
//		message.equals("hello~");
		
//		int len = message.length();
//		char temp = message.charAt(3);
		boolean isState = message.equals("llo~");
//		
//		System.out.println("length() = " + len);
//		System.out.println("charAt(3) = " + temp);
//		System.out.println("equals(\"Hello\") = " + isState);
		
//		message.indexOf('e');
//		message.indexOf("lo");
//		message.substring(2);
//		message.substring(2, 4);
//		message.replace("11", "*@");
		
		String test = "hello~hello~";
		
		System.out.println("test.indexOf('e') = " + test.indexOf('e'));
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("lo"));
		System.out.println("test.lastIndexOf(\"lo\") = " + test.lastIndexOf("lo"));
		System.out.println("substring(2) = " + message.substring(2));
		System.out.println(message.length());
		System.out.println("substring(2, 4) = " + message.substring(2, 8));
		System.out.println("substring(2, 4) = " + message.substring(2, message.length()));
		System.out.println("replace(\"ll\", \"*@\") = " + message.replace("ll", "*@"));
		
		//String 메소드 : 찾기,마지막 찾기, 부분추출, 치환, 시작끝 불린, 같은 찾기 불린, 길이, 앞부터 파악
		System.out.println(isState);
	}

}
