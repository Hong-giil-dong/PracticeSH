package practice170308;
/*
 * ����
 * �Է�
 * ó��
 * ���
 * ��°� ���� �м�
 * 
 * �迭�� ������ ���� ���� �Է� �Ǿ������� ���� �ȿ��� ���� ū ���� ���� ���� ���� ���Ͻÿ�.
 * 9,15,10,7,6,30,21
 * 
 */

public class Exam03 {
	public static void main(String[] args){
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
