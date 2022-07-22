package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class DeleteTest {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectionUtil.connect();
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM TBL_BUY WHERE CUSTOM_ID = ? ";
		
		System.out.println("회원 구매 내역 삭제-------------");
		try {
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			System.out.print("고객 ID >>> ");
			pstmt.setNString(1, sc.nextLine());
			//pstmt.execute();
			
			int result = pstmt.executeUpdate();
			System.out.println("삭제된 행 개수" + result); // 실행된 행의 갯수 리턴
			
			System.out.println("진짤 ㅗ삭제합니까? (y or n) >> ");
			if(sc.nextLine().equals("y")) {
				conn.commit();
				System.out.println("구매 내역 삭제 완료!!! ");
			}
				
			else {
				conn.rollback();
				System.out.println("구매 내역 삭제 취소!!!");
			}
			
			
		}catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		}
		
	}

}












