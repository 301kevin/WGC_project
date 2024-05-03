package Reservaion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.DefaultListModel;

public class TimeDAO {
	// 1. db 연결
	public TimeDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("연결 완 ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 2. 로그인
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "C##dbexam";
		String password = "m1234";

		try {
			conn = DriverManager.getConnection(url, user, password);
			// System.out.println("로그인 완");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 방 나열  나열
		public List<TimeDTO> roomasc() {
			List<TimeDTO> list = new ArrayList<TimeDTO>();

			String sql = "select * from room order by roomnum,num asc";

			Connection conn = getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){

					String room = rs.getString("room");
					String time = rs.getString("time");
					int number = rs.getInt("number");

					TimeDTO dto = new TimeDTO(room,time,number);
					list.add(dto);

				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return list;
		}
	
	
	// 시간순 나열
	public List<TimeDTO> timeasc(int num) {
		List<TimeDTO> list = new ArrayList<TimeDTO>();

		String sql = "select * from room where ? order by roomnum,num asc";

		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while(rs.next()){

				String room = rs.getString("room");
				String time = rs.getString("time");
				int number = rs.getInt("number");

				TimeDTO dto = new TimeDTO(room,time,number);
				list.add(dto);

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
