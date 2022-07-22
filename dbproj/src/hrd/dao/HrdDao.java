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



//테이블마다 필요한 insert, update, delete, select 주요 SQL 동작을 메소드로 작성한 클래스 입니다. (DAO)
//CustomDao는 tbl_custom 테이블을 대상으로 하는 SQL 실행 메소드를 포함.
//Singleton 패턴 적용해 보기 : 객체를 오직 1개만 생성하는 유형입니다.


public class HrdDao { // Singleton 패턴 적용해보기
   private static HrdDao dao = new HrdDao();

   private HrdDao() {  // 생성자는 private 다른 클래스에서 new CustomDao() 못합니다.
   }

   public static HrdDao getInstance() {
      return dao;
   }
   
   // tbl_custom 테이블 대상으로 sql 실행할 메소드 정의합니다.
   
   public List<SaleVO> getSales() { // 전체 조회
      Connection conn = OracleConnectionUtil.connect();
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = "SELECT  mt.CUSTNO , \r\n" + 
      		"	mt.CUSTNAME , \r\n" + 
      		"	decode(mt.GRADE,'A','VIP','B','일반','C','직원') AS agrade, \r\n" + 
      		"	sale.asum \r\n" + 
      		"FROM MEMBER_TBL_02 mt ,\r\n" + 
      		"		(SELECT CUSTNO, sum(price) AS asum FROM MONEY_TBL_02  \r\n" + 
      		"		GROUP BY CUSTNO\r\n" + 
      		"		ORDER BY asum desc) sale\r\n" + 
      		"WHERE mt.CUSTNO = sale.CUSTNO"; // --> 실행예측 : row의 최대갯수는 많음.
      SaleVO vo;
      List<SaleVO> list = new ArrayList<SaleVO>();
      try {
         pstmt = conn.prepareStatement(sql);

         rs = pstmt.executeQuery();
         while (rs.next()) {
            vo = new SaleVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            list.add(vo); // 리스트에 추가합니다.
         }
         return list;
      } catch (SQLException e) {
         System.out.println("custom List 조회에 문제가 있습니다. : " + e.getMessage());
      } finally {
         try {
            rs.close();
         } catch (SQLException e) {
            System.out.println("close 오류 : " + e.getMessage());
         }
         OracleConnectionUtil.close(conn,pstmt);
      }

      return null;
   }
   
   public List<MemberVO> getMembers() { // 전체 조회
	      Connection conn = OracleConnectionUtil.connect();
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String sql = "select custno, custname, phone, address, joindate, decode(GRADE,'A','VIP','B','일반','C','직원') AS AGRADE, "
	      		+ "CITY FROM MEMBER_TBL_02";
	      MemberVO vo;
	      List<MemberVO> mem = new ArrayList<MemberVO>();
	      try {
	         pstmt = conn.prepareStatement(sql);

	         rs = pstmt.executeQuery();
	         while (rs.next()) {
	            vo = new MemberVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
	            		rs.getDate(5), rs.getString(6), rs.getString(7));
	            mem.add(vo); // 리스트에 추가합니다.
	         }
	         return mem;
	      } catch (SQLException e) {
	         System.out.println("custom List 조회에 문제가 있습니다. : " + e.getMessage());
	      } finally {
	         try {
	            rs.close();
	         } catch (SQLException e) {
	            System.out.println("close 오류 : " + e.getMessage());
	         }
	         OracleConnectionUtil.close(conn,pstmt);
	      }

	      return null;
	   }
   
}