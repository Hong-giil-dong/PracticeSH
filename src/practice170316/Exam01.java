package practice170316;

class Outer {
	private int x = 100;
	class Inner{
		private int y = 200;

		
	}
	public void aaa(){
		//.Inner in = this.new Inner();
		Inner in = new Inner();
		System.out.println("X = " + x);
		System.out.println("Y = " + in.y);	//�ܺ� Ŭ�������� ���� Ŭ������ �鿩�� ������ ����?
	}
}

public class Exam01 {
	public static void main(String[] ar){
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		ot.aaa();
	}
}