package practice170313;
/**
 * �ظ�� ���� ���θ� ������ �� �ִ� Ŭ������ ���� �Ѵ�.
 * ������ ���ÿ� �ʱ�ȭ�� ������ �����ڵ� ���� �Ѵ�.
 * �غ��� ���� ������ �����ų �� �ִ� �޼ҵ�� �ﰢ���� ���̸� 
 * ����ؼ� ��ȯ�ϴ� �޼ҵ嵵 ���� �Ѵ�.
 *
 */
		
class Triangle{
	double bottom;
	double height;
	public Triangle(double bt, double ht){
		bottom = bt;
		height = ht;
	}
	
	public void setBottom(double bt){
		bottom = bt;
	}
	
	public void setHeight(double ht){
		height = ht;
	}
	
	public double getArea(){
		return bottom*height/2;
	}
	
}
public class Exam10 {
	public static void main(String[] ar){
		Triangle tr = new Triangle(10.2, 17.3);
		System.out.println("�ﰢ�� ���� : " + tr.getArea());
		
		tr.setBottom(7.5);
		tr.setHeight(9.2);
		System.out.println("�ﰢ�� ���� : " + tr.getArea());
	}
}
