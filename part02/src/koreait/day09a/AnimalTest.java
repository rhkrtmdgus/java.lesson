package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print(); // 상속받은 메소드
		System.out.println("------------------");

		
		
		System.out.println("------------------");
		Animal puppy = new Dog();
		puppy.print();
		
		Dog puddle = (Dog)puppy; // casting. (자식 클래스만 가능)
		puddle.run();
		puddle.print();
		
		
	}

}
