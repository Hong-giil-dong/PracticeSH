package practice170314;
//�ֹι�ȣ ���� P/G
//�̸�, �ֹι�ȣ �Է¹���
// �ֹι�ȣ ������ �������, ����, ����� ����
// 



/*
public class Exam10 {
	private int[] pernum;
	private String name;
	
	public Exam10(){
		pernum = new int[14];
		name = " ";
		
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = sc.nextLine();		
		System.out.print("�ֹι�ȣ �Է�(13�ڸ�) : ");
		pernum = Integer.parseInt(sc.nextLine());

	}
}

*/
import java.util.Scanner;
import java.io.*;

class Exam10{
	
	private String name; // �̸�
	private int[] perFroNum = new int[6]; 
	private int[] perBotNum = new int[7];

	Exam10() throws IOException{
		
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		
		
			System.out.print("�̸� �Է� : ");
			name = in.readLine();
			
			for(int i=0;i<perFroNum.length;i++){
			System.out.print("�ֹ� ��ȣ " + (i+1) +"�ڸ� �Է� : ");
			perFroNum[i] = Integer.parseInt(in.readLine());
			}
			for(int i=0;i<perBotNum.length;i++){
			System.out.print("�ֹ� ��ȣ " + (i+7) +"�ڸ� �Է� : ");
			perBotNum[i] = Integer.parseInt(in.readLine());
			}
		
		System.out.println("�̸� : " + name);
		System.out.println("�ֹι�ȣ : " + perFroNum + "-" +perBotNum);
		System.out.println("������� : " + perFroNum[1]+perFroNum[2]+perFroNum[3]+perFroNum[4]+perFroNum[5]+perFroNum[6]);
		System.out.println("���� : " + perBotNum[1]);
		System.out.println("����� : " + perBotNum[2]);
	}
	
	public static void main(String[] ar) throws IOException{
			Exam10 ex = new Exam10();


	}
}

