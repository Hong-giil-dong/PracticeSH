package practice170321;
// �������� �켱���� �������� �����尡 �� ���
// �������� �켱���� �� : 1~10 ���� ( ���ڰ� Ŭ���� �켱������ ������)
// - �Ϲ������� ���α׷��� ����� �����ϸ� �켱 ���� ���� NORMAL_PROIRITY=5

class AA2 extends Thread{
	public void run(){
		System.out.println("���Ⱑ ������ �Դϴ�.");
		for(int i=0;i<100;i++){
			for(char ch = 'A';ch <= 'z'; ch++){
				System.out.print(ch);
			}
		}
	}
	
}
public class Exam07 {
	public static void main(String[] ar){
		System.out.println("���� ������");
		AA2 mt = new AA2(); //Runnable ��ü ����
		//Thread myth = new Thread(mt); //Thread ��ü ����
		mt.start(); //Thread ����
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
