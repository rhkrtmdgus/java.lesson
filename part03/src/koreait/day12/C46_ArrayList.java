package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		int[] datas = {45, 23, 7, 21, 19, 11, 44};
		
		ArrayList<Integer> list = new ArrayList<>();
		//ArrayList 는 크기가 동적입니다.
		//데이터 타입은 참조형 타입만 입니다. 기본형은 래퍼클래스를 사용합니다.
		//<> 는 제너릭 타입이라고 부릅니다
		
		String[] names = {"쯔위", "모모", "신비", "은하", "나나"};
		ArrayList<String> name_list = new ArrayList<>();
		
		//ArrayList에 데이터 추가는 add() 메소드
		
		
		list.add(45);
		list.add(7);
		list.add(21); list.add(19); list.add(11); list.add(44);
		
		System.out.println("첫 번째 ArrayList<Integer> 출력");
		System.out.println(list);
		System.out.println("참고 (배열) : " + Arrays.toString(datas) + "배열 크기 : " + datas.length);
		System.out.println("리스트의 크기 : " + list.size());
		
		name_list.add("쯔위");
		name_list.add("모모");
		name_list.add("나나");
		name_list.add("은하");
		System.out.println("2. 두번째 ArrayList<String> 출력");
		System.out.println(name_list);
		System.out.println("리스트의 크기 : " + name_list.size());
		
		System.out.println("3. 특정 위치에 데이터 추가");
		list.add(1, 23);
		System.out.println("add(1, 23) 결과 : " + list);
		name_list.add(2, "신비");
		System.out.println("add(2, \"신비\" 결과 : " + name_list);
		
		System.out.println("4. 배열처럼 index 값으로 데이터 가져오기");
		System.out.println("get(3) : " + list.get(3));
		System.out.println("get(3) : " + name_list.get(3));
		
		System.out.println("5. 특정 위치의 데이터(요소) 제거 ");
		list.remove(4);
		System.out.println("remove(4) : " + list);
		name_list.remove(4);
		System.out.println("remove(4) : " + name_list);
		//Array 출력 참고 Tostring 메소드 사용
		
		System.out.println("\n6. 특정 값 위치를 알아내기 ('신비'는 몇번 인덱스 ? )");
		System.out.println("배열 : " + Arrays.binarySearch(names, "신비"));
		System.out.println("리스트 : " + name_list.indexOf("신비"));
		
		System.out.println("\n7. 6번의 실행내용을 for문으로 바꾼다면?");
		int i;
		for (i = 0; i < names.length; i++) {
			if(names[i].equals("신비"))
				break;
		}
		
		System.out.println("신비의 인덱스는 : " + i);
		
		i=0;
		System.out.println("리스트 출력");
		for (i = 0; i<name_list.size();i++)
			if (name_list.get(i).equals("신비")) {
				break;
			}
		System.out.println("신비의 인덱스 : " + i);
	
		
		// "신비" 요소가 여러 개일 때 리스트는 lastIndexOf 메소드로 ㅇ마지막 일치 요소를 찾을 수 있다.
		
		System.out.println("\n8. contains 메소드 ");
		System.out.println("나나가 리스트에 있는가? " + name_list.contains("나나"));
		System.out.println("다현이 리스트에 있는가? " + name_list.contains("다현"));
	}

}

/*
 * 배열 : 많은 양의 데이터를 저장하는 방법
 * 컬렉션(collections) : 자료구조
 */

