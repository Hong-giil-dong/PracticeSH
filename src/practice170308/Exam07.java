package practice170308;
/*
 * 5���� �л��� ����, ����, ���� ������ �Է� �޾Ƽ� ������ ����� ���ϰ� ������ �������� ������ ��� �Ͻÿ�.
 * (��, ����� �Ҽ��� ���� 2�ڸ����� ǥ���Ͻÿ�.)
 * <�Է�>
 * �̸� : 
 * ���� : 
 * ���� : 
 * ���� : 
 * 
 * <<���>>
 * �̸� ���� ���� ���� ���� ��� ����
 * 
 */
import java.io.IOException;
import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args){
		
		int[][] num = new int[5][4];
		String[] name=new String[5];
		String[] kwa={"����","����","����","����","���"};
		float avg[] = new float[5];
		int rank[] = new int[5];
		
		Scanner sc = new Scanner(System.in);

		for(int j=0;j<5;j++){
			System.out.print("�̸� : ");
		
			name[j] = sc.nextLine();
			for(int i=0;i<3;i++){
			System.out.print(kwa[i]+":");
			num[j][i] = Integer.parseInt(sc.nextLine());

		}
			System.out.println();
		}
		
		for(int j=0;j<5;j++){
			num[j][3] = num[j][0]+num[j][1]+num[j][2];
			avg[j]=(float)num[j][3]/3;
		}
		
		for(int i=0;i<avg.length;i++){
				rank[i]=1;
				for(int j=0;j<avg.length;j++)
					if(avg[i]<avg[j])
						rank[i]++;
		}
		System.out.println("�̸�" + "\t" + "����" + "\t" +"����" + "\t" +"����" + "\t" +"����" + "\t" +"���" + "\t" +"����");
		for(int j=0;j<5;j++){
			System.out.print(name[j]);
			for(int i=0;i<4;i++){
			System.out.print("\t" + num[j][i]);
		}
			System.out.println("\t" + String.format("%1.2f",avg[j]) + "\t" + rank[j]);
		}
	}
}