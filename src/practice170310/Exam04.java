package practice170310;
/*
 * 
 * �޼ҵ�� ���α׷� �ۼ� 
 * 1. �ִ�� 2. ���̰� 3. ������ 4. ���� (1~4������ ���ڸ� �Է��Ͻÿ�) : 
 * ö��° �� : 100
 * �ι�° �� : 200
 * �ִ���� 200�Դϴ�
 * 
 * 1. �ִ�� 2. ������ 3. ������  4. ���� :
 * 1,2,3�� �޼ҵ�� �����
 * 
 * System.exit(-1);// ���α׷� ����
 */
import java.io.*;
import java.util.*;

public class Exam04 {

	//�ִ�� ���ϴ� �޼ҵ�
	public static void Max(int first, int second){
		if(first<second){
			System.out.print("�ִ밪 : " + second);
		}else{
			System.out.print("�ִ밪 : " + first);			
		}
		System.out.println();	
		System.out.print("�����մϴ�");
		System.exit(-1);
	}
	
	//���̰� ���ϴ� �޼ҵ�
	public static void Bet(int first, int second){
		System.out.print("������ : ");

		if(first<second){
			int t=0;
			for(int i=first+1;i<second;i++){
			t=t+i;}
			System.out.print(t);
		
		}else{
			int t=0;
			for(int i=second+1;i<first;i++){
				t=t+i;}
				System.out.print(t);
			
			}
		System.out.println();	
		System.out.println("�����մϴ�");
		System.exit(-1);
	}
	
	//���� �����ϴ� �޼ҵ�
	public static void Seq(int first, int second){
		System.out.print("������ : ");
		if(first<second){
			for(int i=first;i<=second;i++)
			System.out.print(i+"\t");
			
		}else{
			for(int i=second;i<=first;i++)
			System.out.print(i+"\t");		
		}
		System.out.println("�����մϴ�");
		System.exit(-1);
	}
	
	// ���� �޼ҵ�
	public static void main(String[] args) throws IOException {
		
		int input = 0;
		int first=0, second=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. �ִ�� 2. ���̰� 3. ������ 4. ���� (1~4������ ���ڸ� �Է��Ͻÿ�) : ");
		input = Integer.parseInt(sc.nextLine());
		if (input==4){
			System.out.print("�����մϴ�");
			System.exit(-1);
			
		}
		else
		{
				
		System.out.print("ù��° �� : ");
		first = Integer.parseInt(sc.nextLine());
		System.out.print("�ι�° �� : ");
		second = Integer.parseInt(sc.nextLine());
		
		switch(input){
		case 1 : Max(first,second);
		case 2 : Bet(first,second);
		case 3 : Seq(first,second);
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�");
		
		}
		}
	}
		
}

