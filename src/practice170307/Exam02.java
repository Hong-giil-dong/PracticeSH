package practice170307;
import java.util.*;

public class Exam02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int year =0;
		boolean bool=false;
		
		System.out.print("���� Ȯ�ο��� �Է� : ");
		year = Integer.parseInt(sc.nextLine());
		if (year%4 == 0 && year%100!=0 || year%400==0)
			bool=true;
			System.out.println();
			System.out.print(year + "���� ");
			System.out.print(bool?"�����Դϴ�":"����Դϴ�");
	}
}
/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		boolean bool=false;
		System.out.print("���� Ȯ�ο��� �Է� : ");
		int a = Integer.parseInt(in.readLine());
		if (((a/400)==0) || ((a/100)==0))
			System.out.print(a + "�� �����Դϴ�");

			
		}
	}
*/


/*
 * ����޷� �����
 * ���� ���ϴ� ���α׷� �����
 * 1. �������� �Ǵ��ϰ��� �ϴ� �⵵ �Է�
 * 2. ������ 4�⿡ �ѹ�
 * 3. ��, 10���� ������ �������� �ش� ������ �ƴ� 
 * 4. ��, 100���� ������ �������� �� �߿��� \400���� ������ �������� �ش� �����̴�.
 * 5. 2000���� ����
 * 
 * �Է� 
 * ������ �Է� : 2000
 * ���
 * 2000���� �����Դϴ�
 * 2013���� ������ �ƴմϴ�
*/