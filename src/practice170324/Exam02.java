package practice170324;
//1���濡 �ִ°��� 2���濡 ����
//�¾� ����
//�̸��� �Է� X
//��? ����Ŭ ����?
//������������ �����
//���� ���� �⺻�� ��
//���� ������ ���̽� orcm
//���� ��й�ȣ // ������ ��й�ȣ

//tiger ��й�ȣ ����
//sca ����Ŭ�� ���� ����

//orcm �ĺ���

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
		
		String url ="jdbc:oracle:thin:@localhost:1521:orcm";// orcl�� �ƴ϶� orcm�̴�
		String id = "scott";
		String pw = "tiger";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε�");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB ���� ����");
		}catch(ClassNotFoundException e){
			System.err.println("Error : " + e.toString());
		}catch(SQLException e){
			System.err.println("Error : " + e.toString());
		}finally{
			System.err.println("�۾� ����");
		}
		
	}

}


