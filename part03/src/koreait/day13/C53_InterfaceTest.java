package koreait.day13;

public class C53_InterfaceTest {
	public static void main(String[] args) {
		
		MyClassX x1 = new MyClassX();
		MyClassY y1 = new MyClassY();
		MyClassZ z1 = new MyClassZ();
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();
		
		
// 참조 타입에 따른 메소드 실행 : z1, z2, z3이 어떤 메소드 실행가능한지?
		// 다형성 구현 예 : 메소드 인자 타입인 InterfaceA
		
		iAmethod(x2);
//		iAmethod(y2); // 오류 : InterfaceA 구현체가 아님
		iAmethod(z2);
		iAmethod(x1);
		iAmethod(z1);
//		iAmethod(z3); // 오류 : 변수 참조 타입이 B
		
		iBmethod(y1);
		iBmethod(y2);
		iBmethod(z1);
//		iBmethod(z2); // 변수 참조타입이 InterfaceA 라서 오류
		iBmethod(z3);
		
		z1.methodA();
		z1.methodB(23);
		z1.name("쯔위");
		
		z2.methodA();
		z2.methodB(23);
//		z2.name("쯔위");  오류 : InterfaceB의 추상 메소드ㅡ 
		
//		z3.methodA();	오류 : InterfaceA 추상 메소드ㅡ
//		z3.methodB(23); 오류 : InterfaceA의 추상 메소드ㅡ
		z3.name("쯔위");
		
// 캐스팅 : 다중 구현체의ㅡ 인터퓨ㅔ이스 타입 캐스팅
//		ㄴ MyClassZ는 InterfaceA와 InterfaceB 타입으로 모두 참조
		InterfaceB ib = (InterfaceB) z2;
		ib.name("쯔위");
		InterfaceA ia = (InterfaceA) z3;
		ia.methodA();
		ia.methodB(23);
		
		
	}
	
	public static void iAmethod(InterfaceA ia) {
		ia.methodA();
	}
	
	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("momo"));
	}
	
	
}
