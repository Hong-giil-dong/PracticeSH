package practice170309;
import java.util.Scanner;

/**
 임의 수 10개를 무작위로 입력 받아서
 셀렉션 정렬을 이용하여 오름차순으로 정렬하여 출력하시오
 */
public class Exam02 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		
		
			for(int i=0;i<10;i++){
			System.out.print("10개의 수를 입력하시오 : ");
			num[i] = Integer.parseInt(sc.nextLine());
			}
			
		System.out.println("정렬후 : ");	
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


