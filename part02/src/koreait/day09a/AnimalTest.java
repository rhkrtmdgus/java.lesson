package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print(); // ��ӹ��� �޼ҵ�
		System.out.println("------------------");

		
		
		System.out.println("------------------");
		Animal puppy = new Dog();
		puppy.print();
		
		Dog puddle = (Dog)puppy; // casting. (�ڽ� Ŭ������ ����)
		puddle.run();
		puddle.print();
		
		
	}

}
