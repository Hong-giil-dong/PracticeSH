package practice170313;

import pack.Exam01;

public class Exam02 {
	static void print(){
		System.out.println("Print");
	}
	private static void disp(){
		System.out.println("private disp()");
		print();
	}
	
	public static void main(String[] ar){
		disp();
		Exam01 ex = new Exam01();
		ex.make();
	}
}
