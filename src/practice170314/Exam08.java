package practice170314;

public class Exam08 {
	private int x = 10;
	public static void main(String[] args){
		Exam08 ex08 = new Exam08();
		System.out.println("X = " + ex08.x);
		Exam08_Other ex08_ot = new Exam08_Other();
		System.out.println("X = " + ex08_ot.x);
		SungJuk ex = new SungJuk();
	}
}

class Exam08_Other{
	protected int x = 20;
}