package practice170321;
class A4 extends Thread{
	public void run(){
		System.out.println("A4 실행");
	}
}

class B4 implements Runnable{

	@Override
	public void run() {
		System.out.println("B4 실행");
		
	}
}

public class Exam08 {
	public static void main(String[] ar){//메인 메소드 실행
		A4 ap = new A4(); // A4의 인스턴스 생성 및 초기화 
		Thread bp = new Thread(new B4());
		ap.setPriority(3); // ap인스턴스의 setpriority 메소드에 3의 매개변수 값을 주고 동작시킴
		// 따라서 ap의 우선순위 값이 3으로 설정됨
		bp.setPriority(8); // bp인스턴스의 setpriority 메소드에 8의 매개변수 값을 주고 동작시킴
		// 따라서 bp의 우선순위 값이 8로 설정됨
		
		ap.start(); // ap인스턴스의 start메소드 실행 
		bp.start(); // ap인스턴스의 start메소드 실행
		// 출력되는 순서는 
		
		
		int max = Thread.MAX_PRIORITY;
		int normal = Thread.NORM_PRIORITY;
		int min = Thread.MIN_PRIORITY;
		System.out.println("MAX = " + max);
		System.out.println("NORMAL = " + normal);
		System.out.println("MIN = " + min);
	}

}

//jdbc?
//오라클?


