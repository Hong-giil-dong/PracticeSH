package practice170309;
import java.util.Scanner;

/**
 ���� �� 10���� �������� �Է� �޾Ƽ�
 ������ ������ �̿��Ͽ� ������������ �����Ͽ� ����Ͻÿ�
 */
public class Exam02 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		
		
			for(int i=0;i<10;i++){
			System.out.print("10���� ���� �Է��Ͻÿ� : ");
			num[i] = Integer.parseInt(sc.nextLine());
			}
			
		System.out.println("������ : ");	
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]>num[j]){
					int t = num[i];
					num[i]=num[j];
					num[j]= t;
				}
			}

			System.out.print(num[i]+"\t");
		}

	}
	}
}


