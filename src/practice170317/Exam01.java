package practice170317;
/*
 * -Ư�� �޼ҵ忡 �������� �뵵�� ����� Ŭ����
 * -���� �����ڿ� ���� ���� ����� �� ����
 * 
 * ��Ӱ� ������
 * ����̶�?
 * � Ŭ������ ��� ������ �״�� �����´�.
 * ����� ����ϴ� ������ Ŭ������ ȿ�������� ����ϱ� ���ؼ�, ���뼺�� �ش�ȭ
 * 
 *  
 * Object�� super
 * 
 * �������̵��� ��Ģ
 * - �������̵� �� ������ ���� �������� ������ ���ų� Ŀ�� �Ѵ�.
 * - �������̵� �� ���� Ŭ������ �޼��忡 throws ������ ������ ���� Ŭ������ 
 * �������̵��� �� �޼��嵵 �ݵ�� �ش� ���� Ŭ������ ���ϴ� throws�� ������ �־���Ѵ�
 * 
 * 
 */
class A{
	int a= 10;
}

class B extends A{
	A ap = new A();
	int b = 20;
	//int f = a+b;
}

class C extends B{
	B bp = new B();
	int c = 30;
	int sum = a+b+c;
}

class D extends C{
	C cp = new C();
	int d = 40;
	int sum = a+b+c+d;
	public void disp(){
		System.out.println("���� : " + sum);
	}
}

public class Exam01 extends D{
	public static void main(String[] ar){
		
		D dp = new D();
		int e = dp.d + dp.cp.c +dp.cp.bp.b + dp.cp.bp.ap.a;
		System.out.println("���� : " + e);
		int sum = dp.a + dp.b + dp.c + dp.d;
		System.out.println("���� : " + sum);
		
		dp.disp();
		
	}

}














