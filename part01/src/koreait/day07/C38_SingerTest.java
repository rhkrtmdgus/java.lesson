package koreait.day07;

public class C38_SingerTest {

	public static void main(String[] args) {

		Singer twice = new Singer();
		twice.name_eng = "Twice";
		twice.name_kor = "Ʈ���̽�";
		twice.debutYear = 2015;
		twice.genre = "Kpop-GirlGroup";
		
		twice.members = new String[9];
		twice.members[0] = "���";
		twice.members[1] = "����";
		twice.members[2] = "����";
		
		System.out.println("twice members");
		twice.printMembers();
		System.out.println("Ȱ���Ⱓ" + twice.actYears(2022) + "��");
		
		Singer beo = new Singer();
		beo.name_eng = "BE'O";
		
	}

}
