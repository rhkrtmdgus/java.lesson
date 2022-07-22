package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class SelectTest2 {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		//select 쿼리 결과로 만들어지는 객ㄱ체를 참조하는 인터페이스 참조 타입 변수
		ResultSet rs = null;
		
		String sql = "SELECT * FROM TBL_CUSTOM";
		
		try {
			pstmt = conn.prepareStatement(sql);
			//select 실행 결과 행의 개수는 개발시점에서 알 수 없음. 컬럼명은 알고 있음.
			rs = pstmt.executeQuery();
			
			//rs를 통해 실행 결과 확인
			System.out.println("조회된 결과가 있습니까? (첫번째 행)" + rs.next());
			System.out.println("현재 행의 고객 ID : " + rs.getNString("CUSTOM_ID"));
			System.out.println("현재 행의 고객 이름 : " + rs.getNString("NAME"));
			System.out.println("현재 행의 고객 이메일 : " + rs.getNString("EMAIL"));
			System.out.println("현재 행의 고객 나이 : " + rs.getInt("AGE"));
			System.out.println("현재 행의 고객 가입날짜 : " + rs.getTimestamp("REG_DATE"));
			
			System.out.println("\n조회된 결과가 있습니까? (두번째 행)" + rs.next());
			System.out.println("현재 행의 고객 ID : " + rs.getNString(1));
			System.out.println("현재 행의 고객 이름 : " + rs.getNString(2));
			System.out.println("현재 행의 고객 이메일 : " + rs.getNString(3));
			System.out.println("현재 행의 고객 나이 : " + rs.getInt(4));
			System.out.println("현재 행의 고객 가입날짜 : " + rs.getTimestamp(5));
			
		}catch(SQLException e) {
			System.out.println("SQL select 실행 오류 : " + e.getMessage());
		
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
		
		
		
	}

}
