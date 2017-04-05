package practice170318;
//문제
// MyPoint 를 확장시킨 Circle, Rect라는 클래스를 활용하여 다음의 조건에 맞는 프로그램을 작성 하시오.
// 조건
// 1. 10개의 도형을 입력 받는다.(원 8개 사각형 2개)
// 2. 그 도형은 원과 사각형 어느 것이던 상관 없다.
// 3. 사용자가 원하는 도형을 입력할 수 있다.
// 4. 입력받는 도중에 사용자가 현재까지 입력된 도형을 볼 수 있어야 한다. 
// 5. '언제든' 프로그램을 종료할 수 있어야한다.
// 6. 상속과 다향성을 최대한 활용하여 작성을 한다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
interface Point {
	float x=0.0f; //가로 위치
	float y=0.0f; //세로 위치
	public abstract void center(); // 센터 위치 지정
}
*/

class List {
	void summary() throws IOException {
		Circle c = new Circle(); 
		RectAndTri r = new RectAndTri();
		Shape s = new Shape();
			
		System.out.println("타입, 위치X, 위치Y, 높이, 너비,  R,  넓이,  색상");
		for(int i=0;i<10;i++) {
			System.out.println(" " + s.type[i] + "   " + s.x[i] +  "   " + s.y[i] + "    " + r.height[i] + "    " + r.width[i] 
					+ "   " + c.r[i] + "   " + s.area[i] + "   " + s.color[i]);
		}
	}
}

class Shape {
	static String[] color= new String[10];
	static int[] type = new int[10];
	static int[] area = new int[10];
	static float[] x= new float[10];
	static float[] y= new float[10];
	static int listNum=0;

	protected static BufferedReader in;
	static{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public void shape() throws IOException{
		
		List l = new List();
		
		for(listNum=0;listNum<10;listNum++){
		System.out.print("도형 입력(1.원  2.삼각형  3.사각형) 4.입력리스트  5.종료) : ");
		type[listNum] = Integer.parseInt(in.readLine());
		
		switch(type[listNum]){
		case 1 : Circle c = new Circle(); break;
		case 4 : l.summary(); break;
		case 5 : System.out.println("종료합니다"); System.exit(0);
		default: RectAndTri r = new RectAndTri(); break;
		}
		
		System.out.print("도형 색상 : ");
		color[listNum] = in.readLine();	
		System.out.print("도형 중심점 X 좌표 : ");
		x[listNum] = Integer.parseInt(in.readLine());
		System.out.print("도형 중심점 Y 좌표 : ");
		y[listNum] = Integer.parseInt(in.readLine());
		}
	}
}

class Circle extends Shape {
	final double pi = Math.PI;
	static double[] r = new double[10];
	
	public Circle() throws IOException {
		super();
		System.out.print("r = ");
		r[listNum] = Double.parseDouble(in.readLine());
		area[listNum] = (int)(r[listNum]*r[listNum]*pi);
	}
}


class RectAndTri extends Shape {
	static int[] height = new int[10];
	static int[] width = new int[10];

	public RectAndTri() throws IOException {
		super();
		System.out.print("높이 = ");
		height[listNum] = Integer.parseInt(in.readLine());
		System.out.print("너비 = ");
		width[listNum] = Integer.parseInt(in.readLine());
		
		if(type[listNum]==2){
		area[listNum] = (height[listNum]*width[listNum])/2;
		}else{		
		area[listNum] = height[listNum]*width[listNum];
		
		}
	}
}

public class FigureControl {
	public static void main(String[] args) throws IOException {
		for(int i=0;i<10;i=0){
		Shape s = new Shape();
		s.shape();
		}
	}
}
// 순번, 타입, 색, 너비, 높이, 반지름, 넓이 저장
// 인풋 리스트


















