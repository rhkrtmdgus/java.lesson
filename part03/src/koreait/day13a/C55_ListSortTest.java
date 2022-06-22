package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C55_ListSortTest {

	public static void main(String[] args) {
		//List�� �������̽�, ArrayList �� ����ü
		//������ : List�� ����Ÿ������ �Ͽ� �����մϴ�. ������ ��� ���̺귯������ ListŸ������ ���ϱ� ��������
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		//sort�� ���õ� �������̽� ���.
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort ���� : " + ilist);
		//���� ��������
		ilist.sort(null);  //���ڷ� �ʿ��� ���� ���� Comparator ����ü �ʿ�
						  // �⺻��, String�� null �� �� �� �ִ�. (�������� ����)
		System.out.println("sort ���� : " + ilist);

		//���� ��������
		ilist.sort(Comparator.reverseOrder()); //����, Comparator �������̽�
		System.out.println("�������� sort ���� : " + ilist);
		
		slist.add("���α�");
		slist.add("����");
		slist.add("¡����");
		slist.add("����");
		slist.add("��î");
		slist.add("���̳�");
		slist.add("�ָ���");
		
		System.out.println("sort ���� : " + slist);
		slist.sort(null);
		System.out.println("sort ���� (ASCEnding) : " + slist);
		slist.sort(Comparator.reverseOrder()); 
		System.out.println("�������� ���� (DESCending) : " + slist);
		
		
		System.out.println("1. comparator  ���");
		List<Member> mlist = new ArrayList<>();
		mlist.add(new Member("segu", 23));
		mlist.add(new Member("lilpa", 27));
		mlist.add(new Member("burger", 25));
		mlist.add(new Member("wakgood", 29));
		mlist.add(new Member("ine", 26));
		mlist.add(new Member("bichan", 27));
		
		
		System.out.println("member ����Ʈ ���� : " + mlist);
//		mlist.sort(null); // ���� : Member ��ü�� ���� �� ���� ��ü > ���� �������̽��� ���ڷ� �ؾ���
		System.out.println("member sort Ȯ�� : " + mlist);
		
		mlist.sort(new MemberAgeAscending());
		System.out.println("sort Ȯ��" + mlist);
//		mlist.sort(new MemberAgeDescending());
//		System.out.println("sort Ȯ�� " + mlist);
//		
//		mlist.sort(new MemberNameAscending());
//		System.out.println("sort Ȯ�� " + mlist);
//		mlist.sort(new MemberNameDescending());
//		System.out.println("sort Ȯ�� " + mlist);
		
		System.out.println("\n2. comparable �������̽� ����ϴ� sort");
//		
		
		List<User> ulist = new ArrayList<User>();
		ulist.add(new User("����", 23));
		ulist.add(new User("��î", 27));
		ulist.add(new User("����", 25));
		ulist.add(new User("����", 29));
		ulist.add(new User("�̳�", 26));
		ulist.add(new User("����", 27));
		
		System.out.println("user ����Ʈ ���� : " + ulist);
// User�� ���� �� �ִ� Ÿ�� : Comparable ����ü ( Comparable �ȿ� ����ü�� �־? )
		ulist.sort(null);
		System.out.println("user sort(ASC) : " + ulist);
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort(DESC) : " + ulist);
		
		
		ulist.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			
			}
		}); // �޼ҵ� ���ڷ� �͸� Ŭ������ �����ؼ���ü�� ����.
		
		System.out.println("user sort(ASC) : " + ulist);
		
		
		
		
		
		
		
		
	}

}
