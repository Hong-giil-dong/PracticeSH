package practice170307;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ֹι�ȣ�� 8��° ���ڸ� �Է��Ͽ� ��������� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ����
 * 0����
 * 1��� ��ö
 * 2�λ�
 * 3����
 * 4��û
 * 5����
 * 6�뱸,����
 * 7���
 * 8�泲
 * 9����
 */
public class Exam03 {
	public static void main(String[] args)  throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int pos = 0;
		String area="";
		
		System.out.print("8��° �ڸ� �Է� : ");
		pos = Integer.parseInt(in.readLine());
		

		
				switch(pos){
				case 0: area="����";break;
				case 1: area="���,��õ";break;
				case 2: area="�λ�";break;
				case 3: area="����";break;
				case 4: area="��û";break;
				case 5: area="����";break;
				case 6: area="�뱸,����";break;
				case 7: area="���";break;
				case 8: area="�泲";break;
				case 9: area="����";break;
				}
				System.out.println();
				System.out.print(area);
	}
}
/*
import java.io.*;
import java.util.*;

public class Exam03 {
	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int num, loc = 0;
		System.out.print("�ֹι�ȣ 8��° �ڸ� �Է� : ");
		num = Integer.parseInt(sc.nextLine());			
	switch(num){
	case 1:	
		System.out.println("���, ��õ");
		break;
	case 2:
		System.out.println("�λ�");
		break;
	case 3:
		System.out.println("����");
		break;
	case 4:
		System.out.println("��û");
		break;
	case 5:
		System.out.println("����");
		break;
	case 6:
		System.out.println("�뱸, ����");
		break;
	case 7:
		System.out.println("���");
		break;
	case 8:
		System.out.println("�泲");
		break;
	case 9:
		System.out.println("����");
		break;
	case 0:
		System.out.println("����");
		break;
	default: System.out.println("�߸� �Է��ϼ̽��ϴ�");
		System.exit(-1);
	}
	System.out.println();
}
}
*/
