package practice170321;
/**
 * 인터페이스의 정의
 * 1. 다중 상속을 위한 클래스 선언
 * 2. 다형성에 의한 클래스 제어
 *
 *인터페이 포함 멤버
 *1. 필드
 *- 무조건 public static final 멤버 필드 이다.
 *- public static final을 기술 하던 static만 기재하던 또는 아무것도 기재하지 않던 무조건 public static final로 인식을 한다.
 *2. 메소드
 *- 무조건 public abstract 메서드이다.
 *- 정의부를 가질 수 없다.
 *- 인터페이스도 다형성이 목적이므로 모든 메서드에는 abstract가 붙는다.
 *3. 정적 중첩 클래스
 *- 인터페이스가 가지는 중첩 클래스는 자동적으로 static이 붙는다
 *
 */

interface A{
	
}

interface B{
	
}

interface C extends A,B implements E {//인터페이스는 두개를 '상속' 받을수 있음 클래스라면 한개만 상속가능
	// 인터페이스 안에서 implements 는 사용이 안됨.

}

class E {
	
}

class F { }
class D extends E, F{ }

public class Exam03 extends E implements A, B, C {

}
