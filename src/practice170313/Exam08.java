package practice170313;
/*
 * �ظ�� ���� ������ ������ �� �ִ� Ŭ������ ���� �Ѵ�.
 * ������ ���ÿ� �ʱ�ȭ�� ������ �����ڵ� ���� �Ѵ�.
 * �غ��� ���� ������ �����ų �� �ִ� �޼ҵ�� �ﰢ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ嵵 �����Ѵ�.
 */
import java.io.*;

public class Exam08 {
	public static void main(String[] args){
		
		
		Triangle Tri = new Triangle();
		
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));

		
		System.out.print("�ﰢ���� �غ� �Է� (����) : ");
		Triangle TriBase = new TriBase();
		TriBase = Integer.parseInt(in.readLine());
		
		System.out.print("�ﰢ���� ���� �Է� (����) : ");
		Triangle TriHeight = new TriHeight();
		TriHeight = Integer.parseInt(in.readLine());
	}

}
