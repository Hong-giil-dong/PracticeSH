package practice170314;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ֹι�ȣ ���� P/G
public class Exam11 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name ="";
		int[] jumin = new int[14];
		boolean right = false;
		
		System.out.print("�̸� : ");
		name = in.readLine();
		
		do{
			right=false;
			System.out.print("�ֹι�ȣ (ex. 123456-1234567) : ");
			for(int i=0;i<jumin.length;i++){
				jumin[i] = System.in.read() - 48;
			}
			System.in.read();
			System.in.read();
			
			if(jumin[2]*10 + jumin[3]>12){
				System.out.println("�¾ ���� 12�� ���� Ŭ �� �����ϴ�.");
				continue;
			}
			else if(jumin[4]*10 + jumin[5] > 31){
				System.out.println("�¾ ���� 31�� ���� Ŭ �� �����ϴ�.");
				continue;
			}
			else if(jumin[7] != 9 && jumin[7] != 0 &&
					jumin[7] != 1 && jumin[7] != 2 &&
					jumin[7] != 3 && jumin[7] != 4 ){
				System.out.print("������ ��Ÿ���� ���ڴ� ");
				System.out.println("0,1,2,3,4 �� �ϳ����� �մϴ�. ");
				continue;
			}
			
			//�ֹι�ȣ ����
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
				System.out.println("�ֹι�ȣ�� �ùٸ��� �ʽ��ϴ�!");
				continue;
			}
			right = true;
			
			
		}while(right);
	}
}
