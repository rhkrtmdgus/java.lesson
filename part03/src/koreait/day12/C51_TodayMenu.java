package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {
	public static void main(String[] args) {
		
		System.out.println("오늘의 저녁 메뉴 투표합니다. ");
		System.out.println("치맥, 떡볶이, 곱창, 불고기, 햄버거, 오징어물회");
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("치맥", 0);
		map.put("떡볶이", 0);
		map.put("곱창", 0);
		map.put("불고기", 0);
		map.put("햄버거", 0);
		map.put("오징어물회", 0);
		
		int count = 0;
		
		while(true) {
			Scanner sc = new Scanner (System.in);
			String menu = sc.nextLine();
			count += 1;
			if(menu.equals("end")) break;
			
			int temp = map.get(menu);
			++temp;
			map.put(menu, temp);
		
		}
		
		
		
		
		
		System.out.println("투표 종료합니다.");
		System.out.println(map);
		// 최대 득표
		System.out.println("최대 득표수 " + Collections.max(map.values())); //가장 큰);
		System.out.println("최대 득표 key " + Collections.max(map.keySet())); //가장 큰);
		
		for (int j = 0; j < count; j ++) {
			
		}
		int i = map.values();
		
		
	}
}
