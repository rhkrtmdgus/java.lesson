package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {
	public static void main(String[] args) {
		
		System.out.println("������ ���� �޴� ��ǥ�մϴ�. ");
		System.out.println("ġ��, ������, ��â, �Ұ��, �ܹ���, ��¡�ȸ");
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("ġ��", 0);
		map.put("������", 0);
		map.put("��â", 0);
		map.put("�Ұ��", 0);
		map.put("�ܹ���", 0);
		map.put("��¡�ȸ", 0);
		
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
		
		
		
		
		
		System.out.println("��ǥ �����մϴ�.");
		System.out.println(map);
		// �ִ� ��ǥ
		System.out.println("�ִ� ��ǥ�� " + Collections.max(map.values())); //���� ū);
		System.out.println("�ִ� ��ǥ key " + Collections.max(map.keySet())); //���� ū);
		
		for (int j = 0; j < count; j ++) {
			
		}
		int i = map.values();
		
		
	}
}
