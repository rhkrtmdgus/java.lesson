package koreait.day12;

import java.util.HashMap;

public class C50_HashMap {
	public static void main(String[] args) {
		
		String[] title = {"���İ�Ƽ", "������ũ", "������"};
		int[] price = {12000, 22000, 7000};
		
		HashMap<String, Integer> menus = new HashMap<>();
		
		//HashMap ������ ���� �Լ�
		menus.put("���İ�Ƽ", 12000);
		menus.put("������ũ", 22000);
		menus.put("������", 7000);
		
		System.out.println("1. ����� ������ ���");
		System.out.println(menus);
		
		
		//������ ����(�б�) get()
		System.out.println("2. Ư���� key���� value ���");
		System.out.println("���İ�Ƽ�� ����? " + menus.get("���İ�Ƽ"));
		System.out.println("���İ�Ƽ�� ����? " + menus.get("������ũ"));
		System.out.println("���İ�Ƽ�� ����? " + menus.get("������"));
		
		//key �� �ߺ��Ǹ�?
		menus.put("������", 8200);
		System.out.println(menus);
		
		
		//������ ���� : remove()
		System.out.println("3. Ư�� ��� ����");
		menus.remove("������ũ");
		System.out.println("���� ��� : " + menus);
		System.out.println(menus.remove("������", 8200));
		System.out.println("���� ��� : " + menus);
		
		
		
	}
}

/*ArrayList : ������(�ε����� ����) ���� �����͸� �����ϴ� �ڷᱸ���Դϴ�.�迭�� ������ �����Դϴ�.
HashMap : �������� ������ �ƴմϴ�. �ε����� ������� �װ� Key ���� �̿��Ͽ� �����������Ͽ� ����/�б� �մϴ�.
			*�˻�*�� ���� �˰��� �����մϴ�. 
  		���ʸ� Ÿ���� K:Key , V:Value �ѽ��Դϴ�.
 ArrayList �� ���������� int,long,double �⺻�� Ÿ�� ��ſ� ����(wrapper)Ŭ������ ǥ���մϴ�.
*/
