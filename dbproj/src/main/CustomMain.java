package main;

import java.util.List;
import java.util.Scanner;

import dao.CustomDao;
import vo.CustomVo;

public class CustomMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.ȸ�����   2.ȸ������Ʈ   3.ȸ����ȸ  4.ȸ������ ���� 5.ȸ�� Ż��    6.���α׷� ����");
		boolean run = true;
		CustomDao dao = CustomDao.getInstance();	//�̱��������� Dao ��ü ����
		while(run) {
			System.out.print("���� >>> ");
			String sel = sc.nextLine();
			String custom_id;
			CustomVo vo2;
			switch (sel) {
			case "1":
				//ȸ��ID�� ���Ἲ ���� �˻�(�ߺ��� �˻�)
				while(true) {
					System.out.print("����� ID �Է� >>> ");
					custom_id = sc.nextLine();
					if(dao.getOne(custom_id) !=null )
						System.out.println("����� �� ���� ID �Դϴ�.");
					else {
						System.out.println("����� �� �ִ� ID �Դϴ�.");
						break;
					}
				}
				System.out.print("�̸� �Է� >>> ");
				String name = sc.nextLine();
				vo2 = new CustomVo(); vo2.setName(name);vo2.setCustom_id(custom_id);
				dao.insert(vo2);
				break;
			case "2":
				List<CustomVo> list = dao.getList();
				System.out.println(list);
				break;
			case "3":
				System.out.print("��ȸ�� �� ID �Է� >>> ");
				custom_id = sc.nextLine();
				vo2 = dao.getOne(custom_id);
				if (vo2 !=null )System.out.println(vo2);
				else System.out.println("��ȸ ����� �����ϴ�.!");
				break;
			case "4":
				
				break;
			case "5":
				System.out.print("Ż���� ID�� �Է��ϼ��� >>> ");
				custom_id = sc.nextLine();
				if (dao.getOne(custom_id) == null) {
					System.out.println("���� ID�Դϴ�.");
				}
				else {
					System.out.print("���� Ż���Ͻðڽ��ϱ�? (y / n)");
					if(sc.nextLine().equals("y")) {
						dao.delete(custom_id);
						System.out.println("Ż�� �Ϸ�");
					}
					else System.out.println("Ż�� ���");
				}
				break;
				
			case "6":
				run=false;
				break;
				
			default:
				System.out.println("�޴� ���� �ٽ� �ϼ���.(1~5)");
				break;
			} //switch end
			
		}	//while end
		System.out.println("THE END!!");
		sc.close();

	}

}
