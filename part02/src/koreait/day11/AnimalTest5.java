package koreait.day11.test;

import java.sql.Time;

public class AnimalTest5 {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("개굴A");
		animals[4] = new Frog();
		animals[4].setName("개굴B");
		animals[6] = new Crow();
		
		for(Animal temp : animals)
			if(temp != null) {
				temp.act(); 
			}	
		
		//개구리가 몇마리인지..... instanceof
		int cnt=0;		//카운트 변수
		System.out.println("개구리 먹이주기 .................");
		for(Animal te  mp : animals) {
			if(temp != null && temp instanceof Frog ) {
				cnt++;
				System.out.println(temp.eat(100*(cnt+2)));
			}
		}
		System.out.println("개구리는 " + cnt +" 마리 살고 있습니다.");
		
		
		Time
		
		start = System.nanoTime();
		
	}
}

class Frog extends Animal{	//개구리

	protected String mouth;  //디폴트 한정자+다른패키지 자식클래스
	public Frog() {
		System.out.println("새로운 동물가족은 Frog");
	}
	
	public void jump() {
		setName("개구리");
		setColor("초록");
		System.out.println("특징 : 점핑");
	}
	
	@Override		
	public void act() {		
//			super.act();	//추상클래스 부모 act() 실행 못합니다.
			System.out.println("Animal 행동 : 수시로 점핑하기 ");
	}
	
	@Override
		public String eat(Object object) {
			return "unknown : " + object;
		}
}
class Cat extends Animal{
	protected String eyes;
	public Cat() {
		System.out.println("새로운 동물가족은 cat" );
	}
	public void sound() {
		setName("고양이");
		setColor("화이트");
		System.out.println("특징 : 야옹야옹");
	}
	@Override
	public void act() {
		System.out.println("Animal 행동 : 수시로 야옹야옹 울기 ");
	}
	
	@Override
	public String eat(Object object) {
		return null;
	}
}