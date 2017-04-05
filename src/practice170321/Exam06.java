package practice170321;
/*
 * 쓰레드, 예외
 * 쓰레드(Thread) : 프로그램의 시작점과 종료점을 가지는 일련의 하나의 작업
 * 멀티 쓰레드 : 시분할(Time Sharing) 개념 활용  -> 프로그램이 일정한 할당 시간을 받고 자신의 할당시간이 끝나면 다시 시간이 할당
 * 될때까지 기다림
 * 
 * 쓰레드 상속 작성 방법
 * 1. 쓰레드를 상속받을 클래스를 작성한다.
 * 2. run() 메소드를 오버라이딩하여 내용을 구현한다.
 * 3. main() 메소드 내부에서 스레드를 상속받은 클래스의 객체를 생성
 * 4. 해당 객체의 start()메소드 호출
 * 
 * Runnable 구현 작성법
 * 1. Runnable을 구현하는 클래스를 작성한다.
 * 2. run()메소드를 오버라이딩하여 내용을 구현한다.
 * 3. main()메소드에서 runnable을 구현한 객체를 생성한다.
 * 4. Thread 객체를 생성하여 매개 변수로 main()에서 생성한 객체에 대입
 * 5. Thread객체의 start() 메소드를 호출한다. 
 */
class AA1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("여기가 스레드 입니다.");
		for(int i=0;i<100;i++){
			for(char ch = 'A';ch <= 'z'; ch++){
				System.out.print(ch);
			}
		}
	}
	
}
public class Exam06 {
	public static void main(String[] ar){
		System.out.println("메인 스레드");
		AA1 mt = new AA1(); //Runnable 객체 생성
		Thread myth = new Thread(mt); //Thread 객체 생성
		myth.start();
		for(int i=0;i<1000;i++){
			System.out.print(i);
			if(i % 10 ==0)
				System.out.println();
			else
				System.out.print("\t");
		}
		System.out.println("Main Thread Destroy!!");
	}

}
















