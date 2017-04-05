package practice170313;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungJuk{
	int[] sub = new int[4]; //0:국어,1:영어,2:수학
	float avg; //4.평균
	SungJuk() throws IOException{
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		String[] str ={"국어","영어","수학"};
		for(int i=0;i<str.length;i++){
			System.out.print(str[i] +" : ");
			sub[i] = Integer.parseInt(in.readLine());
			sub[str.length] += sub[i];
		}
		avg = sub[str.length] / (float)str.length;
		
		System.out.println("총점 : " + sub[str.length]);
		System.out.println("평균 : " + avg);
	}
	
	public static void main(String[] ar) throws IOException{
			SungJuk ex = new SungJuk();


	}
}