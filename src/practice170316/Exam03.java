package practice170316;
class Outer2{
	private static int x = 100;
	static class Inner2{
		private int y = 200;
		public void aaa(){
			Outer2 in = new Outer2();
			System.out.println("x = " + x);
			System.out.println("y = " + y);			
		}
	}
}

public class Exam03 {
	class static class Inner3{
		public static void m
		Outer2.Inner2 oi = new Outer2.Inner2();
		oi.aaa();
	}
}
