package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("모모", 27)); //새로운 객체 생성하고 참조 값을 리스트에 추가
		Member member  = new Member("다현", 26); // 변수에 저장하여 객체 생성
		list.add(member);
		list.add(new Member("나나", 20)); //새로운 객체 생성하고 참조 값을 리스트에 추가
		list.add(new Member("신비", 22)); //새로운 객체 생성하고 참조 값을 리스트에 추가
		System.out.println("현재 list의 요소 개수 : " + list.size());
		System.out.println("1. 전체 리스트 출력");
		System.out.println(list);
		//list.get(i) > Member 객체의 참조값
		System.out.println("2. list의 요소 중 age 필드 값이 25이하 인 것만 출력해보기");
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAge() <= 25)
				System.out.println("i= " + i + "," + list.get(i));
		}
		
		System.out.println("3. \"나나\"는 몇번 인덱스에서 참조하고 있는 객체 인가?");
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("나나")) {
				System.out.println("출력 : " + i);
				break;
			}
		}
		
		//리스트 요소가 여러 개의 필드를 갖는 객체이면 필드 값 비교하는 equals 예제입니다.
		//						indexOf는 String, 기본형 래퍼 클래스만 사용합니다.
			
		System.out.println("Member 객체로 indexOf 실행 : " + list.indexOf(new Member("나나", 20)));
		
		
		
		
		
		
	}

}
