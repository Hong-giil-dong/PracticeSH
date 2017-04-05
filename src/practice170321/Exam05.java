package practice170321;
import java.io.IOException;
import java.util.Scanner;

/*
 * ���������� ���� Point, Circle, Rect Ŭ������ ���α׷��� abstract�� �̿��Ͽ� ������ ������� ���� �������̽���
 * �̿��ؼ��� ������� ���ÿ�.
 */

/*
 * �߻�ȭ�� �̿��ؼ� �����϶�� ���� �ǹ� : �߻� Ŭ������ ����� ������ ������ �߻� �޼��带 �����ϰ�
 * 
 */

abstract class Figure { //ū Ʋ... �̰��� ��ӹ޴� Ŭ���������� �� ���� �߻� �޼ҵ带 �ݵ�� �����ؾ��Ѵ�
	
	// public abstract void Point(); // ���� ��ġ ��� �޼ҵ�
	// public abstract void 
}

interface Figure1 {
	public abstract void point(); 
}



class Point extends Figure{
	private int x;
	private int y;
	static Scanner sc;
	
	protected Point() throws IOException {
		System.out.print("x = ");
		x = Integer.parseInt(sc.nextLine());
		System.out.print("y = ");
		y = Integer.parseInt(sc.nextLine());
	}

	protected void disp(){
		System.out.println();
		System.out.println("��(x,y) = " + this.x + this.y);
	}
}

class Circle extends Point {
	private int r;
	protected Circle() throws IOException {
		super();
		System.out.print("R = ");
		this.r = Integer.parseInt(sc.nextLine());
	}
	
	protected void disp() {
		super.disp();
		System.out.println("������ : " + this.r);
	}
}

class Rect extends Point {
	private int w, h;
	protected Rect() throws IOException {
		super();
		System.out.print("�ʺ� : ");
		this.w = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		this.h = Integer.parseInt(sc.nextLine());
	}
	
	protected void disp() {
		super.disp();
		System.out.println("�� : " + this.w + "\t���� : " + this.h);
	}
}

public class Exam05 {
	public static void main(String[] ar) throws IOException{ //
		
		Point[] mp = new Point[10]; // ���ο� point�ν��Ͻ� �迭�� �����ؼ� mp ���������� ��Ī 
		
		for(int i=0;i<mp.length;i++){
			System.out.println("1. ��  2. �簢��  3. ����   4. ���� : ");

			int choose = Integer.parseInt(sc.nextLine());
			
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
