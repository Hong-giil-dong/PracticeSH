package practice170307;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam09 {
	public static void main(String[] args)  throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		
		System.out.print("����� ���� ���� �Է� : ");
		num = Integer.parseInt(in.readLine());
		
		for(int i=1; i<=num; i++){
			if(num%i==0){
				System.out.print(i);
			
				System.out.println();
				System.out.println();
			}
		}
	}
}
//������ ���� �Է¹޾Ƽ� �� ����� ��� ��� (�� �ڱ��ڽ��� ������� �ʾƵ� ��)