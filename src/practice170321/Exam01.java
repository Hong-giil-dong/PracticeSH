package practice170321;
/**
 * 6.��Ӱ� �������� �ִ��� Ȱ���Ͽ� �ۼ��� �Ѵ�.
 * 
 * abstract�� �������̽�
 * 
 * public static int x = 10;
 * static public int x = 10;
 * private final int x = 10;
 * final private int x = 10;
 * 
 * ���������� �������� Ŭ������ extends ����Ŭ���� implements ���� �������̽�
 *
 */

abstract class A{// �߻� Ŭ���� A�� ����
	//�Ϲ� Ŭ������ ���(field, Method, Construct-������), �߻� �޼��带 ������.
	//�߻� �޼ҵ�� ����θ� ������ �ʰ� �̸��� ������ �ִ� �޼ҵ��̴�.
	//�ݵ��  �������̵�(������)�� �Ǿ�߸� �Ѵ�.
	//
	// �߻� Ŭ������ ��ӹ��� Ŭ������ �߻� Ŭ������ �߻� �޼ҵ带 �ݵ�� �������̵��� �Ͽ��� �Ѵ�.
	// ���� �����Ǹ� ���� ������ ����� ���� ���� Ŭ������ �߻� Ŭ������ �ν��� �ϰ� �ȴ�.
	// 
	public abstract void disp(); // ��� �������� ��� ������ ��ȯ���� ���� �߻�޼ҵ带 �����Ͽ����Ƿ� ��ӹ޴� Ŭ��������
	// �ݵ�� ������ �ؼ� ����ؾ���
}

class B extends A{ // Ŭ���� B�� �����ϰ� �θ� AŬ����(�߻�Ŭ����)�� ��� �޾Ƽ� ���

	@Override
	public void disp() { // �θ� Ŭ������ �޼ҵ带 �������̵� ��(�߻�ȭ Ŭ�����̹Ƿ� �ݵ�� �������)
		// TODO Auto-generated method stub
		System.out.println("Success"); // �������̵��� �޼ҵ��� ���� (���)
		
	} //Overriding Error
	
}
public class Exam01 { 
	public static void main(String[] ar){ //���� �޼ҵ�
		//A ap = new A(); //������ ����, ��ü ���� �Ұ�
		B bp = new B(); 
		A cp = new B();
		
		bp.disp();
		cp.disp();
	}
}
