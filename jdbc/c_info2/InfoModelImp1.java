package c_info2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelImp1  {

	

		final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
		final static String URL    = "jdbc:oracle:thin:@192.168.0.79:1521:xe";
		final static String USER   = "scott";
		final static String PASS   = "tiger";

	public InfoModelImp1() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName(DRIVER);
		System.out.println("드라이버 로딩 성공");
	}

	/*
	 * 사용자 입력값을 받아서 DB에 저장하는 역할
	 */
	public void insertInfo(InfoVO vo) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
		con = DriverManager.getConnection(URL, USER, PASS);
		
		// 3. sql 문장
		String sql = "INSERT INTO info_tab(name, jumin, tel, gender, age, home) "
				+ " VALUES(?,?,?,?,?,?)";
		
		// 4. 전송객체
		ps = con.prepareStatement(sql);
		// ? 세팅 - #
		ps.setString(1, vo.getName());
		ps.setString(2, vo.getId());
		ps.setString(3, vo.getTel());
		ps.setString(4, vo.getGender());
		ps.setInt(5, vo.getAge());
		ps.setString(6, vo.getHome());
		// 5.전송
		ps.executeUpdate();
		
		}finally {
		
		// 6. 닫기
			ps.close();
			con.close();
		}
	}
		
		
		
		public ArrayList<InfoVO> selectAll() throws SQLException {
			// 2. 연결객체 얻어오기
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
			con = DriverManager.getConnection(URL, USER, PASS);
			
			// 3. sql 문장
			String sql = "SELECT * FROM Info_tab";
					
			
			// 4. 전송객체
			ps = con.prepareStatement(sql);
			
			// 5.전송
			rs = ps.executeQuery();
			
			ArrayList<InfoVO> list = new ArrayList<InfoVO>();
			while(rs.next()) {
				InfoVO vo = new InfoVO();
				vo.setName( rs.getString("NAME"));
				vo.setId( rs.getString("JUMIN"));
				vo.setTel( rs.getString("Tel"));
				vo.setAge( rs.getInt("Age"));
				vo.setGender( rs.getString("GENDER"));
				vo.setHome( rs.getString("HOME"));
				
				list.add(vo);
			}
			return list;
			}finally {
			
			// 6. 닫기
				rs.close();
				ps.close();
				con.close();
			} // end fo 
	} // end of selectAll()

		public InfoVO selectByTel(String tel) throws SQLException {
			// 2. 연결객체 얻어오기
			Connection con = null;
			PreparedStatement ps = null;
			InfoVO vo = new InfoVO();
			try {
				con = DriverManager.getConnection(URL, USER, PASS);
				// 3. sql 문장
				String sql ="SELECT * FROM info_tab WHERE tel=?";
				// 4. 전송객체 얻어오기
				ps = con.prepareStatement(sql);
				ps.setString(1, tel);
				// 5. 전송
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					  vo.setName( rs.getString("NAME"));
					  vo.setId( rs.getString("JUMIN"));
					  vo.setTel( rs.getString("Tel"));
					  vo.setAge( rs.getInt("AGE"));
					  vo.setGender( rs.getString("GENDER"));
					  vo.setHome( rs.getString("HOME"));
				}return vo;
			} finally {
				//6. 닫기
				ps.close();
				con.close();
			}
			
		}// end of selectByTel()

		

		/*
		 * 메소드명 : delete
		 * 인자    : 전화번호
		 * 리턴값   : 삭제한 행 수
		 * 역할    : 전화번호를 넘겨받아 해당 전화번호의 레코드를 삭제
		 */
		
		
		public int deleteByTel(String tel) throws SQLException {
			// 2. 연결객체 얻어오기
			Connection con = null;
			PreparedStatement ps = null;
			InfoVO vo = new InfoVO();
			int count;
			
			try {
				con = DriverManager.getConnection(URL, USER, PASS);
				// 3. sql 문장
				String sql ="DELETE FROM info_tab WHERE tel = ? ";
				
				// 4. 전송객체 얻어오기
				ps = con.prepareStatement(sql);
				ps.setString(1, tel);
				// 5. 전송
				count = ps.executeUpdate();                    
	           
				 return count;
				 
			}catch (SQLException e) {

	            System.out.println("[SQL Error : " + e.getMessage() + "]");
	            return 0;
	        } finally {

	            //사용순서와 반대로 close 함
	            
	            }
		}
		public void update(InfoVO vo) throws SQLException {
			// 2. 연결객체 얻어오기
			Connection con = null;
			PreparedStatement ps = null;
			try {
			con = DriverManager.getConnection(URL, USER, PASS);
			
			// 3. sql 문장
			String sql = "UPDATE info_tab "
					+ " SET NAME = ? , JUMIN = ?, TEL = ?, GENDER = ?, AGE = ?, HOME = ?" 
					+ " where tel = ?";
					
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getTel());
			ps.setString(4, vo.getGender());
			ps.setInt(5, vo.getAge());
			ps.setString(6, vo.getHome());
			ps.setString(7, vo.getTel());
			
			// 업로드
			ps.executeUpdate();
			}catch (SQLException e) {
				System.out.println(e + "=> fail");
			} 
			
			finally {
			
			// 6. 닫기
				
				ps.close();
				con.close();
			} // end fo 
	} // end of selectAll()

		
		
}
