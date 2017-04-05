package practice170318;
//문제
// MyPoint 를 확장시킨 Circle, Rect라는 클래스를 활용하여 다음의 조건에 맞는 프로그램을 작성 하시오.
// 조건
// 1. 10개의 도형을 입력 받는다.( 원 8개 사각형 2개)
// 2. 그 도형은 원과 사각형 어느 것이던 상관 없다.
// 3. 사용자가 원하는 도형을 입력할 수 있다. -> 도형의 정보, 도형의 위치값 , 가로, 세로, 반지름을 저장하는  전역클래스 변수를 설정
// 4. '언제든' 현재까지 입력된 도형을 볼 수 있어야 한다. 
// 5. '언제든' 프로그램을 종료할 수 있어야한다.
// 6. 상속과 다향성을 최대한 활용하여 작성을 한다.
/*
 * 만들어야 할 클래스
 * 도형의 위치,타입 정보 클래스
 * 
 * 삼각형에 관한 클래스
 * 사각형에 관한 클래스
 * 원에 관한 클래스
 * 메인 메소드가 들어가는 클래스
 * 
 */


/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class MyPoint{
	private int x;
	private int y;
	protected static BufferedReader in;
	static{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	public MyPoint() throws IOException{
		System.out.print("X = ");
		this.x = Integer.parseInt(in.readLine());
		System.out.print("Y = ");
		this.y = Integer.parseInt(in.readLine());
	}
	protected void disp(){
		System.out.println();
		System.out.println("점(x,y) =(" + this.x +" , "+this.y + ")");
	}
}

class Circle extends MyPoint{ //원의 넓이값을 출력
	private int r;
	private double area;

	public Circle() throws IOException {
		super();
		System.out.print("R = ");
		this.r = Integer.parseInt(in.readLine());
	}

	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		
		super.disp();
		System.out.println("R = " + this.r);
		area = 3.141592 * (r * r);
		System.out.println("넓이 = " + this.area);
	}
	
}

class Rect extends MyPoint{//사각형의 넓이 값
	private int w;
	private int h;
	private int area;

	public Rect() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		System.out.print("W= ");
		this.w = Integer.parseInt(in.readLine());
		System.out.print("H = ");
		this.h = Integer.parseInt(in.readLine());
	}

	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("W = " + this.w);
		System.out.println("H = " + this.h);
		area = h * w;
		System.out.println("넓이 = " + this.area);
	}
	
	
	
}

public class Exam05 {
	public static void main(String[] ar) throws IOException{
		
		Circle c = new Circle();
		c.disp();
		Rect r = new Rect();
		r.disp();
		
		
	}

}


*/