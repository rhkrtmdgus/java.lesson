package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		
		//String�� ���ĺ� (������ ) �� �������� ��
		System.out.println("kim�� momo�� : " + na.compareTo(you)); // -2 ����
		System.out.println("kim�� son" + na.compareTo(he));		//24 ���
		
		int a = 12, b = 45;
		System.out.println("a - b : " + (a - b));
	
		Integer aa = 12;
		Integer bb = 45;
		System.out.println("12�� 45 : " + aa.compareTo(bb));
		aa = 90;
				
		System.out.println("90�� 45 : " + aa.compareTo(bb));
		aa = 45;
		System.out.println("45�� 45 : " + aa.compareTo(bb));
		
		// compareTo �� ���� �񱳴� sort ( ���� ) �� ���˴ϴ�.
		// ������ ��������, ���� ���� 2���� ���·� ��Ÿ�� �� �ֽ��ϴ�.
		
	}

}
