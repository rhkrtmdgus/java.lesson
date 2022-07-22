package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import jdbc.util.OracleConnectionUtil;
import vo.CustomVo;

public class SelectListTest {

	public static void main(String[] args) {
		
		String sql = "SELECT * FROM tbl_custom";
		ResultSet rs = null;
		List<CustomVo> list = new ArrayList<>();
		Connection conn = OracleConnectionUtil.connect();
		try (
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CustomVo vo = new CustomVo(rs.getNString(1),
						rs.getNString(2),
						rs.getNString(3),
						rs.getInt(4),
						rs.getDate(5));
				list.add(vo);
			}
			
			System.out.println(list);
			
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		
	}

}
