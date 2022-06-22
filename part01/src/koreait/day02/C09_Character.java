package koreait.day02;

public class C09_Character {
	// 작성자 : 곽승현
	public static void main(String[] args) {
		
		char c1 = 'a';
		char c2 = 97; //문자 코드는 정수값.
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		 
		// int 로 Casting
//		System.out.printf("c1 = %d\n", c1);
		System.out.printf("c1 = %d\n", (int)c1);
		System.out.printf("c2 = %d\n", (int)c2);
		
		c1 = (char)(c1 + 1);
		System.out.println("c1 = "+ c1);
		
		c1++;
		System.out.println("c1 = " + c1);
		
		//한글 문자 테스트 : 한글 문자 코드는 10진수 값을 44032 ~ 55203, 16진수(2진수) ac00 ~ d7a3까지
		char h1 = '가';
		char h2 = 44032;
		char h3 = '\uac00'; // \\u 는 16진수 유니코드 표시, ac00은 16진수 값
		
		System.out.println("h1 = " + h1);
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		System.out.printf("h1 = %d\n", (int)h1);
		System.out.printf("h2 = %d\n", (int)h2);
		System.out.printf("h3 = %d\n", (int)h3);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		// 한글의 마지막 문자
		char h4 = 55203;  // 10진수 표현
		char h5 = '\ud7a3'; // 16진수 표현
		
		System.out.println("h4 = " + h4);
		System.out.println("h5 = " + h5);
		
		h4++;
		System.out.println("h4 = " + h4);  // 마지막 문자에 +1 하면 ?가 나옴
		
		h5--;
		System.out.println("h5 = " + h5);
		
		System.out.println('H'+'e'+'l'+'l'+'o'); //''< 때문에 코드값 연산이 ?
		System.out.println("H"+"e"+"l"+"l"+"o"); // 정상으로 Hello 출력 됨
		
		
	}
}

/*  주석처리 (코딩한거 ) ctrl + shift + /
 *  주석처리 / + * + enter
 * 
 *  기본형식 데이터 : 문자형 char
 *  문자데이터를 저장하는 2바이트 형식. 정수 값 0 ~ 65535 범위 저장도 가능합니다.
 *  컴퓨터에서 다루는 문자는 문자코드로 처리되는데 코드는 정수값입니다.
 *  문자데이터는 '' 기호를 사용합니다.
 *  
 *  영문자, 숫자, 특수문자 외의 다국어 문자는 문자를 처리하는 인코딩 방식에 따라
 *  문자코드값이 다릅니다. 국제화 인코딩으로 utf-8 방식을 많이 사용합니다.
 * 
 *  간 : ㄱ ㅏ ㄴ ( 초성, 중성, 종성 ) 각각의 코드 값으로 조합하는 조합형
 *  한글에서 나올 수 있는 모든 초성/중성/종성의 모든 표현을 만들어서 각각 코드 값을 부여하는 완성형
 * 
 */

