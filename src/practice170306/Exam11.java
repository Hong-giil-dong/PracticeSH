package practice170306;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exam11 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("���� ���� �Է�(0~100���� �Է�) : ");
		int a = Integer.parseInt(in.readLine());
		do{
		}while(!(a>=0) || !(a<=100));
		
		System.out.print("���� ���� �Է�(0~100���� �Է�) : ");
		int b = Integer.parseInt(in.readLine());
		do{
		}while(!(b>=0) || !(b<=100));
		
		System.out.print("���� ���� �Է�(0~100���� �Է�) : ");
		int c = Integer.parseInt(in.readLine());
		do{
		}while(!(c>=0) || !(c<=100));
		
		System.out.println("���� ���� : " + a);
		System.out.println("���� ���� : " + b);
		System.out.println("���� ���� : " + c);
		float avg;
		double sum=a+b+c;
		System.out.println("���� : " + sum);	
		avg=((int)(((sum/3.0f)+0.05f)*10)/10.0f); //�ٽ�
		System.out.println("��� : " + avg);		
	}
}
/**
 * ���� ���� ���� ������ �Է¹޾Ƽ� ������ ����� ���Ͽ� ����Ͻÿ�.
 * �� ����� �Ҽ� 2�ڸ����� �ݿø��Ͽ� 1�ڸ���������ϰ� �� ������ ������ 0~100������ ���� �Է¹��� �� �ִ�.��� :  avg
 */

