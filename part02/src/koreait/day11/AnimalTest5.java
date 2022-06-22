package koreait.day11.test;

import java.sql.Time;

public class AnimalTest5 {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("����A");
		animals[4] = new Frog();
		animals[4].setName("����B");
		animals[6] = new Crow();
		
		for(Animal temp : animals)
			if(temp != null) {
				temp.act(); 
			}	
		
		//�������� �������..... instanceof
		int cnt=0;		//ī��Ʈ ����
		System.out.println("������ �����ֱ� .................");
		for(Animal te  mp : animals) {
			if(temp != null && temp instanceof Frog ) {
				cnt++;
				System.out.println(temp.eat(100*(cnt+2)));
			}
		}
		System.out.println("�������� " + cnt +" ���� ��� �ֽ��ϴ�.");
		
		
		Time
		
		start = System.nanoTime();
		
	}
}

class Frog extends Animal{	//������

	protected String mouth;  //����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
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
//			super.act();	//�߻�Ŭ���� �θ� act() ���� ���մϴ�.
			System.out.println("Animal �ൿ : ���÷� �����ϱ� ");
	}
	
	@Override
		public String eat(Object object) {
			return "unknown : " + object;
		}
}
class Cat extends Animal{
	protected String eyes;
	public Cat() {
		System.out.println("���ο� ���������� cat" );
	}
	public void sound() {
		setName("�����");
		setColor("ȭ��Ʈ");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	@Override
	public void act() {
		System.out.println("Animal �ൿ : ���÷� �߿˾߿� ��� ");
	}
	
	@Override
	public String eat(Object object) {
		return null;
	}
}