package practice170310;
/**
 * �ڹ� �޼���
 * <�ܿ���ǥ>
 * - �޼����� ���� �� ���
 * - �޼����� ����
 * - ����� ���ϰ�
 * 
 * 1. �޼����� ���� ���
 * <����>
 * ���������� [���������] �����_���ϰ� �޼����(�Ű�����)[throws ����}{
 * 		����� ����-1
 * 		����� ����-2 
 * 		����� ����-n
 * 		[return ��]
 * }
 * ����� ���ϰ�
 *  �޼��尡 ����θ� �����ϰ� �� �� ����� ���ư��� ���� �ǹ�(�ڷ���)
 *  ex) void : ȣ���� ������ �Ѱ��� ���� ����.
 *  int, long, short, byte, float, double, String, char, boolean
 *  
 *  �ڹٴ� �����Ͱ� ���⶧���� �Ű� ���ʿ䰡 ����?
 *  
 * 2. �޼����
 * main()�޼������ �����ϰ� ����ڰ� ���Ƿ� �����Ѵ�.
 * ���� �޼ҵ���� ��� �ǰų� 1���� �����Ͽ��� �Ѵ�
 * ���� �޼ҵ尡 �ʿ��� ������ ���� ��ġ�� �˱� ���ؼ��̴�.
 *
 *3. �Ű�����
 * 4. throws ���� : ����ó���� ���� ������ �Ѵ�.
 * 
 * �޼���(function)�� ����
 * -Call by Name : �޼ҵ��� �̸����� ȣ��
 * -Call by Value : �Ű������� �����ؼ� ó��
 * -Call by Reference(Address) : ��ü�� �ּҸ� �̿��� ���� �����͸� ��ȭ ��Ų��.
 * ���� ���°��� name value
 */
/*
public class Exam01 {
	public int abc(int a){
		return 0; // int�� ���� �ȵ� ���ϰ��� �����
	}
}
*/

public class Exam01 {
	public static void aaa(int aa){//�̰��� aa�� ���μ�, call by value
		int a = bbb();
		System.out.println("X = " + (aa+a));
		return;
	}
	public static int bbb(){
		int x = 10;
		return x;
	}
	public static void main(String[] ar){//�̰��� 5�� ���μ�
		aaa(5);
	}
}



