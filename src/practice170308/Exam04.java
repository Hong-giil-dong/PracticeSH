package practice170308;
import java.util.Scanner;

/**
 * ������ �� 5���� �Է¹޾Ƽ� ���� ů ���� ���� ���� ���� ����Ͻÿ�
 * @author user2
 *
 */
/*
 * ����
 * �Է�
 * ó��
 * ���
 * ��°� ���� �м�
 */

public class Exam04 {
	public static void main(String[] args){
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.print("�Է� : ");
			num[i]=Integer.parseInt(sc.nextLine());
		}
			int max = num[0], min=num[0];
			for(int i=0;i<num.length;i++){
				if(max < num[i])
					max = num[i];
				if(min>num[i])
					min = num[i];
			
			}
			
			System.out.println("�ּҰ�"+min+" "+"�ִ밪"+max);
		}
	}
			/**
		int[] data = {5,15,10,7,6,30,21};
		//int max=0, min=100; // �ݵ�� �ʱⰪ�� �־����
		int max = data[0], min=data[0]; //�����Ͱ� ���� ��ϵǾ�������쿡�� ��� ������ ���
		
		for(int i=0;i<data.length;i++){//�������� ���̰����� �����ϰԵ�
			if(max < data[i])
				max = data[i];
			if(min>data[i])
				min = data[i];
			}
		System.out.println(min+" "+max);
	}
	
	
}
*/