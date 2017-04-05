package practice170321;
/**
 * 6.상속과 다형성을 최대한 활용하여 작성을 한다.
 * 
 * abstract과 인터페이스
 * 
 * public static int x = 10;
 * static public int x = 10;
 * private final int x = 10;
 * final private int x = 10;
 * 
 * 접근제한자 지정예약 클래스명 extends 상위클래스 implements 상위 인터페이스
 *
 */

abstract class A{// 추상 클래스 A를 생성
	//일반 클래스의 멤버(field, Method, Construct-생성자), 추상 메서드를 가진다.
	//추상 메소드는 내용부를 가지지 않고 이름만 가지고 있는 메소드이다.
	//반드시  오버라이딩(재정의)이 되어야만 한다.
	//
	// 추상 클래스를 상속받은 클래스는 추상 클래스의 추상 메소드를 반드시 오버라이딩을 하여야 한다.
	// 만일 재정의를 하지 않으면 상속을 받은 하위 클래스도 추상 클래스로 인식을 하게 된다.
	// 
	public abstract void disp(); // 어느 곳에서나 사용 가능한 반환값이 없는 추상메소드를 생성하였으므로 상속받는 클래스에서
	// 반드시 재정의 해서 사용해야함
}

class B extends A{ // 클래스 B를 생성하고 부모 A클래스(추상클래스)를 상속 받아서 사용

	@Override
	public void disp() { // 부모 클래스의 메소드를 오버라이딩 함(추상화 클래스이므로 반드시 해줘야함)
		// TODO Auto-generated method stub
		System.out.println("Success"); // 오버라이딩한 메소드의 내용 (출력)
		
	} //Overriding Error
	
}
public class Exam01 { 
	public static void main(String[] ar){ //메인 메소드
		//A ap = new A(); //컴파일 에러, 객체 생성 불가
		B bp = new B(); 
		A cp = new B();
		
		bp.disp();
		cp.disp();
	}
}
