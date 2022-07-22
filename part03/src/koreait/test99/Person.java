package koreait.test99;

public class Person {
	static final int FRIENDS = 1;
	static final int FAMILY = 2;
	static final int BUSINESS = 3;
	
	private String name;
	private String mobile;
	private int group;
	
	
	
	
	public Person(String name, String mobile, int group) {
		this.name = name;
		this.mobile = mobile;
		this.group = group;
	}

	
	@Override
	public String toString() {
		return "[name=" + name + "] mobile=" + mobile + ", 그룹 =" + (group == 1?"친구"
				:group == 2?"가족":"비지니스");
	}
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setGroup(int group) {
		this.group = group;
	}
	
	public int getGroup() {
		return group;
	}
	
	
	
	
	
	
}
