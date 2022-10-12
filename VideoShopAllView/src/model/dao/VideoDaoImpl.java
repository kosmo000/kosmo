package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.VideoDao;
import model.vo.VideoVO;

public class VideoDaoImpl implements VideoDao{
	
	final static String DRIVER	= "oracle.jdbc.driver.OracleDriver";
	final static String URL		= "jdbc:oracle:thin:@192.168.0.2:1521:xe";
	final static String USER	= "PROJECT5";
	final static String PASS	= "12345";
	public VideoDaoImpl() throws Exception{
		

		// 1. 드라이버로딩
		Class.forName(DRIVER);
		System.out.println("1. 드라이버 로딩 성공");
		
	}
	
//	public void insertVideo(VideoVO vo, int count) throws Exception{
//		// 2.
//		Connection con = null;
//		PreparedStatement ps = null;
//		try {
//		con = DriverManager.getConnection(URL, USER, PASS);
//		
//		// 3. sql 문장
//		String sql = "INSERT INTO VIDEO(vNo, genre, vName, director, actor, exp ) "
//				+ " VALUES(seq_video_vno.nextval,?,?,?,?,?)";
//		
//		// 4. sql 전송객체 (PrepareStatement)
//		ps = con.prepareStatement(sql);
//
//
//		ps.setString(1, vo.getGenre());
//		ps.setString(2, vo.getVideoName() );
//		ps.setString(3, vo.getDirector());
//		ps.setString(4, vo.getActor());
//		ps.setString(5, vo.getExp());
//		// 5.전송
//		for (int i = 0; i<count; i++) {
//			ps.executeUpdate();
//		}
//		
//		
//		// 6. 닫기
//		}finally {
//			ps.close();
//			con.close();
//		}
//	}
//	
	public void insertVideo(VideoVO vo, int count) throws Exception{
		// 2. Connection 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
		con = DriverManager.getConnection(URL, USER, PASS);
		
		// 3. sql 문장
		String sql = "INSERT INTO VIDEO(vNo, genre, vName, director, actor, exp ) "
				+ " VALUES(seq_video_vno.nextval,?,?,?,?,?)";
		
		// 4. sql 전송객체 (PrepareStatement)
		ps = con.prepareStatement(sql);


		ps.setString(1, vo.getGenre());
		ps.setString(2, vo.getVideoName());
		ps.setString(3, vo.getDirector());
		ps.setString(4, vo.getActor());
		ps.setString(5, vo.getExp());
		// 5.전송
		for (int i = 0; i<count; i++) {
			ps.executeUpdate();
		}
		
		
		// 6. 닫기
		}finally {
			ps.close();
			con.close();
		}
	}
		
	

	@Override
	public ArrayList selectVideo() throws Exception {
		ArrayList data = new ArrayList();
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			
			// 3. sql 문장
			String sql = "SELECT vNo, vName, director, actor from video";
			
			ps = con.prepareStatement(sql);
			
			// 4. 전송객체
			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			ArrayList temp = new ArrayList();
			temp.add( rs.getString("vNo"));
			temp.add( rs.getString("vName"));
			temp.add( rs.getString("director"));
			temp.add( rs.getString("actor"));
			data.add(temp);
			
		}
		
			return data;	
		
	} finally {
		// 6. ekerl
		
	}
	

}
}