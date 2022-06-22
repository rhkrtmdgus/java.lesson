package koreait.day13a;

// ��ü�� �� �ι�° ��� : ���� �� �ִ� Ÿ������ �����. Comparable<User> �������̽� ����
public class User implements Comparable<User>{
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(User o) {
		Integer o1 = this.age;
		Integer o2 = o.getAge(); // ���� ��ü�� age�� ���ڰ� age ��
		
		return o1.compareTo(o2);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
}
