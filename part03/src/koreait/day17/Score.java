package koreait.day17;

public class Score {
	private String name;
	private int korean;
	private int  english;
	private int  science;
	private String grade;
	
	public Score() {
		
	}
	
	public Score(String name, int korean, int english, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.science = science;
	}
	
	
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + getGrade() + "]";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	void setKorean(int korean) {
		this.korean = korean;
		
	}
	
	int getKorean() {
		return korean;
	}
	
	void setEnglish(int english) {
		this.english = english;
		
	}
	int getEnglish() {
		return english;
	}
	
	
	private void setGrade() {
		if(average() >= 90) this.grade = "A";
		else if (average() >= 80) this.grade = "B";
		else if (average() >= 70) this.grade = "C";
		else if (average() >= 60) this.grade = "D";
		else this.grade = "F";
		
	}
	
	String getGrade() {
		setGrade();
		return grade;
	}
	
	public int getScience() {
		return science;
	}
	
	public void setScience(int science) {
		this.science = science;
	}
	
	public int sum() {
		int result = this.korean + this.english + this.science;
		return result;
	}
	
	public double average() {
		return (double)sum()/3;
	}
}

