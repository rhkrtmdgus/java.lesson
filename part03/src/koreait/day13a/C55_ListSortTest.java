package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C55_ListSortTest {

	public static void main(String[] args) {
		//List는 인터페이스, ArrayList 는 구현체
		//다형성 : List를 참조타입으로 하여 선언합니다. 앞으로 배울 라이브러리들이 List타입으로 원하기 때문에ㅣ
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		//sort와 관련된 인터페이스 사용.
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort 이전 : " + ilist);
		//정렬 오름차순
		ilist.sort(null);  //인자로 필요한 것은 비교자 Comparator 구현체 필요
						  // 기본형, String은 null 로 할 수 있다. (오름차순 기준)
		System.out.println("sort 이후 : " + ilist);

		//정렬 내림차순
		ilist.sort(Comparator.reverseOrder()); //역순, Comparator 인터페이스
		System.out.println("내림차순 sort 이후 : " + ilist);
		
		slist.add("히왁굳");
		slist.add("고세구");
		slist.add("징버거");
		slist.add("릴파");
		slist.add("비챤");
		slist.add("아이네");
		slist.add("주르르");
		
		System.out.println("sort 이전 : " + slist);
		slist.sort(null);
		System.out.println("sort 이후 (ASCEnding) : " + slist);
		slist.sort(Comparator.reverseOrder()); 
		System.out.println("내림차순 이후 (DESCending) : " + slist);
		
		
		System.out.println("1. comparator  사용");
		List<Member> mlist = new ArrayList<>();
		mlist.add(new Member("segu", 23));
		mlist.add(new Member("lilpa", 27));
		mlist.add(new Member("burger", 25));
		mlist.add(new Member("wakgood", 29));
		mlist.add(new Member("ine", 26));
		mlist.add(new Member("bichan", 27));
		
		
		System.out.println("member 리스트 상태 : " + mlist);
//		mlist.sort(null); // 오류 : Member 객체는 비교할 수 없는 객체 > 비교자 인터페이스를 인자로 해야함
		System.out.println("member sort 확인 : " + mlist);
		
		mlist.sort(new MemberAgeAscending());
		System.out.println("sort 확인" + mlist);
//		mlist.sort(new MemberAgeDescending());
//		System.out.println("sort 확인 " + mlist);
//		
//		mlist.sort(new MemberNameAscending());
//		System.out.println("sort 확인 " + mlist);
//		mlist.sort(new MemberNameDescending());
//		System.out.println("sort 확인 " + mlist);
		
		System.out.println("\n2. comparable 인터페이스 사용하는 sort");
//		
		
		List<User> ulist = new ArrayList<User>();
		ulist.add(new User("세구", 23));
		ulist.add(new User("비챤", 27));
		ulist.add(new User("버거", 25));
		ulist.add(new User("릴파", 29));
		ulist.add(new User("이네", 26));
		ulist.add(new User("르르", 27));
		
		System.out.println("user 리스트 상태 : " + ulist);
// User는 비교할 수 있는 타입 : Comparable 구현체 ( Comparable 안에 구현체가 있어서? )
		ulist.sort(null);
		System.out.println("user sort(ASC) : " + ulist);
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort(DESC) : " + ulist);
		
		
		ulist.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			
			}
		}); // 메소드 인자로 익명 클래스를 정의해서객체를 생성.
		
		System.out.println("user sort(ASC) : " + ulist);
		
		
		
		
		
		
		
		
	}

}
