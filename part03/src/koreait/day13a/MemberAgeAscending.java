package koreait.day13a;

import java.util.Comparator;

public class MemberAgeAscending implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
			
		if (age1 == age2)
			return o1.getName().compareTo(o2.getName());
		else
			return age1.compareTo(age2);
		
	}
		// age 필드 (1차 기준) 값이 같을 때 name필드 (2차 기준) 오름차순으로 정렬.
		
		
	
	
	
	
	
	
	
	
}


class MemberNameAscending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);
	}
	
}
