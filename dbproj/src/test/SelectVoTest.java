package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;
import vo.CustomVo;

//sql 쿼리(조회, select 문) 실행을 테스트 합니다. -> where 조건 추가 -> 조회 결과를 VO클래스와 매핑.
public class SelectVoTest {

   public static void main(String[] args) {

	   String sql ="SELECT * FROM TBL_CUSTOM WHERE CUSTOM_ID =?";
      
//vo : value object. 데이터 값을 저장하는 목적으로 사용하는 클래스      
	  Scanner sc = new Scanner(System.in);
      ResultSet rs = null;
      String id=null; 
//      String name,email;
//      int age;
//      Date regdate;
      CustomVo vo=null;    //선언만.
      
      System.out.println("조회할 고객 ID 입력 하세요 >>>  ");
      id = sc.nextLine();
      
      try (Connection conn = OracleConnectionUtil.connect();
    		  PreparedStatement pstmt = conn.prepareStatement(sql))
      {
    	  
         pstmt.setString(1, id);
         rs = pstmt.executeQuery();   
         
         if(rs.next()) {   //where 검색컬럼이 PK,unique 일 때 -> while x , if 문으로 
            //테이블 컬럼과 CustomVo 타입 객체와 매핑 -> 자동으로 할 때가 옵니다.
//            id= rs.getString("CUSTOM_ID");
//            name =rs.getString("NAME");
//            email = rs.getString(3);   //rs.getString("EMAIL") 과 동일합니다.
//            age = rs.getInt("AGE");
//            regdate = rs.getDate("REG_DATE");
            vo=new CustomVo(rs.getNString(1),
            		rs.getNString(2),
            		rs.getNString(3),
            		rs.getInt(4), rs.getDate(5));   //객체 생성하고 초기화
         }
         System.out.println(vo);   //vo는 null 초기화 필요
         
         
      } catch (SQLException e) {
         System.out.println("SQL 실행에 오류가 발생했습니다. : " + e.getMessage());
         //e.printStackTrace();
      }
      
      if(vo==null) {
         System.out.println("조회할 사용자 id가 없습니다.");
      }else {
         System.out.println("id = " + id +" 조회되었습니다.");   //id=null 초기화하지 않으면 오류 생깁니다.
      }   
   }

/*
 *  try-with-resources 방식을 사용하려면 사용하는 객체가  AutoClosable 인터페이스를 Implement해서 사용 가능해야 함.
 *  Connection, PreparedStatement
 * 
 * 
 * 
 */
}
