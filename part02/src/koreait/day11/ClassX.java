package koreait.day11;

public class ClassX extends ClassAbs{
	private int num;
	@Override
	public void test() {
		System.out.println("ClassX의 test()");
		System.out.println("num = " + num );
	}
	// 하위 클래스는 추상메소드 재정의 해야합니다

	
	public void setNum(int num) {
		this.num = num;
	}
	

}

