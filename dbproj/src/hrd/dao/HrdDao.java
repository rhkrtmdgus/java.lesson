package hrd.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hrd.vo.MemberVO;
import hrd.vo.SaleVO;
import jdbc.util.OracleConnectionUtil;



//���̺��� �ʿ��� insert, update, delete, select �ֿ� SQL ������ �޼ҵ�� �ۼ��� Ŭ���� �Դϴ�. (DAO)
//CustomDao�� tbl_custom ���̺��� ������� �ϴ� SQL ���� �޼ҵ带 ����.
//Singleton ���� ������ ���� : ��ü�� ���� 1���� �����ϴ� �����Դϴ�.


public class HrdDao { // Singleton ���� �����غ���
   private static HrdDao dao = new HrdDao();

   private HrdDao() {  // �����ڴ� private �ٸ� Ŭ�������� new CustomDao() ���մϴ�.
   }

   public static HrdDao getInstance() {
      return dao;
   }
   
   // tbl_custom ���̺� ������� sql ������ �޼ҵ� �����մϴ�.
   
   public List<SaleVO> getSales() { // ��ü ��ȸ
      Connection conn = OracleConnectionUtil.connect();
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = "SELECT  mt.CUSTNO , \r\n" + 
      		"	mt.CUSTNAME , \r\n" + 
      		"	decode(mt.GRADE,'A','VIP','B','�Ϲ�','C','����') AS agrade, \r\n" + 
      		"	sale.asum \r\n" + 
      		"FROM MEMBER_TBL_02 mt ,\r\n" + 
      		"		(SELECT CUSTNO, sum(price) AS asum FROM MONEY_TBL_02  \r\n" + 
      		"		GROUP BY CUSTNO\r\n" + 
      		"		ORDER BY asum desc) sale\r\n" + 
      		"WHERE mt.CUSTNO = sale.CUSTNO"; // --> ���࿹�� : row�� �ִ밹���� ����.
      SaleVO vo;
      List<SaleVO> list = new ArrayList<SaleVO>();
      try {
         pstmt = conn.prepareStatement(sql);

         rs = pstmt.executeQuery();
         while (rs.next()) {
            vo = new SaleVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            list.add(vo); // ����Ʈ�� �߰��մϴ�.
         }
         return list;
      } catch (SQLException e) {
         System.out.println("custom List ��ȸ�� ������ �ֽ��ϴ�. : " + e.getMessage());
      } finally {
         try {
            rs.close();
         } catch (SQLException e) {
            System.out.println("close ���� : " + e.getMessage());
         }
         OracleConnectionUtil.close(conn,pstmt);
      }

      return null;
   }
   
   public List<MemberVO> getMembers() { // ��ü ��ȸ
	      Connection conn = OracleConnectionUtil.connect();
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String sql = "select custno, custname, phone, address, joindate, decode(GRADE,'A','VIP','B','�Ϲ�','C','����') AS AGRADE, "
	      		+ "CITY FROM MEMBER_TBL_02";
	      MemberVO vo;
	      List<MemberVO> mem = new ArrayList<MemberVO>();
	      try {
	         pstmt = conn.prepareStatement(sql);

	         rs = pstmt.executeQuery();
	         while (rs.next()) {
	            vo = new MemberVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
	            		rs.getDate(5), rs.getString(6), rs.getString(7));
	            mem.add(vo); // ����Ʈ�� �߰��մϴ�.
	         }
	         return mem;
	      } catch (SQLException e) {
	         System.out.println("custom List ��ȸ�� ������ �ֽ��ϴ�. : " + e.getMessage());
	      } finally {
	         try {
	            rs.close();
	         } catch (SQLException e) {
	            System.out.println("close ���� : " + e.getMessage());
	         }
	         OracleConnectionUtil.close(conn,pstmt);
	      }

	      return null;
	   }
   
}