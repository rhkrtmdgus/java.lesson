package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleConnectionUtil {
	
	public static Connection connect() {
		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:XE";   //데이터베이스 URL - 디비버에서 확인가능합니다.
					//jdbc 프로토콜, 오라클 지정, localhost는 ip로 대체
		String driver="oracle.jdbc.driver.OracleDriver";     //오라클 드라이버클래스(패키지명.클래스명)
		String user ="c##idev";				//접속할 계정 정보 - 계정이름
		String password="1234";				//            ㄴ 패스워드
		
		try {
			//메모리에 데이터베이스 드라이버를 로드합니다.(로드-> 적재)
			Class.forName(driver);
			
	//DriverManager 클래스는 메모리에 로드된 드라이버 클래스를 관리하고		
	//DriverManager 클래스의 메소드 getConnection 으로 데이터베이스(오라클) 드라이버에 대한 Connection 구현객체를 생성
	//                                                    			ㄴ    인터페이스 Connection 타입으로 참조합니다.
			conn = DriverManager.getConnection(url,user,password);    //db 연결에 필요한 정보 인자로 전달
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 드라이버 로드에 문제가 생겼습니다. : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 및 사용에 문제가 생겼습니다. : " + e.getMessage());
		} 
		
		return conn;   //생성된 Connection 객체 리턴합니다.
	}
	
	//오라클 연결 Connection 객체 close 메소드 - 인자 타입 Connection
	public static void close(Connection conn, PreparedStatement pstmt) {
		if(conn != null)   //conn 이 널이아닐때만 close 실행하도록 합니다.
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 종료에 문제가 생겼습니다. : " + e.getMessage());
			}
	}
}
// jdbc 실습 순서
//1. jdbc 라이브러리 추가
//ㄴ 프로젝트 우클릭 -> 메뉴중에 Build Path
//  -> Configure build path...
//  -> Libraries 탭 -> Add External jar
//  -> 파일 ojdbc11. jar 찾아서 추가
//  ㄴ 패키지 익스플로러에서 확인 - referenced libraries


// 2. OracleConnectionUtil 클래스 작성

//데이터베이스 연결 : Connection 구현 객체를 생성하고 리턴해주는 클래스 메소드를 작성
//         ㄴ1) jdbc 드라이버를 메모리에 로드 시켜야 합니다.
//          ㄴ Class.forName("패키지명.클래스")
//              ㄴ 오라클 드라이버 클래스
//          2) DriverManager.getConnection 메소드 실행. 인자 url, user, password db 접속 정보를 이용하여
/*			Connection 객체 생성
 * 3. DBConnectionTest 클래스 
 *   - 2번에서 만든 OracleConnectionUtil 클래스 connect() 메소드 테스트
 *   - 정상 연결 확인이 되면 SQL insert 실행 테스트
 *   
 * 4. InsertTest 클래스
 *   - 3번과 동일한 insert SQL 테스트
 *   - tbl_custom  테이블에 insert
 *   - PreparedStatement 를 이용합니다. 실행에 필요한 데이터를 동적 바인딩을 합니다. ? 기호 사용
 *   - PreparedStatement 인터페이스 입니다. PreparedStatement 타입 참조 변수는 PreparedStatement의 추상 메소드를
 *     구현한 구현 객체. conn.prepareStatement(sql)는 사용하는 오라클 드라이버 클래스를 통해 sql을 저잦ㅇ하고 실행할 객체가 생성됩니다.
 *     
 * 5. InsertBuyTest 클래스
 *   - tbl_buy 테이블에 insert               -- 여기까지 07월 05일 수업내용
 *   
 *
 * 6. SelectTest
 * 
 * 1) select SQL은 pstmt.executeQuery() 메소드 실행
 * 2)   실행 결과 객체는 ResultSet 타입으로 참좀
 * 3) rs.next() 메소드는 조회결과 행들을 순서대로 접근합니다 행이 있으면 true, 없으면 false 리턴
 * 4) rs.get XXX ()은 특정 컬럼 값 가져오기
 *   
 * 참고 : pstmt.setXXX()은 SQL 실행에 필요한 값 바인딩 (전달)
 *   
 * 7. select 결과를 자바에서 저장하기 > list 사용. List<E>, <E>는 제네릭 타입
 */

//1. check_member 프로시저 실행
//2. check_book 프로시저 실행
//3. 2번에서 없는 책 오류 확인하고 해결하기
//4. 회원IDX 와 도서명을 입력받아서 실행


