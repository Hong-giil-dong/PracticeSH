package practice170314;

public class Exam03 {
	int a;
	int b;
	float c;
	public static void main(String[] args){
		/*
		Exam03 ex = null; // 4바이트 공간(맨뒤?스탭영역)으로 초기화
		ex = new Exam03(); // 4바이트 공간(맨앞,힙영역)에 ex 초기화
		*/
		Exam03 ex = new Exam03();
		
		ex.a = 100;
		ex.b = 200;
		ex.c = 300.0f;
		
		System.out.println("A = " + ex.a);
		System.out.println("B = " + ex.b);
		System.out.println("C = " + ex.c);
	}
}
