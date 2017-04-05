package practice170316;
class Inner6{
	int y=200;
	public Inner6(){
		this.disp();
	}
	public void disp(){
		
	}
}

public class Exam05 {
	public static void main(String[] args){
		final int x = 100;
		new Inner6(){
			public void disp(){
				System.out.println(x);
			}
		};
		
	}

}

//»ó¼Ó

