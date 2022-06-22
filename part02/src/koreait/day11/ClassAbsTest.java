package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		Person momo  = new Person();
//		ClassAbs abs = new ClassAbs();
		ClassAbs abs = new ClassX(); // 부모타입 참조
		ClassX cls = new ClassX(); // 자식 클래스 타입 참조
		abs.test();
		cls.test();
		abs.name = "손흥민";
		cls.name = "모모";
		abs.pront();
		cls.pront();
		cls.setNum(23);
		cls.test();
		ClassX x = (ClassX)abs;
		x.setNum(100);
		abs.test();
		
		
	}

}
