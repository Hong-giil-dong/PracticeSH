package practice170315;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//주민번호 관련 P/G
public class Work01 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name ="";
		int[] jumin = new int[14];
		boolean right = false;
		
		System.out.print("이름 : ");
		name = in.readLine();
		
		do{
			right=false;
			System.out.print("주민번호 (ex. 123456-1234567) : ");
			for(int i=0;i<jumin.length;i++){
				jumin[i] = System.in.read() - 48;
			}
			System.in.read();
			System.in.read();
			
			if(jumin[2]*10 + jumin[3]>12){
				System.out.println("태어난 달은 12월 보다 클 수 없습니다.");
				continue;
			}
			else if(jumin[4]*10 + jumin[5] > 31){
				System.out.println("태어난 일은 31일 보다 클 수 없습니다.");
				continue;
			}
			else if(jumin[7] != 9 && jumin[7] != 0 &&
					jumin[7] != 1 && jumin[7] != 2 &&
					jumin[7] != 3 && jumin[7] != 4 ){
				System.out.print("성별을 나타내는 숫자는 ");
				System.out.println("0,1,2,3,4 중 하나여야 합니다. ");
				continue;
			}
			
			//주민번호 검증
			int hap =0, cre = 2;
			float temp = 0.0f, temp1 = 0.0f;
			
			for(int i=0;i<jumin.length;i++){
				if(i==6) continue;
				hap+=jumin[i]+cre;
				cre++;
				if(cre==10) cre=2;
			}
			temp = (int)(hap /11.0f)*11.0f+11.0f - hap;
			temp1 = temp - (int)(temp / 10.0f)*10.0f;
			
			if(temp1 != jumin[13]){
				System.out.println("주민번호가 올바르지 않습니다!");
				continue;
			}
			right = true;
			
			
		}while(right);
	}
}
