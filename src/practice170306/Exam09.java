package practice170306;
/*
 * whle(����){
 * 	������ �����ϴ� ���ȸ� �ݺ�
 * }
 * 
 * ->������ ���� �ƿ� ������ ����
 * 
 * do{
 * ��ó�� ������
 * }while(����);
 * 
 * ->�ϴ� �ѹ� �����غ��� ������ ����?
 * 
 * �ߺ��Ǵ� ���̵� ã������ ���� ó������ ������ ������
 */
import java.io.*;
import java.util.*;

public class Exam09 {
	public static void main(String[] args)
		throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<=10){
			String st = sc.nextLine();
			if(st.equals("Q"))
				break;
			System.out.println(i);
			i++;
		}
	}
}
