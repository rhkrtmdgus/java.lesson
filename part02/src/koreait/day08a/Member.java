package koreait.day08a;
// �ۼ��� : ������

public class Member {
	public static void main(String[] args) {
		
	}
	private String name;
	private String email;
	private int age;
	private int level;
	
	Member(String name, String email) {
		this.name = name;
		this.email = email;
		
	}
	
	Member(){
		System.out.println("name, email, age, level �ʵ�� �⺻ ���Դϴ�.");
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void GetInstance() {
		
	}
	
}
