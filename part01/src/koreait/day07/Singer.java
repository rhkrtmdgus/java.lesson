package koreait.day07;

import java.util.Arrays;

public class Singer {
	
	String genre;
	String name_eng;
	String name_kor;
	int debutYear;
	String[] members;
	
	static final String JOB = "연예인";
	static String label = "◎";
	
	
	
	
	void printMembers() {
		if (members == null) {
			System.out.println("그룹이 아닌 솔로 가수 입니다.");
		}
		else 
			for (int i = 0; i < members.length; i++) {
				if (members[i] != null)
					System.out.println((i+1) + ":" + members[i]);
			}
		
			
	}	
	
	int actYears(int year) {
		return year-debutYear+1;
		
	}
	
	@Override
	public String toString() {
		return "singer [genre=" + genre + ", name_eng=" + name_eng + ", name_kor=" + name_kor + ", debutYear="
				+ debutYear + "]";
		
		
	}
}	