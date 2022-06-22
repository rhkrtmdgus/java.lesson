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
		List<Word> mywords = new ArrayList<>(); // *** mydic�� mywords�� �ٲ㼭 �����غ���***
		try {
			System.out.println("���Ͽ��� �о� �ñ��? (y or n) >>> ");
			if (ssc.nextLine().equals("y")) {
				read(mywords, "D:\\iclass95\\���ǿ��ѻ���.txt");
			}
			else System.out.println("������ �о���� �ʾҽ��ϴ�."); 
				
		} catch (FileNotFoundException e3) {
			System.out.println("���� �д� �߿� ������ �߻��߽��ϴ�. " + e3.getMessage());
		}
		
		
		String e, k;
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
		try {
			
			System.out.println("������ �����ұ��? (y or n) >>> ");
			if(ssc.nextLine().equals("y")) {
				save(mywords, "D:\\iclass95\\���ǿ��ѻ���.txt");
			}
			else System.out.println("������ ������� �ʾ���");eody
			
		} catch (FileNotFoundException e2) {
			System.out.println("���� ���� �߿� ������ �߻��߽��ϴ�. " + e2.getMessage());
		}
		
		System.out.println("���� �մϴ�");
		
		
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
		System.out.println("���� �о���� �Ϸ�Ǿ����ϴ�.");
		System.out.println("");
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
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

	private static void all(List<Word> mywords) {  //mywords �� ���� �� ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
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
