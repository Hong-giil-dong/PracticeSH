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
		System.out.println("Y = " + in.y);	//외부 클래스에서 내부 클래스를 들여다 볼수는 없다?
	}
}

public class Exam01 {
	public static void main(String[] ar){
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		ot.aaa();
	}
}