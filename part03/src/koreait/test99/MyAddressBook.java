package koreait.test99;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyAddressBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Person> myadd = new ArrayList<>();
		String name, mo, biu;
		int gr;
		int cnt = 0;
		
		boolean is = true;
		
		System.out.println("선택 기능 ☞  [n]새연락처 저장\t   [s]연락처 찾기\t   [g]그룹 선택 보기\t   [a]전체보기\t   [e]프로그램 끝내기");
		while(is) {
			
			
			System.out.print("선택 >> " );
			
			switch (sc.nextLine()){
				case "n":
					System.out.print("이름 입력 -> ");	
					name = sc.nextLine();
					System.out.print("휴대 번호 -> ");	
					mo = sc.nextLine();
					System.out.print("그룹(1:친구, 2:가족, 3:비지니스) -> ");
					gr = Integer.parseInt(sc.nextLine());
					myadd.add(new Person(name, mo, gr));
					break;
	
				case "s":
					System.out.print("검색 이름 -> ");
					name = sc.nextLine();
					for (Person temp : myadd) {
						if (temp.getName().equals(name)) {
							cnt += 1;
							System.out.println(temp.toString());
							System.out.println(cnt + " 건이 검색되었습니다.");
						}
					}
					cnt = 0;
					break;
					
					
				case "g":
					System.out.print("그룹 선택(1: 친구, 2:가족, 3:비지니스) -> ");
					int no = Integer.parseInt(sc.nextLine());
					
						levela(myadd,no);
					
					break;
				case "a":
					biu = sc.nextLine();
					System.out.print("그룹 선택(1: 친구, 2:가족, 3:비지니스) -> ");
					all(myadd);  //정렬하고 출력
					break;
	
				case "e":
					sc.close();
					is = false;
					break;
	
	
				default:
					
					System.out.println("잘못 입력된 선택입니다. 메뉴에 맞는 알파벳 입력하세요..");
					continue;
				}
			}

			System.out.println("종료 합니다");
			
		
	}



	private static void levela(List<Person> myadd, int no) {
		
		for (Person dd : myadd) {
			if (dd.getGroup() == no) {

				System.out.println(dd.toString());
		
			}
		}

	}



	private static void all(List<Person> myadd) {  //mywords 의 참조 값 전달받아 동일한 객체를 가리킵니다.
		myadd.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
	
		System.out.println("연락처 전체 목록");
		System.out.println(String.format("%-20s %-20s %10s", "이름", "휴대 전화\n"));
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (Person yy : myadd) {
			System.out.println(String.format("%-20s %-20s %10d", yy.getName(), yy.getMobile()));
	
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
	}
}
