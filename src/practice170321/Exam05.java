package practice170321;
import java.io.IOException;
import java.util.Scanner;

/*
 * 다형성으로 만든 Point, Circle, Rect 클래스의 프로그램을 abstract를 이용하여 적당히 변경시켜 보고 인터페이스를
 * 이용해서도 변경시켜 보시오.
 */

/*
 * 추상화를 이용해서 변경하라는 것의 의미 : 추상 클래스를 만들고 구현할 내용의 추상 메서드를 생성하고
 * 
 */

abstract class Figure { //큰 틀... 이것을 상속받는 클래스에서는 이 안의 추상 메소드를 반드시 구현해야한다
	
	// public abstract void Point(); // 시작 위치 잡는 메소드
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
		System.out.println("점(x,y) = " + this.x + this.y);
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
		System.out.println("반지름 : " + this.r);
	}
}

class Rect extends Point {
	private int w, h;
	protected Rect() throws IOException {
		super();
		System.out.print("너비 : ");
		this.w = Integer.parseInt(sc.nextLine());
		System.out.print("높이 : ");
		this.h = Integer.parseInt(sc.nextLine());
	}
	
	protected void disp() {
		super.disp();
		System.out.println("폭 : " + this.w + "\t높이 : " + this.h);
	}
}

public class Exam05 {
	public static void main(String[] ar) throws IOException{ //
		
		Point[] mp = new Point[10]; // 새로운 point인스턴스 배열을 생성해서 mp 참조변수에 매칭 
		
		for(int i=0;i<mp.length;i++){
			System.out.println("1. 원  2. 사각형  3. 보기   4. 종료 : ");

			int choose = Integer.parseInt(sc.nextLine());
			
			//선택된 메뉴의 객체를 객체 배열에 저장을 한다.
			switch(choose){
			case 1:
				mp[i] = new Circle();
				break;
			case 2:
				mp[i] = new Rect();
				break;
			case 3:
				System.out.println("=== 보 기 ===");
				for(int j = 0; j<i; j++)
					mp[j].disp();
				i--;
				break;
			case 4:
				System.out.println("프로그램을 종료 합니다.");
				System.exit(0);
			}
			
		}
	}
	
}
