package practice170317;
//다형성에서 멤버 필드로의 접근
// 필드는 다형성으로 표현 되었을 때는 객체를 통해 부모 클래스의 멤버 필드에만 접근
//

class A4{
	int x = 100;
}

class B4 extends A4{
	int y = 200;
}

public class Exam07 {
	public static void main(String args[]) {
		A4 ap 
		ㅁ= new B4(); // 다형적 표현
		System.out.println("x = " + ap.x);
		System.out.println("y = " + ap.y);
	}
}
