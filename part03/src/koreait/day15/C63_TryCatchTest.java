package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		//try ����
		try {
			// Excpetion ���ɼ��� �ִ� ������ �ۼ�. >> ������ ����� catch�� ��;;
			// �� ��ġ�� ������ �����ϸ� try{}�� ��������ȭ ��
			
		} catch (NullPointerException e) { // ���� ���ο� ���� Exception ������ �˻��մϴ�.
			//NullPointerException �� ���� �Ʒ� ���ɵ� ó��
			e.printStackTrace(); // ������ �����ϱ� ���� ������ ���
		}catch (InputMismatchException e) {
			// catch�� ���� �� �ۼ� �����մϴ�.
		}finally { //���������� ���� �߻� ������� ����Ǵ� �κ��Դϴ�.
			// �ڿ� �����ϴ� �ڵ� �ۼ��մϴ�.
			sc.close();
		}
		
		//try ������ ���� �Ǵ� catch ������ ������ ������ ������ ��� �˴ϴ�.
		
	}
	
	

}