package practice170308;
/**
 * 3���� ����, ����, ���� ������ ���� �Է� �޾Ƽ� ������ ����� ��� ���Ͻÿ�
 * ��¿���
 * ��ȣ ���� ���� ���� ���� ���
 */

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args){
		
		//�迭�� ����
		int[][] sung;
		String[] name = new String[3];

		String[] kwa={"�̸�","����","����","����","����","���"};
		
		//�迭�� �ʱ�ȭ(���� ������ ����ϱ� ���ؼ��� �����ؾߵ�
		sung = new int[3][6]; // new�� ������
		
		Scanner sc = new Scanner(System.in);

		for(int j=0;j<3;j++){//�Է��� 3�� 3�پ� �޴� ��
			for(int i=0;i<4;i++){
			System.out.print(kwa[i]+":");
			sung[j][i]=Integer.parseInt(sc.nextLine());
		}
		}
		//����,��հ���ϰ� �����ϴ� ��
		for(int j=0;j<3;j++){
			for(int i=4;i<5;i++){
		
			sung[j][i]=sung[j][2]+sung[j][3]+sung[j][4];
			sung[j][i+1]=sung[j][i]/3;
			}
		}	
		
		for(int j=0;j<3;j++){//����� 3�� �ϴ� ��
			for(int i=0;i<6;i++){
			System.out.print("\t"+kwa[i]+":"+sung[j][i]);
		}
			System.out.println();
		}
	}
}

/*
int sw=0;
for(int i=1;i<=5;i++){
	if(sw==0){
		System.out.print("+"+i);;//+1
		sw=1;
	}else{
		System.out.print("-"+i);//+1-2
		sw=0;
*/