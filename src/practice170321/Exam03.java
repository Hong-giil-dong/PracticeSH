package practice170321;
/**
 * �������̽��� ����
 * 1. ���� ����� ���� Ŭ���� ����
 * 2. �������� ���� Ŭ���� ����
 *
 *�������� ���� ���
 *1. �ʵ�
 *- ������ public static final ��� �ʵ� �̴�.
 *- public static final�� ��� �ϴ� static�� �����ϴ� �Ǵ� �ƹ��͵� �������� �ʴ� ������ public static final�� �ν��� �Ѵ�.
 *2. �޼ҵ�
 *- ������ public abstract �޼����̴�.
 *- ���Ǻθ� ���� �� ����.
 *- �������̽��� �������� �����̹Ƿ� ��� �޼��忡�� abstract�� �ٴ´�.
 *3. ���� ��ø Ŭ����
 *- �������̽��� ������ ��ø Ŭ������ �ڵ������� static�� �ٴ´�
 *
 */

interface A{
	
}

interface B{
	
}

interface C extends A,B implements E {//�������̽��� �ΰ��� '���' ������ ���� Ŭ������� �Ѱ��� ��Ӱ���
	// �������̽� �ȿ��� implements �� ����� �ȵ�.

}

class E {
	
}

class F { }
class D extends E, F{ }

public class Exam03 extends E implements A, B, C {

}
