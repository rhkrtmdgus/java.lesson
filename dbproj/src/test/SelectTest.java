package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class SelectTest { // SelectTest 클래스를 while로 변경하여 모든 행 출력

	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		//select 쿼리 결과로 만들어지는 객ㄱ체를 참조하는 인터페이스 참조 타입 변수
		ResultSet rs = null;
		
		String sql = "SELECT * FROM TBL_CUSTOM ORDER BY CUSTOM_ID";
		
		try {
			pstmt = conn.prepareStatement(sql);
			//select 실행 결과 행의 개수는 개발시점에서 알 수 없음. 컬럼명은 알고 있음.
			rs = pstmt.executeQuery();
			int i = 1;
			while(rs.next()) {
				//rs를 통해 실행 결과 확인
				System.out.println(String.format("\n조회된 결과 : %d 번째 행", i++));
				System.out.println("현재 행의 고객 ID : " + rs.getNString("CUSTOM_ID"));
				System.out.println("현재 행의 고객 이름 : " + rs.getNString("NAME"));
				System.out.println("현재 행의 고객 이메일 : " + rs.getNString("EMAIL"));
				System.out.println("현재 행의 고객 나이 : " + rs.getInt("AGE"));
				System.out.println("현재 행의 고객 가입날짜 : " + rs.getTimestamp("REG_DATE"));
			}
			
			
			
			
		}catch(SQLException e) {
			System.out.println("SQL select 실행 오류 : " + e.getMessage());
		
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
		
		
		
	}

}
