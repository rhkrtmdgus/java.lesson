package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("���� ���� >>> ");
			//int n = sc.nextInt();
			int n = Integer.parseInt(sc.nextLine());
			//���� �ܿ� �ٸ� ���� �Է��ϸ� Exception ���� �߻� NumberFormatEXCEPTION
			
			System.out.println("����� �Է��� �� : " + n);
	//	} catch (Exception e) {
		
		
//		} catch (NullPointerException e) {
		} catch (NullPointerException | NumberFormatException e) {
			// �߻��� ���� ������ Exception ��ü�� �����ϰ� �̿� ���� ���������� e�Դϴ�.
			System.out.println("���� �߻� : " + e.getMessage());
			System.out.println("����� ��ɿ� ������ �߻��߽��ϴ�.");
			
		}finally {
			sc.close();
		}
		
		
		
		
		System.out.println("���α׷� ��");
		
	}

}
