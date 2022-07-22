package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertBuyTest {
	
	public static void main(String[] args) {
		
	
	//tbl_buy ���̺� insert �׽�Ʈ : sana97 ȸ���� GALAXY22�� 1�� ����
	//values (?, ?, ...) ���� ���ε����� SQL�� ���� �������ϰ� ���� ���� ���� ���� ����.
	Connection conn = OracleConnectionUtil.connect();
	if(conn != null) System.out.println("������ ���̽� ���� �Ϸ�!!");
	String sql = "INSERT INTO tbl_buy(custom_id, pcode, QUANTITY, BUYNO) "
			+ "VALUES (?, ?, ?, tblbuy_seq.nextval)";
	
	PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);
	try {
		//conn.setAutoCommit(false);  // ���� Ŀ�� ����
		
		pstmt = conn.prepareStatement(sql);
		System.out.print("���� �� ID >>> ");
		pstmt.setNString(1, sc.nextLine());
		System.out.print("���� ��ǰ �ڵ� >>> ");
		pstmt.setNString(2, sc.nextLine());
		System.out.print("���� ���� >>> ");
		pstmt.setInt(3, Integer.parseInt(sc.nextLine()));
		
		pstmt.execute();
		System.out.println("\n��� �Ϸ�");
		
		
		//conn.commit(); // Ʈ����� commit  
		
	} catch (SQLException e) {
		System.out.println("SQL ���� ���� : " + e.getMessage());
//		try {
//			//conn.rollback(); // �ѹ�
//		} catch (SQLException e2) {
//			e2.printStackTrace();
//		}
		
		
	} finally {
		OracleConnectionUtil.close(conn, pstmt); // conn.close�� �� commit ����.
	}
	
	
	
	}
}
