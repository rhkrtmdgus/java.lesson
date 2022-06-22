package koreait.day02;

public class C07_CastingTest {

	public static void main(String[] args) {
		
	//	대입문 : 오른쪽 값(리터럴)/ 수식 / 변수가 왼쪽 변수로 대입.
	//  	
	//  산술 연산 + , - , * , / (나누기), % (나머지)	
	//  관계 연산 == (동등), != (같지 않다), >, < , >=, <=
	//  논리연산 && (그리고), || (또는), !(아니다)
	//  	
	
	// 정수형식 연산은 int
	
	int a = 123, b = 13;
	double c = 10.34;
	
	
	//연산에 사용되는 피연산자 (123, 13)가 모두 정수이면 결과는 정수
	//피연산자가 정수, 실수 경우라면 결과는 실수
	
	int isum;
	double dsum;
	
	isum = a + b;
	dsum = a + c;
			
	System.out.println("a + b = " + isum);
	System.out.println("a + c = " + dsum);
	
	// int = a + c; 는 오류 ( 결과가 실수이기 때문 )
	
	// 형변환 (casting) : 정수 + 실수 결과를 꼭 정수 변수로 저장해야 한다면 프로그래머가 강제로 변환해야함
    //   ㄴ ()안에 변환시킬 형식 추가	
	
	isum = a + (int) c;
	System.out.println("a + (int) c = " + isum);  // 실수에서 정수 변환시 소수점은 버림
	
	b = 10;
	System.out.println("a / b = " + a/b); // 정수끼리 나누면 결과 정수
	System.out.println("a / b = " + a%b); // 정수끼리 나누기의 나머지도  정수
	
	System.out.printf("%d / %d = %d\n", a, b, a/b);
	System.out.printf("%d %% %d = %d%n", a, b, a%b); // %를 넣으려면 %% 두개 넣는다.
	
	b = 11;
	System.out.printf("%d / %d = %.2f\n", a, b, a/(double)b); //기본 소수점 이하 6자리 출력 (반올림)
	
	double test = 12.3456127456789;
	System.out.println("test = " + test);
	System.out.printf("test = %f\n", test); // %f 소수점 6자리에서 반올림 됨
	System.out.printf("test = %.15f\n", test);
	
	
	
	}

}
