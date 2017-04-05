package practice170318;
//����
// MyPoint �� Ȯ���Ų Circle, Rect��� Ŭ������ Ȱ���Ͽ� ������ ���ǿ� �´� ���α׷��� �ۼ� �Ͻÿ�.
// ����
// 1. 10���� ������ �Է� �޴´�.(�� 8�� �簢�� 2��)
// 2. �� ������ ���� �簢�� ��� ���̴� ��� ����.
// 3. ����ڰ� ���ϴ� ������ �Է��� �� �ִ�.
// 4. �Է¹޴� ���߿� ����ڰ� ������� �Էµ� ������ �� �� �־�� �Ѵ�. 
// 5. '������' ���α׷��� ������ �� �־���Ѵ�.
// 6. ��Ӱ� ���⼺�� �ִ��� Ȱ���Ͽ� �ۼ��� �Ѵ�.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
interface Point {
	float x=0.0f; //���� ��ġ
	float y=0.0f; //���� ��ġ
	public abstract void center(); // ���� ��ġ ����
}
*/

class List {
	void summary() throws IOException {
		Circle c = new Circle(); 
		RectAndTri r = new RectAndTri();
		Shape s = new Shape();
			
		System.out.println("Ÿ��, ��ġX, ��ġY, ����, �ʺ�,  R,  ����,  ����");
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
		System.out.print("���� �Է�(1.��  2.�ﰢ��  3.�簢��) 4.�Է¸���Ʈ  5.����) : ");
		type[listNum] = Integer.parseInt(in.readLine());
		
		switch(type[listNum]){
		case 1 : Circle c = new Circle(); break;
		case 4 : l.summary(); break;
		case 5 : System.out.println("�����մϴ�"); System.exit(0);
		default: RectAndTri r = new RectAndTri(); break;
		}
		
		System.out.print("���� ���� : ");
		color[listNum] = in.readLine();	
		System.out.print("���� �߽��� X ��ǥ : ");
		x[listNum] = Integer.parseInt(in.readLine());
		System.out.print("���� �߽��� Y ��ǥ : ");
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
		System.out.print("���� = ");
		height[listNum] = Integer.parseInt(in.readLine());
		System.out.print("�ʺ� = ");
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
// ����, Ÿ��, ��, �ʺ�, ����, ������, ���� ����
// ��ǲ ����Ʈ


















