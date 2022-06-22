package koreait.day07;

public class Student {
	
	int no;
	String name;
	int grade;
	Score score;
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade + ","
				+ " score=" + score + "]";
	}
	
	void setData(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	
}
