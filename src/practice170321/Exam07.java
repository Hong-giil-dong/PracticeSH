package practice170321;
// 쓰레드의 우선순위 여러개의 쓰레드가 할 경우
// 쓰레드의 우선순위 값 : 1~10 범위 ( 숫자가 클수록 우선순위가 높은것)
// - 일반적으로 프로그램을 만들어 실행하면 우선 순위 값은 NORMAL_PROIRITY=5

class AA2 extends Thread{
	public void run(){
		System.out.println("여기가 스레드 입니다.");
		for(int i=0;i<100;i++){
			for(char ch = 'A';ch <= 'z'; ch++){
				System.out.print(ch);
			}
		}
	}
	
}
public class Exam07 {
	public static void main(String[] ar){
		System.out.println("메인 스레드");
		AA2 mt = new AA2(); //Runnable 객체 생성
		//Thread myth = new Thread(mt); //Thread 객체 생성
		mt.start(); //Thread 실행
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
