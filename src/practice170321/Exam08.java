package practice170321;
class A4 extends Thread{
	public void run(){
		System.out.println("A4 ����");
	}
}

class B4 implements Runnable{

	@Override
	public void run() {
		System.out.println("B4 ����");
		
	}
}

public class Exam08 {
	public static void main(String[] ar){//���� �޼ҵ� ����
		A4 ap = new A4(); // A4�� �ν��Ͻ� ���� �� �ʱ�ȭ 
		Thread bp = new Thread(new B4());
		ap.setPriority(3); // ap�ν��Ͻ��� setpriority �޼ҵ忡 3�� �Ű����� ���� �ְ� ���۽�Ŵ
		// ���� ap�� �켱���� ���� 3���� ������
		bp.setPriority(8); // bp�ν��Ͻ��� setpriority �޼ҵ忡 8�� �Ű����� ���� �ְ� ���۽�Ŵ
		// ���� bp�� �켱���� ���� 8�� ������
		
		ap.start(); // ap�ν��Ͻ��� start�޼ҵ� ���� 
		bp.start(); // ap�ν��Ͻ��� start�޼ҵ� ����
		// ��µǴ� ������ 
		
		
		int max = Thread.MAX_PRIORITY;
		int normal = Thread.NORM_PRIORITY;
		int min = Thread.MIN_PRIORITY;
		System.out.println("MAX = " + max);
		System.out.println("NORMAL = " + normal);
		System.out.println("MIN = " + min);
	}

}

//jdbc?
//����Ŭ?


