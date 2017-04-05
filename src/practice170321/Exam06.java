package practice170321;
/*
 * ������, ����
 * ������(Thread) : ���α׷��� �������� �������� ������ �Ϸ��� �ϳ��� �۾�
 * ��Ƽ ������ : �ú���(Time Sharing) ���� Ȱ��  -> ���α׷��� ������ �Ҵ� �ð��� �ް� �ڽ��� �Ҵ�ð��� ������ �ٽ� �ð��� �Ҵ�
 * �ɶ����� ��ٸ�
 * 
 * ������ ��� �ۼ� ���
 * 1. �����带 ��ӹ��� Ŭ������ �ۼ��Ѵ�.
 * 2. run() �޼ҵ带 �������̵��Ͽ� ������ �����Ѵ�.
 * 3. main() �޼ҵ� ���ο��� �����带 ��ӹ��� Ŭ������ ��ü�� ����
 * 4. �ش� ��ü�� start()�޼ҵ� ȣ��
 * 
 * Runnable ���� �ۼ���
 * 1. Runnable�� �����ϴ� Ŭ������ �ۼ��Ѵ�.
 * 2. run()�޼ҵ带 �������̵��Ͽ� ������ �����Ѵ�.
 * 3. main()�޼ҵ忡�� runnable�� ������ ��ü�� �����Ѵ�.
 * 4. Thread ��ü�� �����Ͽ� �Ű� ������ main()���� ������ ��ü�� ����
 * 5. Thread��ü�� start() �޼ҵ带 ȣ���Ѵ�. 
 */
class AA1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("���Ⱑ ������ �Դϴ�.");
		for(int i=0;i<100;i++){
			for(char ch = 'A';ch <= 'z'; ch++){
				System.out.print(ch);
			}
		}
	}
	
}
public class Exam06 {
	public static void main(String[] ar){
		System.out.println("���� ������");
		AA1 mt = new AA1(); //Runnable ��ü ����
		Thread myth = new Thread(mt); //Thread ��ü ����
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
















