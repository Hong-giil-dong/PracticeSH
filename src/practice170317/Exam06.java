package practice170317;
//������

class A3{
	public String toString(){
		return "A3 Ŭ����";
	}
}
class B3{
	public String toString(){
		return "B3 Ŭ����";
	}
}

class C3{}

public class Exam06 {
	public static void main(String[] ar){
		A3 ap = new A3();
		B3 bp = new B3();
		C3 cp = new C3();
		System.out.println("ap = " + ap);
		System.out.println("bp = " + bp);
		System.out.println("cp = " + cp);
	}

}
