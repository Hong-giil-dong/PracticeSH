package practice170315;
/*
 * this, static, final
 * this : Ŭ���� �ڱ� �ڽ��� �����ϴ� ��ü(ȣ���ϴ� ��ü�ʹ� �ٸ�)
 * 0��° �Ű����� - �ڱ�Ŭ���� this
 * ��� ��� �ʵ忡 ���� ��ü - this.������
 * 
 * static : ���뺯���� ���� ���� �����
 * static field : �ϳ��� Ŭ������ ������ ��� ��ü�� �����ϴ� ����
 * static ��� �ʵ��� �ʱ�ȭ
 * static {�ʱ�ȭ ����}
 * 
 *  �������α׷� ���� ����
 *  static -> main -> finalize
 */

public class Exam10 {
	private int x;
	private int y;
	Exam10(){
		x=0;
		y=0;
	}
	
	
	Exam10(int x, int y){
		this.x=x;// ���� this�� ������� �ʴ��� ����� ������ ���߿� Ȯ���Ҷ� this�� ����� ���� ������ ��������� Ȯ���ϴµ� ���ϴ�
		this.y=y;
	}
	public void disp(){
		System.out.println("X = "+x+"\tY= "+y);
	}
	public static void main(String[] ar){
		Exam10 ex = new Exam10(100, 200);
		ex.disp();
	}
	
}


