package practice170306;
import java.io.*;
public class Exam10 {
	public static void main(String[] ar) throws IOException {
		while(true){
			System.out.print("JAVA");
			System.out.print("���(y/n)");
			char ch = (char)System.in.read();
			System.in.read();
			System.in.read();
			
			if(ch=='n' || ch=='N')
				break;
		}
		
		int kor=0;
		do{
			kor=101;
		}while(!(kor>=0) && !(kor<=100));
	}
}
/**
 * ���� ���� ���� ������ �Է¹޾Ƽ� ������ ����� ���Ͽ� ����Ͻÿ�.
 * �� ����� �Ҽ� 2�ڸ����� �ݿø��Ͽ� 1�ڸ���������ϰ� �� ������ ������ 0~100������ ���� �Է¹��� �� �ִ�.
 */

