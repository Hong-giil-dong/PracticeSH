package practice170308;
import java.util.Scanner;

/**
 * 배열에 1~99사이의 데이터 10개가 입력되어있다고 가정을 하고 2와 3의 배수를 출력하시오

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
			System.out.println(num[i]+" 숫자는 2의 배수 임");
			else
			System.out.println(num[i]+" 숫자는 2의 배수 아님");
		}
		System.out.println();
			for(int i=0;i<num.length;i++){
				if(num[i]%3==0)
			System.out.println(num[i]+" 숫자는 3의 배수 임");
			else
			System.out.println(num[i]+" 숫자는 3의 배수 아님");
			
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
	*/
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
