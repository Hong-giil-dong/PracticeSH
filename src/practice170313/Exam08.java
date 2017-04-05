package practice170313;
/*
 * 밑면과 높이 정보를 저장할 수 있는 클래스를 정의 한다.
 * 생성과 동시에 초기화가 가능한 생성자도 정의 한다.
 * 밑변과 높이 정보를 변경시킬 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 정의한다.
 */
import java.io.*;

public class Exam08 {
	public static void main(String[] args){
		
		
		Triangle Tri = new Triangle();
		
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));

		
		System.out.print("삼각형의 밑변 입력 (정수) : ");
		Triangle TriBase = new TriBase();
		TriBase = Integer.parseInt(in.readLine());
		
		System.out.print("삼각형의 높이 입력 (정수) : ");
		Triangle TriHeight = new TriHeight();
		TriHeight = Integer.parseInt(in.readLine());
	}

}
