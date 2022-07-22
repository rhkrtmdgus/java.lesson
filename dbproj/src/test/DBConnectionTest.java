package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class DBConnectionTest {

	public static void main(String[] args) {

		// db 연결 시도해 봅니다. 성공하면 Connection 객체가 만들어집니다.
		
		Connection conn = OracleConnectionUtil.connect();
		
		System.out.println(conn);
		if(conn != null) {
			System.out.println("데이터 베이스 연결 성공!!");
		}else
			System.out.println("데이터 베이스 연결 실패!!");
		
		//Connection 객체를 이용해서 SQL을 실행할 수 있습니다.
		//PreparedStatement 객체는 SQL을 컴파일해서 저장합니다.
		
		String sql = "INSERT INTO tbl_custom (custom_id, name, email, age) "
				+ "VALUES ('sana97', '최사나', 'sana@naver.com', 26)"; // 주의 sql 마지막 ; 쓰지 않도록 한다.
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();  // insert, update, delete SQL 실행합니다.
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 입니다. : " + e.getMessage());
			//e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
		
		
		
	}
	
	

}
