package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		Person momo  = new Person();
//		ClassAbs abs = new ClassAbs();
		ClassAbs abs = new ClassX(); // �θ�Ÿ�� ����
		ClassX cls = new ClassX(); // �ڽ� Ŭ���� Ÿ�� ����
		abs.test();
		cls.test();
		abs.name = "�����";
		cls.name = "���";
		abs.pront();
		cls.pront();
		cls.setNum(23);
		cls.test();
		ClassX x = (ClassX)abs;
		x.setNum(100);
		abs.test();
		
		
	}

}
