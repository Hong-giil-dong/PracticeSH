package practice170317;
//���������� ��� �ʵ���� ����
// �ʵ�� ���������� ǥ�� �Ǿ��� ���� ��ü�� ���� �θ� Ŭ������ ��� �ʵ忡�� ����
//

class A4{
	int x = 100;
}

class B4 extends A4{
	int y = 200;
}

public class Exam07 {
	public static void main(String args[]) {
		A4 ap 
		��= new B4(); // ������ ǥ��
		System.out.println("x = " + ap.x);
		System.out.println("y = " + ap.y);
	}
}
