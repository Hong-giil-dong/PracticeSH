package practice170324;
//1번방에 있는것을 2번방에 복사
//셋업 시작
//이메일 입력 X
//앱? 오라클 원본?
//엔터프라이즈 에디션
//문자 집합 기본값 씀
//전역 데이터 베이스 orcm
//관리 비밀번호 // 각자의 비밀번호

//tiger 비밀번호 통일
//sca 오라클의 러너 전용

//orcm 식별자

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam02 {
	public static void main(String[] ar){
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		String url ="jdbc:oracle:thin:@localhost:1521:orcm";// orcl이 아니라 orcm이다
		String id = "scott";
		String pw = "tiger";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 접속 성공");
		}catch(ClassNotFoundException e){
			System.err.println("Error : " + e.toString());
		}catch(SQLException e){
			System.err.println("Error : " + e.toString());
		}finally{
			System.err.println("작업 종료");
		}
		
	}

}


