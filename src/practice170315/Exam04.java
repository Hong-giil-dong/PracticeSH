package practice170315;
import java.io.IOException;

public class Exam04 {
	public static void main(String[] ar) throws IOException{
		Exam03 ex = new Exam03();//��ü�� ����鼭 �ٷ� �����?
		System.out.println();
		System.out.print("���� : ");
		System.out.println(ex.getTot());
		System.out.println();
		ex.setTot(500);
		ex.display();
	}
}


/*
public class Exam04 {
	public static void main(String[] args){
		Exam03 ex = new Exam03();
		
		ex.setXY();
		ex.display();	
	}
}
*/