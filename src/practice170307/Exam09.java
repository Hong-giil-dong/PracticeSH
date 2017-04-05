package practice170307;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam09 {
	public static void main(String[] args)  throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		
		System.out.print("약수를 구할 수를 입력 : ");
		num = Integer.parseInt(in.readLine());
		
		for(int i=1; i<=num; i++){
			if(num%i==0){
				System.out.print(i);
			
				System.out.println();
				System.out.println();
			}
		}
	}
}
//임의의 수를 입력받아서 그 약수를 모두 출력 (단 자기자신은 출력하지 않아도 됨)