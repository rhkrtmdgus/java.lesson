package koreait.day02;

public class C08_Test {
	//�ۼ��� : ������
	public static void main(String[] args) {
		
		int width = 23;
		int length = 19;
		
		int area1 = width * length;
		
		System.out.println("�簢�� ���̸� ���߽��ϴ� = " + area1 + "��");
		
		double radius = 23.230;
		
		double circumference = radius * 3.14 * 2; // �ѷ�
		double area2 = 3.14 * radius * radius; // ����
		
		System.out.printf("�� �ѷ��� ���߽��ϴ� = %.3f cm \n", circumference);
		System.out.printf("�� ���̸� ���߽��ϴ� = %.3f �� \n", area2);
		
		//final Test
		//    ���� ���� �տ� final Ű���带 ���̸� ���� �������� ���� 
		
		
	}

}
