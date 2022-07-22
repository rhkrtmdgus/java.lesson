package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertTest {

	public static void main(String[] args) {

		// db 연결 시도해 봅니다. 성공하면 Connection 객체가 만들어집니다.
		
		Connection conn = OracleConnectionUtil.connect();
		
		System.out.println(conn);
		
		//Connection 객체를 이용해서 SQL을 실행할 수 있습니다.
		//PreparedStatement 객체는 SQL을 컴파일해서 저장합니다.
		
		String sql = "INSERT INTO tbl_custom (custom_id, name, email, age) "
				+ "VALUES (?, ?, ?, ?)"; // 주의 sql 마지막 ; 쓰지 않도록 한다.
		
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("고객 ID ( unique한 값 ) >>> ");
		String id = sc.nextLine();
		System.out.print("고객 성명 >>> ");
		String name = sc.nextLine();
		System.out.print("고객 이메일 >>> ");
		String email = sc.nextLine();
		System.out.print("고객 나이 >>> ");
		int age = Integer.parseInt(sc.nextLine());

		try {
			// 1번
			pstmt = conn.prepareStatement(sql);
			
			
			// 2번 SQL에 바인딩 될 값 설정 : 데이터 타입에 따라 setXXXXX() 메소드 선택.
			pstmt.setString(1, id);
			pstmt.setNString(2, name);
			pstmt.setString(3, email);
			pstmt.setInt(4, age);
			
			// 3번
			pstmt.execute();  // insert, update, delete SQL 실행합니다.
			
			System.out.println("------------------------"
					+ "\n고객이 등록되었습니다.");
			System.out.print(String.format("-------------------------\n"
					+ "고객 ID : %s\n고객 성명 : %s\n고객 이메일 : %s\n고객 나이 : %d\n",
					id, name, email, age));
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 입니다. : " + e.getMessage());
			//e.printStackTrace();
		}finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		
		
		
		
	}
	
	

}
