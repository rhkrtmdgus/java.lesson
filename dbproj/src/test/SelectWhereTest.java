package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class SelectWhereTest {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		
		String sql = "SELECT name, email FROM TBL_CUSTOM WHERE CUSTOM_ID = ? "; // 주의 sql 마지막 ; 쓰지 않도록 한다.
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 고객 ID  >>> ");
		String id = sc.nextLine();

		try {
			// 1번
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			int i = 1; 
			//중요 : where 조건식의 컬럼 (CUSTOM_ID)이 기본키 이면 SELECT 결과 1개 이거나 없음
			while(rs.next()) {
				//rs를 통해 실행 결과 확인
				System.out.println(String.format("\n조회된 결과 : %d 번째 행", i++));
				System.out.println("현재 행의 고객 이름 : " + rs.getNString("NAME"));
				System.out.println("현재 행의 고객 이메일 : " + rs.getNString("EMAIL"));
			}
			if (rs.next() == false) {
				System.out.println("조회 된 결과가 없습니다.");
			}
			
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 입니다. : " + e.getMessage());
			//e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
	}

}
