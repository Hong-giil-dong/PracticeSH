package practice170321;
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
	protected MyPoint() throws IOException{ //������ : �ʱ�ȭ
		System.out.print("x = ");
		x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		y = Integer.parseInt(in.readLine());
		
	}
	
	protected void disp(){
		System.out.println();
		System.out.print("��(x,y) = " + this.x + this.y);
		
	}
	
}

class Circle extends MyPoint{
	private int r;
	protected Circle() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		System.out.print("R = ");
		this.r = Integer.parseInt(in.readLine());
	}
	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("������ : " +this.r);
	}
	
	
}

class Rect extends MyPoint{
	private int w, h;
	protected Rect() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		System.out.print("�� : ");
		this.w = Integer.parseInt(in.readLine());
		System.out.print("���� : ");
		this.h = Integer.parseInt(in.readLine());
	}

	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("�� : " +this.w + "\t���� : "+this.h);
	}
}


public class Point {
	public static void main(String[] ar) throws IOException{
		MyPoint[] mp = new MyPoint[10];
		for(int i=0;i<mp.length;i++){
			System.out.println("1. ��  2. �簢��  3. ����   4. ���� : ");
			int choose = System.in.read()-48;
			System.in.read();
			System.in.read();
			
			//���õ� �޴��� ��ü�� ��ü �迭�� ������ �Ѵ�.
			switch(choose){
			case 1:
				mp[i] = new Circle();
				break;
			case 2:
				mp[i] = new Rect();
				break;
			case 3:
				System.out.println("=== �� �� ===");
				for(int j = 0; j<i; j++)
					mp[j].disp();
				i--;
				break;
			case 4:
				System.out.println("���α׷��� ���� �մϴ�.");
				System.exit(0);
			}
			
		}
	}

}


*/














