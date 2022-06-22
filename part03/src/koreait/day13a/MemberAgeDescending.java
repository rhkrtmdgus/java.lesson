package koreait.day13a;

import java.util.Comparator;

public class MemberAgeDescending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
				
		return age2.compareTo(age1); //내림차순
	}

	
	
}

class MemberNameDescending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name2.compareTo(name1);
	}
	
}
/* 리턴식은 음수값이 나오는 경우를 씁니다. 교환하지 않는 경우를 -1(음수)로 리턴되게 합니다.
 * 각각 교환하지 않는 경우는 
 *오름차순 : o1 < o2    	//내림차순 : o1 > o2 
*/
