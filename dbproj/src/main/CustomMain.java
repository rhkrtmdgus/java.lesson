package main;

import java.util.List;
import java.util.Scanner;

import dao.CustomDao;
import vo.CustomVo;

public class CustomMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.회원등록   2.회원리스트   3.회원조회  4.회원정보 변경 5.회원 탈퇴    6.프로그램 종료");
		boolean run = true;
		CustomDao dao = CustomDao.getInstance();	//싱글턴패턴의 Dao 객체 생성
		while(run) {
			System.out.print("선택 >>> ");
			String sel = sc.nextLine();
			String custom_id;
			CustomVo vo2;
			switch (sel) {
			case "1":
				//회원ID의 무결성 조건 검사(중복값 검사)
				while(true) {
					System.out.print("사용할 ID 입력 >>> ");
					custom_id = sc.nextLine();
					if(dao.getOne(custom_id) !=null )
						System.out.println("사용할 수 없는 ID 입니다.");
					else {
						System.out.println("사용할 수 있는 ID 입니다.");
						break;
					}
				}
				System.out.print("이름 입력 >>> ");
				String name = sc.nextLine();
				vo2 = new CustomVo(); vo2.setName(name);vo2.setCustom_id(custom_id);
				dao.insert(vo2);
				break;
			case "2":
				List<CustomVo> list = dao.getList();
				System.out.println(list);
				break;
			case "3":
				System.out.print("조회할 고객 ID 입력 >>> ");
				custom_id = sc.nextLine();
				vo2 = dao.getOne(custom_id);
				if (vo2 !=null )System.out.println(vo2);
				else System.out.println("조회 결과가 없습니다.!");
				break;
			case "4":
				
				break;
			case "5":
				System.out.print("탈퇴할 ID를 입력하세요 >>> ");
				custom_id = sc.nextLine();
				if (dao.getOne(custom_id) == null) {
					System.out.println("없는 ID입니다.");
				}
				else {
					System.out.print("정말 탈퇴하시겠습니까? (y / n)");
					if(sc.nextLine().equals("y")) {
						dao.delete(custom_id);
						System.out.println("탈퇴 완료");
					}
					else System.out.println("탈퇴 취소");
				}
				break;
				
			case "6":
				run=false;
				break;
				
			default:
				System.out.println("메뉴 선택 다시 하세요.(1~5)");
				break;
			} //switch end
			
		}	//while end
		System.out.println("THE END!!");
		sc.close();

	}

}
