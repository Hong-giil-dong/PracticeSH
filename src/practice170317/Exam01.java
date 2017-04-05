package practice170317;
/*
 * -특정 메소드에 한정적인 용도로 사용할 클래스
 * -접근 제한자와 지정 예약어를 사용할 수 없다
 * 
 * 상속과 다형성
 * 상속이란?
 * 어떤 클래스의 모든 내용을 그대로 가져온다.
 * 상속을 사용하는 이유는 클래스를 효율적으로 사용하기 위해서, 재사용성의 극대화
 * 
 *  
 * Object와 super
 * 
 * 오버라이딩의 규칙
 * - 오버라이딩 할 때에는 접근 제한자의 범위가 같거나 커야 한다.
 * - 오버라이딩 된 하위 클래스의 메서드에 throws 구문이 있으면 상위 클래스의 
 * 오버라이딩을 준 메서드도 반드시 해당 예외 클래스에 준하는 throws를 가지고 있어야한다
 * 
 * 
 */
class A{
	int a= 10;
}

class B extends A{
	A ap = new A();
	int b = 20;
	//int f = a+b;
}

class C extends B{
	B bp = new B();
	int c = 30;
	int sum = a+b+c;
}

class D extends C{
	C cp = new C();
	int d = 40;
	int sum = a+b+c+d;
	public void disp(){
		System.out.println("총합 : " + sum);
	}
}

public class Exam01 extends D{
	public static void main(String[] ar){
		
		D dp = new D();
		int e = dp.d + dp.cp.c +dp.cp.bp.b + dp.cp.bp.ap.a;
		System.out.println("총합 : " + e);
		int sum = dp.a + dp.b + dp.c + dp.d;
		System.out.println("총합 : " + sum);
		
		dp.disp();
		
	}

}














