package practice170314;

public class Exam03 {
	int a;
	int b;
	float c;
	public static void main(String[] args){
		/*
		Exam03 ex = null; // 4����Ʈ ����(�ǵ�?���ǿ���)���� �ʱ�ȭ
		ex = new Exam03(); // 4����Ʈ ����(�Ǿ�,������)�� ex �ʱ�ȭ
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
