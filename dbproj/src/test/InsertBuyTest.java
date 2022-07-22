package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertBuyTest {
	
	public static void main(String[] args) {
		
	
	//tbl_buy 테이블에 insert 테스트 : sana97 회원이 GALAXY22를 1개 구매
	//values (?, ?, ...) 동적 바인딩으로 SQL을 먼저 컴파일하고 실행 값은 실행 전에 전달.
	Connection conn = OracleConnectionUtil.connect();
	if(conn != null) System.out.println("데이터 베이스 연결 완료!!");
	String sql = "INSERT INTO tbl_buy(custom_id, pcode, QUANTITY, BUYNO) "
			+ "VALUES (?, ?, ?, tblbuy_seq.nextval)";
	
	PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);
	try {
		//conn.setAutoCommit(false);  // 오토 커밋 해제
		
		pstmt = conn.prepareStatement(sql);
		System.out.print("구매 고객 ID >>> ");
		pstmt.setNString(1, sc.nextLine());
		System.out.print("구매 상품 코드 >>> ");
		pstmt.setNString(2, sc.nextLine());
		System.out.print("구매 수량 >>> ");
		pstmt.setInt(3, Integer.parseInt(sc.nextLine()));
		
		pstmt.execute();
		System.out.println("\n등록 완료");
		
		
		//conn.commit(); // 트랜잭션 commit  
		
	} catch (SQLException e) {
		System.out.println("SQL 실행 오류 : " + e.getMessage());
//		try {
//			//conn.rollback(); // 롤백
//		} catch (SQLException e2) {
//			e2.printStackTrace();
//		}
		
		
	} finally {
		OracleConnectionUtil.close(conn, pstmt); // conn.close할 때 commit 실행.
	}
	
	
	
	}
}
