package koreait.day09a;

public class Animal {
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("���ο� Animal ������ ������ϴ�.");
	}
	
	public void act() {
		System.out.println("Animal �ൿ : ������");
	}
	
	public void print() {
		System.out.println("name : " + name + ", color : " + color);
	}

	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
