package practice170315;
/*
 * this, static, final
 * this : 클래스 자기 자신을 참조하는 객체(호출하는 객체와는 다름)
 * 0번째 매개변수 - 자기클래스 this
 * 모든 멤버 필드에 접근 객체 - this.변수명
 * 
 * static : 공용변수를 위한 지정 예약어
 * static field : 하나의 클래스로 생성된 모든 객체가 공유하는 공간
 * static 멤버 필드의 초기화
 * static {초기화 내용}
 * 
 *  응용프로그램 실행 순서
 *  static -> main -> finalize
 */

public class Exam10 {
	private int x;
	private int y;
	Exam10(){
		x=0;
		y=0;
	}
	
	
	Exam10(int x, int y){
		this.x=x;// 굳이 this를 사용하지 않더라도 만들수 있지만 나중에 확인할때 this를 사용한 쪽이 변수가 어느쪽인지 확인하는데 편하다
		this.y=y;
	}
	public void disp(){
		System.out.println("X = "+x+"\tY= "+y);
	}
	public static void main(String[] ar){
		Exam10 ex = new Exam10(100, 200);
		ex.disp();
	}
	
}


