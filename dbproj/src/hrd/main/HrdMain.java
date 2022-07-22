package hrd.main;

import java.util.List;

import hrd.dao.HrdDao;
import hrd.vo.MemberVO;
import hrd.vo.SaleVO;


public class HrdMain {

	public static void main(String[] args) {
		
		
		
		HrdDao dao = HrdDao.getInstance();
		
		List<SaleVO> list = dao.getSales();
		
		System.out.println(String.format("%10s\t%10s\t%10s\t%10s\t", "고객번호", "고객성명", "고객등급", "매출"));
		System.out.println("----------------------------------------------------------------------");
		for (SaleVO vo:list) {
			System.out.println(String.format("%10s\t%10s\t%8s\t%10s\t"
					, vo.getCustno(), vo.getCustname(), vo.getAgade(), vo.getAsum()));
		}
		
		
		List<MemberVO> mem = dao.getMembers();
		
		System.out.println(String.format("\n%10s\t%10s\t%20s\t%20s\t%10s\t%10s\t%10s",
				"회원번호", "회원성명", "전화번호", "주소", "가입일자", "고객등급", "거주지역"));
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		for (MemberVO vo:mem) {
			System.out.println(String.format("%10d\t%10s\t%20s\t%30s\t%10s\t%10s\t%10s",
					vo.getCustno(),
					vo.getCustname(),
					vo.getPhone(),
					vo.getAddress(),
					vo.getJoin_date(),
					vo.getGrade(),
					vo.getCity()));
					
		}
		
		
	}

}
