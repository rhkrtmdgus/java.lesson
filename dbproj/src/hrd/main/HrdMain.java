package hrd.main;

import java.util.List;

import hrd.dao.HrdDao;
import hrd.vo.MemberVO;
import hrd.vo.SaleVO;


public class HrdMain {

	public static void main(String[] args) {
		
		
		
		HrdDao dao = HrdDao.getInstance();
		
		List<SaleVO> list = dao.getSales();
		
		System.out.println(String.format("%10s\t%10s\t%10s\t%10s\t", "����ȣ", "������", "�����", "����"));
		System.out.println("----------------------------------------------------------------------");
		for (SaleVO vo:list) {
			System.out.println(String.format("%10s\t%10s\t%8s\t%10s\t"
					, vo.getCustno(), vo.getCustname(), vo.getAgade(), vo.getAsum()));
		}
		
		
		List<MemberVO> mem = dao.getMembers();
		
		System.out.println(String.format("\n%10s\t%10s\t%20s\t%20s\t%10s\t%10s\t%10s",
				"ȸ����ȣ", "ȸ������", "��ȭ��ȣ", "�ּ�", "��������", "�����", "��������"));
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
