package koreait.day10;

import koreait.day09a.Animal;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog();  // 업 캐스팅
		Animal ani2 = new Cat();
		
//		Dog puddle = new Dog();
//		Crow crow = new Crow();
		
		animal(ani1);
		animal(ani2);
		
		animal(new Frog());
	}
	
	// 다형성
	// 메소드 인자 타입이 Animal > Dog, Crow, Frog, Cat 객체 모두 가능
	public static void animal(Animal animal) {
		animal.act();
		animal.print();
		
		System.out.println("Frog ? " + (animal instanceof Frog));
		
	}
	
	
}

	class Frog extends Animal {
		
		protected String mouth;
			
		
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
			System.out.println("수시로 점프");
		}
	}
	
	
	class Cat extends Animal {
		
		protected String eyes;
		
		public Cat() {
			System.out.println("새로운 동물가족은 고양이");
		}
		
		public void sound() {
			setName("개구리");
			setColor("화이트");
			System.out.println("특징 : 야옹야옹");
			
		}
		
		@Override
		public void act() {
			System.out.println("수시로 야옹하기");
		}

	}
