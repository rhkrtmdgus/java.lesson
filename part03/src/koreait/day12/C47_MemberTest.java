package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("���", 27)); //���ο� ��ü �����ϰ� ���� ���� ����Ʈ�� �߰�
		Member member  = new Member("����", 26); // ������ �����Ͽ� ��ü ����
		list.add(member);
		list.add(new Member("����", 20)); //���ο� ��ü �����ϰ� ���� ���� ����Ʈ�� �߰�
		list.add(new Member("�ź�", 22)); //���ο� ��ü �����ϰ� ���� ���� ����Ʈ�� �߰�
		System.out.println("���� list�� ��� ���� : " + list.size());
		System.out.println("1. ��ü ����Ʈ ���");
		System.out.println(list);
		//list.get(i) > Member ��ü�� ������
		System.out.println("2. list�� ��� �� age �ʵ� ���� 25���� �� �͸� ����غ���");
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAge() <= 25)
				System.out.println("i= " + i + "," + list.get(i));
		}
		
		System.out.println("3. \"����\"�� ��� �ε������� �����ϰ� �ִ� ��ü �ΰ�?");
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("����")) {
				System.out.println("��� : " + i);
				break;
			}
		}
		
		//����Ʈ ��Ұ� ���� ���� �ʵ带 ���� ��ü�̸� �ʵ� �� ���ϴ� equals �����Դϴ�.
		//						indexOf�� String, �⺻�� ���� Ŭ������ ����մϴ�.
			
		System.out.println("Member ��ü�� indexOf ���� : " + list.indexOf(new Member("����", 20)));
		
		
		
		
		
		
	}

}
