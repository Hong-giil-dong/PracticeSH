package practice170308;
import java.util.Scanner;

/**
 * �迭�� 1~99������ ������ 10���� �ԷµǾ��ִٰ� ������ �ϰ� 2�� 3�� ����� ����Ͻÿ�

 */
public class Exam05 {
	public static void main(String[] ar){
		int data[] = {1,9,15,10,7,6,30,21,98,89};
		
		for(int i=0;i<data.length;i++){
			if(data[i]%2==0 && data[i]%3==0)
				System.out.println(data[i]);
		}
	}

}

/**
public class Exam05 {
	public static void main(String[] args){
		int[] num = {5,10,30,44,32,66,33,22,11,34};
		for(int i=0;i<num.length;i++){
			if(num[i]%2==0)
			System.out.println(num[i]+" ���ڴ� 2�� ��� ��");
			else
			System.out.println(num[i]+" ���ڴ� 2�� ��� �ƴ�");
		}
		System.out.println();
			for(int i=0;i<num.length;i++){
				if(num[i]%3==0)
			System.out.println(num[i]+" ���ڴ� 3�� ��� ��");
			else
			System.out.println(num[i]+" ���ڴ� 3�� ��� �ƴ�");
			
		}
	}
}
*/

/**
public class Exam05 {
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
	*/
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
