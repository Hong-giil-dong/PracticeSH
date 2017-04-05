package practice170314;

/*
 * ���� ������(�����) : �ܺηκ����� ������ ���� �ϱ� ���� �������� ���ȴ�.
 * ���� 
 * private : �ڽ��� Ŭ������������ ��� �ǵ��� ����
 * protected : �ڽ��� Ŭ������ ��ӹ��� ���� Ŭ���� �׸��� ������ ���ϳ��� �� ������ ���������� ���
 * package : default ��������, ���� Ŭ����, ������ ����, ������ ��Ű��(����) ���ο����� ���
 * public : ��ü�� ������ �Ǿ� ������ ��𼭵� ����� �����ϴ�
 * ��밡�� ����
 * 1. ��� �ʵ�
 * 2. ��� �޼ҵ�
 * 3. ������ �޼ҵ�
 * 4. Ŭ����


 */
class Person{
	/**����Ʈ �������� ��� ��������� �ʱ�ȭ�� �ַ� ����Ѵ�.
	 * 
	 */
	private int perID;//private�� ����� ������ ���� Ŭ������ ��쿡�� ��밡��
	private int milID;
	
	Person(){}//����Ʈ �ϰ�쿡�� ����
	
	
	public Person(int pID, int mID){
		perID = pID;
		milID = mID;
	}
	
	public Person(int pID){
		perID = pID;
		milID = 0;
	}
	
	public void showInfo(){
		System.out.println("�ι� : " + perID);
		
		if(milID != 0)
			System.out.println("���� : " + milID);
		else
			System.out.println("���� ��� ����");
				
	}
}
public class Exam07 {
	public static void main(String[] ar){
		Person man = new Person(950123,880102);
		Person woman = new Person(941125);
	}

}