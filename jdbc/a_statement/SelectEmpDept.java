package a_statement;

import java.sql.*;

import javax.swing.AbstractSpinnerModel;




public class SelectEmpDept {

	public static void main(String[] args) {

		//1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공");
			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.79:1521:xe";
			String user = "scott";
			String pass = "tiger";
						
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("디비 연결 성공");
			
			// 3. SQL 문장 만들기 (*****)
			//		-> 20번 부서의 사원들의 정보 - 사번, 사원명, 월급, 부서명, 근무지
			String sql = "select e.empno, e.ename, e.sal, e.job, d.loc from emp e inner join dept d on e.deptno=d.deptno where deptno=20";
			
			// 4. 전송객체 얻어오기
			Statement stmt = con.createStatement();
			
			// 5. SQL 전송
						/*		- ResultSet executeQuery()	:	SELECT
						 * 		- int		executeQuery()	:	INSERT/DELETE/UPDATE
						 */
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				// 여기에 출력
				int empno = rs.getInt("e.EMPNO");
				String ename = rs.getString("e.ENAME");
				int sal = rs.getInt("e.SAL");
				String job = rs.getString("e.JOB");
				int deptno = rs.getInt("e.DEPTNO");
				String loc = rs.getString("d.LOC");
				
				System.out.println(empno + "/" + ename + "/" + sal + "/" + job + "/" + loc );
			}
			
			// 6. 닫기
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("실패: " + e);
		}
		

	}

}
