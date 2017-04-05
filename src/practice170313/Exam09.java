package practice170313;
/*
 * 밑면과 높이 정보를 저장할 수 있는 클래스를 정의 한다.
 * 생성과 동시에 초기화가 가능한 생성자도 정의 한다.
 * 밑변과 높이 정보를 변경시킬 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 정의한다.
 */
import java.io.*;
import java.util.*;

class Triangle{
	int Base;
	int Height;
	public Triangle(int b, int h){
		Base = b;
		Height = h;
	}
	public int area(){
		return Base*Height/2;
	}
}
public class Exam09 {
	public static void main(String[] ar){

		Triangle tri = new Triangle(6,10);

		System.out.println("넓이 : " + tri.area());		
	}
}
