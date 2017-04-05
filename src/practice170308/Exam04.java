package practice170308;
import java.util.Scanner;

/**
 * 임의의 수 5개를 입력받아서 가장 킁 수와 가장 작은 수를 출력하시오
 * @author user2
 *
 */
/*
 * 선언
 * 입력
 * 처리
 * 출력
 * 출력값 먼저 분석
 */

public class Exam04 {
	public static void main(String[] args){
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.print("입력 : ");
			num[i]=Integer.parseInt(sc.nextLine());
		}
			int max = num[0], min=num[0];
			for(int i=0;i<num.length;i++){
				if(max < num[i])
					max = num[i];
				if(min>num[i])
					min = num[i];
			
			}
			
			System.out.println("최소값"+min+" "+"최대값"+max);
		}
	}
			/**
		int[] data = {5,15,10,7,6,30,21};
		//int max=0, min=100; // 반드시 초기값이 있어야함
		int max = data[0], min=data[0]; //데이터가 사전 등록되어있을경우에만 사용 가능한 방법
		
		for(int i=0;i<data.length;i++){//데이터의 길이가지만 수행하게됨
			if(max < data[i])
				max = data[i];
			if(min>data[i])
				min = data[i];
			}
		System.out.println(min+" "+max);
	}
	
	
}
*/