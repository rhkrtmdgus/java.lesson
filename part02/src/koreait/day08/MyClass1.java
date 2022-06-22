package koreait.day08;

public class MyClass1 {

	private int age; // 사적인.
	String name;
	public double point;
	
	
	
	
	void setAge(int age) {
		this.age = age;
		
	}
	
	int getAge() {
		return age;
	}
	
	/*
	 *  private int age;			//private  : 다른 클래스에서 사용 못합니다. 나(현재 클래스)만 사용한다.
		String name;				//default(package)  : 다른 패키지에서 사용 못합니다. 이웃이면 같이쓰자.
		public int score;			//public   : 어디서나 사용합니다.공공의,공용의... 다같이 쓰자.

	 *  private , default, protected, public은 
	 *  변수(필드),메소드,생성자, 클래스 등에 사용되는 접근한정자 입니다.(클래스는 접근한정자 default,public 만 사용합니다.)
	 */

	
}
