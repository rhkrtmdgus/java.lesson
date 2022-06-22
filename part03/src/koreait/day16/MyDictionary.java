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
	//	TreeMap<String, String> mydic = new TreeMap<>(); // ������ �Ǵ� Map
		List<Word> mywords = new ArrayList<>(); // *** mydic�� mywords�� �ٲ㼭 �����غ���***
		
		String e, k;
		Scanner sc = new Scanner(System.in);
		boolean is = true;
		
		Word wd = new Word();
		
		while (is) {
			System.out.println("���� ��� ��  1. �ܾ����� 2.�ܾ�˻� 3.��ü �ܾ��� ���� 4. ������ �˻� 5.���α׷� ������");
			System.out.print("���� >> " );
						
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
							System.out.println("�ܾ��� �˻��߽��ϴ� ��� ++++>>>  " + w);
						}
					}
					
					break;
				case "3":
					all(mywords);  //�����ϰ� ���
					break;
					
				case "4":
					System.out.print("�˻��� ���� �Է� ->     (1 ~ 3) ");
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
					System.out.println("?? �ٽ� �Է��ϼ��� ??");
					
			}
		}
		
		System.out.println("���� �մϴ�");
		
		
		
		
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

	private static void all(List<Word> mywords) {  //mywords �� ���� �� ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
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
