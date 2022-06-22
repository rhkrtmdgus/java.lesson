package koreait.day10;

import java.util.Arrays;

public class Person {
	
	private String name;
	private int age;
	private double id_code;
	private String[] hobbies;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getId_code() {
		return id_code;
	}
	
	public void setId_code(double id_code) {
		this.id_code = id_code;
	}
	
	public String[] getHobbies() {
		return hobbies;
	}
	
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id_code=" + id_code + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}
	
	
	
	
}
