package practice170321;
interface A1{ //인터페이스 A1 생성
	int w = 10; // 멤버변수 w를 int타입으로선언하고 10으로 초기화
	static int x = 20; // static이므로 인터페이스가 실행될때 바로 불러와짐 멤버변수 x를 int타입으로 선언하고 20으로 초기화
	final int y = 30; // final이므로  선언하고 30으로 초기화한 y값을 변경 불가
	public static final int z = 40; //어느클래스에서나 접근가능하고 40값으로 선언후 변경 불가한 int타입 변수 z
	public abstract void aaa(); //추상화 메소드 aaa를 선언한 곳이므로 ;로 문장끝
}

class B1 implements A1{
	public void aaa(){
		System.out.println("aaa메소드");
	}
	public void bbb(){
		System.out.println("bbb메소드");
	}
}
public class Exam04 {
	public static void main(String[] ar){
		/*A1 ap = new A1();
		ap.w = 100;
		System.out.println("ap.w = " + ap.w); //10
		System.out.println("ap.x = " + ap.x); //20
		System.out.println("ap.y = " + ap.y); //30
		System.out.println("ap.z = " + ap.z); //40*/
		B1 ap = new B1();
		ap.aaa();
		ap.bbb();
	}
}
