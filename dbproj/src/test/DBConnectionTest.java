package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class DBConnectionTest {

	public static void main(String[] args) {

		// db ���� �õ��� ���ϴ�. �����ϸ� Connection ��ü�� ��������ϴ�.
		
		Connection conn = OracleConnectionUtil.connect();
		
		System.out.println(conn);
		if(conn != null) {
			System.out.println("������ ���̽� ���� ����!!");
		}else
			System.out.println("������ ���̽� ���� ����!!");
		
		//Connection ��ü�� �̿��ؼ� SQL�� ������ �� �ֽ��ϴ�.
		//PreparedStatement ��ü�� SQL�� �������ؼ� �����մϴ�.
		
		String sql = "INSERT INTO tbl_custom (custom_id, name, email, age) "
				+ "VALUES ('sana97', '�ֻ糪', 'sana@naver.com', 26)"; // ���� sql ������ ; ���� �ʵ��� �Ѵ�.
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();  // insert, update, delete SQL �����մϴ�.
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL ���� ���� �Դϴ�. : " + e.getMessage());
			//e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
		
		
		
	}
	
	

}
