package koreait.test99;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyAddressBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Person> myadd = new ArrayList<>();
		String name, mo, biu;
		int gr;
		int cnt = 0;
		
		boolean is = true;
		
		System.out.println("���� ��� ��  [n]������ó ����\t   [s]����ó ã��\t   [g]�׷� ���� ����\t   [a]��ü����\t   [e]���α׷� ������");
		while(is) {
			
			
			System.out.print("���� >> " );
			
			switch (sc.nextLine()){
				case "n":
					System.out.print("�̸� �Է� -> ");	
					name = sc.nextLine();
					System.out.print("�޴� ��ȣ -> ");	
					mo = sc.nextLine();
					System.out.print("�׷�(1:ģ��, 2:����, 3:�����Ͻ�) -> ");
					gr = Integer.parseInt(sc.nextLine());
					myadd.add(new Person(name, mo, gr));
					break;
	
				case "s":
					System.out.print("�˻� �̸� -> ");
					name = sc.nextLine();
					for (Person temp : myadd) {
						if (temp.getName().equals(name)) {
							cnt += 1;
							System.out.println(temp.toString());
							System.out.println(cnt + " ���� �˻��Ǿ����ϴ�.");
						}
					}
					cnt = 0;
					break;
					
					
				case "g":
					System.out.print("�׷� ����(1: ģ��, 2:����, 3:�����Ͻ�) -> ");
					int no = Integer.parseInt(sc.nextLine());
					
						levela(myadd,no);
					
					break;
				case "a":
					biu = sc.nextLine();
					System.out.print("�׷� ����(1: ģ��, 2:����, 3:�����Ͻ�) -> ");
					all(myadd);  //�����ϰ� ���
					break;
	
				case "e":
					sc.close();
					is = false;
					break;
	
	
				default:
					
					System.out.println("�߸� �Էµ� �����Դϴ�. �޴��� �´� ���ĺ� �Է��ϼ���..");
					continue;
				}
			}

			System.out.println("���� �մϴ�");
			
		
	}



	private static void levela(List<Person> myadd, int no) {
		
		for (Person dd : myadd) {
			if (dd.getGroup() == no) {

				System.out.println(dd.toString());
		
			}
		}

	}



	private static void all(List<Person> myadd) {  //mywords �� ���� �� ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
		myadd.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
	
		System.out.println("����ó ��ü ���");
		System.out.println(String.format("%-20s %-20s %10s", "�̸�", "�޴� ��ȭ\n"));
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (Person yy : myadd) {
			System.out.println(String.format("%-20s %-20s %10d", yy.getName(), yy.getMobile()));
	
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
	}
}
