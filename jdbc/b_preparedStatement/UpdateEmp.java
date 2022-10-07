package b_preparedStatement;

import java.sql.*;

public class UpdateEmp {

	public static void main(String[] args) {
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공");
			
			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.79:1521:xe";
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("디비 연결 성공");
			
			
			// 입력값
			int sabun = 7698;
			String saname = "아무개";
			int salary = 15000;
		
			// 7698 사원의 이름과 월급을 변경하세요
			String sql = "UPDATE INTO emp(empno = 7698, ename = '아무개', sal = 15000)";
					
			
			// 4. SQL 전송객체
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, sabun);
			stmt.setString(2, saname);
			stmt.setInt(3, salary);
			
			// 5. SQL 전송
			/*		- ResultSet executeQuery()	:	SELECT
			 * 		- int executeUpdate()	:	INSERT/DELETE/UPDATE
			 */
			int result = stmt.executeUpdate();	// ************* 이미 sql 연결함
			System.out.println(result + "행을 실행");
			
			// 6. 닫기
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("DB 실패 :" + e);
		}
		

	}

}
