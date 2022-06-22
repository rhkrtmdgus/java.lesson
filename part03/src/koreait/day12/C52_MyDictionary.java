package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		
		//HashMap<String, String> dic = new HashMap<>();
		TreeMap<String, String> dic = new TreeMap<>(); // 정렬이 되는 Map
		
		
		Scanner sc = new Scanner(System.in);
		boolean is = true;
		
		while (is) {
			System.out.println("선택 기능 ☞  1. 단어저장 2.단어검색 3.단어장 보기 4.프로그램 끝내기");
			System.out.print("선택 >> " );
						
			switch (sc.nextLine()){
				case "1":
					System.out.print("English -> ");	
					String e = sc.nextLine();
					System.out.print("korean -> ");	
					String k = sc.nextLine();
					dic.put(e, k);
					break;
							
				case "2":
					System.out.print("English -> ");
					String en = sc.nextLine();
					System.out.println("검색했습니다 결과>> " + dic.get(en));
					break;
				case "3":
					System.out.println("단어장 전체보기 : " + dic);
					break;
					
				case "4":
					sc.close();
					is = false;
					break;
					
				default:
					System.out.println("?? 다시 입력하세요 ??");
					
			}
		}
		
		System.out.println("종료 합니다");
		
		
		
		
	}

}
