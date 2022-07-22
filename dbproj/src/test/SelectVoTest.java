package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;
import vo.CustomVo;

//sql ����(��ȸ, select ��) ������ �׽�Ʈ �մϴ�. -> where ���� �߰� -> ��ȸ ����� VOŬ������ ����.
public class SelectVoTest {

   public static void main(String[] args) {

	   String sql ="SELECT * FROM TBL_CUSTOM WHERE CUSTOM_ID =?";
      
//vo : value object. ������ ���� �����ϴ� �������� ����ϴ� Ŭ����      
	  Scanner sc = new Scanner(System.in);
      ResultSet rs = null;
      String id=null; 
//      String name,email;
//      int age;
//      Date regdate;
      CustomVo vo=null;    //����.
      
      System.out.println("��ȸ�� �� ID �Է� �ϼ��� >>>  ");
      id = sc.nextLine();
      
      try (Connection conn = OracleConnectionUtil.connect();
    		  PreparedStatement pstmt = conn.prepareStatement(sql))
      {
    	  
         pstmt.setString(1, id);
         rs = pstmt.executeQuery();   
         
         if(rs.next()) {   //where �˻��÷��� PK,unique �� �� -> while x , if ������ 
            //���̺� �÷��� CustomVo Ÿ�� ��ü�� ���� -> �ڵ����� �� ���� �ɴϴ�.
//            id= rs.getString("CUSTOM_ID");
//            name =rs.getString("NAME");
//            email = rs.getString(3);   //rs.getString("EMAIL") �� �����մϴ�.
//            age = rs.getInt("AGE");
//            regdate = rs.getDate("REG_DATE");
            vo=new CustomVo(rs.getNString(1),
            		rs.getNString(2),
            		rs.getNString(3),
            		rs.getInt(4), rs.getDate(5));   //��ü �����ϰ� �ʱ�ȭ
         }
         System.out.println(vo);   //vo�� null �ʱ�ȭ �ʿ�
         
         
      } catch (SQLException e) {
         System.out.println("SQL ���࿡ ������ �߻��߽��ϴ�. : " + e.getMessage());
         //e.printStackTrace();
      }
      
      if(vo==null) {
         System.out.println("��ȸ�� ����� id�� �����ϴ�.");
      }else {
         System.out.println("id = " + id +" ��ȸ�Ǿ����ϴ�.");   //id=null �ʱ�ȭ���� ������ ���� ����ϴ�.
      }   
   }

/*
 *  try-with-resources ����� ����Ϸ��� ����ϴ� ��ü��  AutoClosable �������̽��� Implement�ؼ� ��� �����ؾ� ��.
 *  Connection, PreparedStatement
 * 
 * 
 * 
 */
}
