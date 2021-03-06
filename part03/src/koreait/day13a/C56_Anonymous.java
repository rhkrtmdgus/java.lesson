package koreait.day13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;


// 익명 클래스 : 1회용 클래스 (현재 클래스 에서만? )
public class C56_Anonymous {

	public static void main(String[] args) {
		
		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println("I am anonymous.!!");
				
				return 1234;
			}
			
			@Override
			public void methodA() {
				System.out.println("익명 InterfaceA methodA");
			}
		};
		
		
		InterfaceB ib = new InterfaceB() {
			
			@Override
			public String name(String name) {
				// TODO Auto-generated method stub
				return "익명 내부 클래스 : " + name;
			}
		};
		
		ia.methodA();
		ia.methodD("하이 ~~");
		InterfaceA.methodC();
		System.out.println("상수 : " + InterfaceA.SIZE);
		System.out.println(ib.name("테스트"));
		
		
		
	}

}
