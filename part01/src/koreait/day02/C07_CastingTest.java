package koreait.day02;

public class C07_CastingTest {

	public static void main(String[] args) {
		
	//	���Թ� : ������ ��(���ͷ�)/ ���� / ������ ���� ������ ����.
	//  	
	//  ��� ���� + , - , * , / (������), % (������)	
	//  ���� ���� == (����), != (���� �ʴ�), >, < , >=, <=
	//  ������ && (�׸���), || (�Ǵ�), !(�ƴϴ�)
	//  	
	
	// �������� ������ int
	
	int a = 123, b = 13;
	double c = 10.34;
	
	
	//���꿡 ���Ǵ� �ǿ����� (123, 13)�� ��� �����̸� ����� ����
	//�ǿ����ڰ� ����, �Ǽ� ����� ����� �Ǽ�
	
	int isum;
	double dsum;
	
	isum = a + b;
	dsum = a + c;
			
	System.out.println("a + b = " + isum);
	System.out.println("a + c = " + dsum);
	
	// int = a + c; �� ���� ( ����� �Ǽ��̱� ���� )
	
	// ����ȯ (casting) : ���� + �Ǽ� ����� �� ���� ������ �����ؾ� �Ѵٸ� ���α׷��Ӱ� ������ ��ȯ�ؾ���
    //   �� ()�ȿ� ��ȯ��ų ���� �߰�	
	
	isum = a + (int) c;
	System.out.println("a + (int) c = " + isum);  // �Ǽ����� ���� ��ȯ�� �Ҽ����� ����
	
	b = 10;
	System.out.println("a / b = " + a/b); // �������� ������ ��� ����
	System.out.println("a / b = " + a%b); // �������� �������� ��������  ����
	
	System.out.printf("%d / %d = %d\n", a, b, a/b);
	System.out.printf("%d %% %d = %d%n", a, b, a%b); // %�� �������� %% �ΰ� �ִ´�.
	
	b = 11;
	System.out.printf("%d / %d = %.2f\n", a, b, a/(double)b); //�⺻ �Ҽ��� ���� 6�ڸ� ��� (�ݿø�)
	
	double test = 12.3456127456789;
	System.out.println("test = " + test);
	System.out.printf("test = %f\n", test); // %f �Ҽ��� 6�ڸ����� �ݿø� ��
	System.out.printf("test = %.15f\n", test);
	
	
	
	}

}
