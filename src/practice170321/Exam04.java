package practice170321;
interface A1{ //�������̽� A1 ����
	int w = 10; // ������� w�� intŸ�����μ����ϰ� 10���� �ʱ�ȭ
	static int x = 20; // static�̹Ƿ� �������̽��� ����ɶ� �ٷ� �ҷ����� ������� x�� intŸ������ �����ϰ� 20���� �ʱ�ȭ
	final int y = 30; // final�̹Ƿ�  �����ϰ� 30���� �ʱ�ȭ�� y���� ���� �Ұ�
	public static final int z = 40; //���Ŭ���������� ���ٰ����ϰ� 40������ ������ ���� �Ұ��� intŸ�� ���� z
	public abstract void aaa(); //�߻�ȭ �޼ҵ� aaa�� ������ ���̹Ƿ� ;�� ���峡
}

class B1 implements A1{
	public void aaa(){
		System.out.println("aaa�޼ҵ�");
	}
	public void bbb(){
		System.out.println("bbb�޼ҵ�");
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
