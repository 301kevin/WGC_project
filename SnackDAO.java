import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SnackDAO {
	// 1. 드라이버 등록확인
	public SnackDAO() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		// 2. db 접속하기 함수
		public Connection getConnection() {
			Connection conn = null;
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "C##dbexam";
			String password = "m1234";

			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// 접속 성공 : Connection 객체, 접속 실패 : null
			return conn;
		}
		// 3.3. update
		public int updatesnack(String foodname) {
			String sql = "update snack set amount=amount-1 where foodname =? ";
			int result = 0;
			// 1) DB 접속하기
			Connection conn = getConnection();
			PreparedStatement pstmt = null;
			try {
				// 2) sql 작업
				pstmt = conn.prepareStatement(sql);
				pstmt .setString(1, foodname);
				// 2-1) sql문 전송 2-2) 응답을 기다림 2-3) 전달된 값을 리턴함
				// => update 일 경우 , 처리된 데이터 갯수 저장
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
		
}
