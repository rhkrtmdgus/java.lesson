package koreait.day12;

import java.util.HashMap;

public class C50_HashMap {
	public static void main(String[] args) {
		
		String[] title = {"스파게티", "스테이크", "샐러드"};
		int[] price = {12000, 22000, 7000};
		
		HashMap<String, Integer> menus = new HashMap<>();
		
		//HashMap 데이터 저장 함수
		menus.put("스파게티", 12000);
		menus.put("스테이크", 22000);
		menus.put("샐러드", 7000);
		
		System.out.println("1. 저장된 데이터 출력");
		System.out.println(menus);
		
		
		//데이터 접근(읽기) get()
		System.out.println("2. 특정한 key값의 value 출력");
		System.out.println("스파게티의 가격? " + menus.get("스파게티"));
		System.out.println("스파게티의 가격? " + menus.get("스테이크"));
		System.out.println("스파게티의 가격? " + menus.get("샐러드"));
		
		//key 값 중복되면?
		menus.put("샐러드", 8200);
		System.out.println(menus);
		
		
		//데이터 삭제 : remove()
		System.out.println("3. 특정 요소 삭제");
		menus.remove("스테이크");
		System.out.println("삭제 결과 : " + menus);
		System.out.println(menus.remove("샐러드", 8200));
		System.out.println("삭제 결과 : " + menus);
		
		
		
	}
}

/*ArrayList : 순차적(인덱스로 접근) 으로 데이터를 관리하는 자료구조입니다.배열과 유사한 구조입니다.
HashMap : 순차적인 구조가 아닙니다. 인덱스를 사용하지 앖고 Key 값을 이용하여 데이터접근하여 저장/읽기 합니다.
			*검색*이 많은 알고리즘에 유용합니다. 
  		제너릭 타입은 K:Key , V:Value 한쌍입니다.
 ArrayList 와 마찬가지로 int,long,double 기본형 타입 대신에 래퍼(wrapper)클래스로 표기합니다.
*/
