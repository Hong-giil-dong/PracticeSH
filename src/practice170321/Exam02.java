package practice170321;
abstract class AA{
	public abstract void disp();
}

abstract class BB extends AA {
	
}

class CC extends BB {

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Exam02 {
	public static void main(String[] args) {
		AA ap = new AA();
		BB bp = new BB();
		CC cp = new CC();
		AA dp = new BB();
		AA ep = new CC();
		BB fp = new CC();
		cp.disp();
	}
}
