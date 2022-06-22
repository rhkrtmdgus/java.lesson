package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

import koreait.day16.Word;

public class MyDictionaryV2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>(); // *** mydic을 mywords로 바꿔서 구현해보기***
		try {
			System.out.println("파일에서 읽어 올까요? (y or n) >>> ");
			if (ssc.nextLine().equals("y")) {
				read(mywords, "D:\\iclass95\\나의영한사전.txt");
			}
			else System.out.println("파일을 읽어오지 않았습니다."); 
				
		} catch (FileNotFoundException e3) {
			System.out.println("파일 읽는 중에 오류가 발생했습니다. " + e3.getMessage());
		}
		
		
		String e, k;
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
		try {
			
			System.out.println("파일을 저장할까요? (y or n) >>> ");
			if(ssc.nextLine().equals("y")) {
				save(mywords, "D:\\iclass95\\나의영한사전.txt");
			}
			else System.out.println("파일이 저장되지 않았음");eody
			
		} catch (FileNotFoundException e2) {
			System.out.println("파일 저장 중에 오류가 발생했습니다. " + e2.getMessage());
		}
		
		System.out.println("종료 합니다");
		
		
	}

	private static void read(List<Word> mywords, String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()){
			String temp = sc.nextLine();
			temp = temp.substring(0, temp.indexOf("("));
			StringTokenizer scv = new StringTokenizer(temp);
			mywords.add(new Word(scv.nextToken(), scv.nextToken(), 
					Integer.parseInt(scv.nextToken())));
			
			
			
		}
		sc.close();
		System.out.println("파일 읽어오기 완료되었습니다.");
		System.out.println("");
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("파일 저장이 완료되었습니다.");
	}

	private static void levela(List<Word> mywords, int no) {
		System.out.println(String.format("%-20s %-20s\t %20s", "English", "Korean", "Level"));
		System.out.println("---------------------------------------------------------------");
		for (Word kk : mywords) {
			if (kk.getLevel() == no) {
				
				System.out.println(String.format("%-20s %-20s\t %20d", kk.getEnglish(), kk.getKorean(), kk.getLevel()));
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
		System.out.println(String.format("%-20s %-20s\t %10s", "English", "Korean", "Level"));
		System.out.println("---------------------------------------------------------------");
		for (Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %15d", w.getEnglish(), w.getKorean(), w.getLevel()));
		
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
	
	}

}
