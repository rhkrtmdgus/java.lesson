package koreait.day10;

import koreait.day09a.Animal;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog();  // �� ĳ����
		Animal ani2 = new Cat();
		
//		Dog puddle = new Dog();
//		Crow crow = new Crow();
		
		animal(ani1);
		animal(ani2);
		
		animal(new Frog());
	}
	
	// ������
	// �޼ҵ� ���� Ÿ���� Animal > Dog, Crow, Frog, Cat ��ü ��� ����
	public static void animal(Animal animal) {
		animal.act();
		animal.print();
		
		System.out.println("Frog ? " + (animal instanceof Frog));
		
	}
	
	
}

	class Frog extends Animal {
		
		protected String mouth;
			
		
		public Frog() {
			System.out.println("���ο� ���������� Frog");
		}
		
		public void jump() {
			setName("������");
			setColor("�ʷ�");
			System.out.println("Ư¡ : ����");
			
		}
		
		@Override
		public void act() {
			System.out.println("���÷� ����");
		}
	}
	
	
	class Cat extends Animal {
		
		protected String eyes;
		
		public Cat() {
			System.out.println("���ο� ���������� �����");
		}
		
		public void sound() {
			setName("������");
			setColor("ȭ��Ʈ");
			System.out.println("Ư¡ : �߿˾߿�");
			
		}
		
		@Override
		public void act() {
			System.out.println("���÷� �߿��ϱ�");
		}

	}
