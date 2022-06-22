package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {
		
		//HashMap<String, String> dic = new HashMap<>();
	//	TreeMap<String, String> mydic = new TreeMap<>(); // 정렬이 되는 Map
		List<Word> mywords = new ArrayList<>(); // *** mydic을 mywords로 바꿔서 구현해보기***
		
		String e, k;
		Scanner sc = new Scanner(System.in);
		boolean is = true;
		
		Word wd = new Word();
		
		while (is) {
			System.out.println("선택 기능 ☞  1. 단어저장 2.단어검색 3.전체 단어장 보기 4. 레벨로 검색 5.프로그램 끝내기");
			System.out.print("선택 >> " );
						
			switch (sc.nextLine()){
				case "1":
					System.out.print("English -> ");	
					e = sc.nextLine();
					System.out.print("korean -> ");	
					k = sc.nextLine();
					System.out.print("level -> ");	
					int level = Integer.parseInt(sc.nextLine());
					mywords.add(new Word(e, k, level));
					
					
					break;
							
				case "2":
					System.out.println(mywords);
					System.out.print("English -> ");
					e = sc.nextLine();
					for (Word w : mywords) {
						if (w.getEnglish().equals(e)) {
							System.out.println("단어장 검색했습니다 결과 ++++>>>  " + w);
						}
					}
					
					break;
				case "3":
					all(mywords);  //정렬하고 출력
					break;
					
				case "4":
					System.out.print("검색할 레벨 입력 ->     (1 ~ 3) ");
					int no = Integer.parseInt(sc.nextLine());
//					for (Word wf : mywords) {
						levela(mywords,no);
//					}
					break;
					
				case "5":
					sc.close();
					is = false;
					break;
					
					
				default:
					System.out.println("?? 다시 입력하세요 ??");
					
			}
		}
		
		System.out.println("종료 합니다");
		
		
		
		
	}

	private static void levela(List<Word> mywords, int no) {
		System.out.println(String.format("%-20s %-20s %10s", "English", "Korean", "Level"));
		System.out.println("---------------------------------------------------------------");
		for (Word kk : mywords) {
			if (kk.getLevel() == no) {
				
				System.out.println(String.format("%-20s %-20s %10d", kk.getEnglish(), kk.getKorean(), kk.getLevel()));
			}
		}
		
		
	}

	private static void all(List<Word> mywords) {  //mywords 의 참조 값 전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		System.out.println(String.format("%-20s %-20s %10s", "English", "Korean", "Level"));
		System.out.println("---------------------------------------------------------------");
		for (Word w : mywords) {
			System.out.println(String.format("%-20s %-20s %10d", w.getEnglish(), w.getKorean(), w.getLevel()));
		
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
	
	}

}
