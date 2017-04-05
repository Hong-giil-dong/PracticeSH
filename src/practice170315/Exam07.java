package practice170315;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Exam07 {
	private BufferedReader in;
	private String name;
	private int[] jumin;
	private boolean right;
	
	public Exam07() {
		in = new BufferedReader(new InputStreamReader(System.in));
		name = "";
		jumin = new int[14];
		right = false;
	}

	public void setName() throws IOException{
		System.out.print("이름 = ");
		name = in.readLine();
	}

	public void setJumin() throws IOException{
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
			
			for(int i=0;i<jumin.length-1;i++){
				if(i==6) continue;
				hap+=jumin[i]*cre;
				cre++;
				if(cre==10) cre=2;
				
			}
			
			temp = hap % 11;
			temp1 = (11-temp)%10;
			
			if( temp1 != jumin[13]){
				System.out.println("주민번호가 올바르지 않습니다!");
				continue;
			}
			right = true;
			
		}while(!right);
	}
	
	public void display(){
		System.out.println();
		System.out.println("이름 : "+name);
		System.out.print("주민번호 : ");
		for(int i=0;i<jumin.length;i++){
			if(i==6){
				System.out.print("-");
				continue;
			}
			System.out.print(jumin[i]);
		}
		//생년월일 출력
		// jumin[7] = 0,9 -> 1800, 1,2->1900, 3,4->2000
		
		System.out.println();
		System.out.print("생년월일 : ");
		int year=0, month=0, day=0;
		switch(jumin[7]){
		case 0: case 9:
			year=1800;
			break;
		case 1: case 2:
			year=1900;
			break;
		case 3: case 4:
			year=2000;
			break;
		}
		
		year += jumin[0]*10 + jumin[1];
		month = jumin[2]*10 + jumin[3];
		day = jumin[4]*10 + jumin[5];
		
		System.out.println(year + "년 "+month+"월 "+day+"일");
		
		System.out.println("성별 : " + (jumin[7]%2==0?"여성":"남성"));
		
		System.out.print("출생신고지 : ");
		String area = null;
		switch(jumin[8]){
		case 0: area="서울"; break;
		case 1: area="경기, 인천"; break;
		case 2: area="부산"; break;
		case 3: area="강원도"; break;
		case 4: area="충청도"; break;
		case 5: area="전라도"; break;
		case 6: area="대구, 광주"; break;
		case 7: area="경북, 경남"; break;
		case 8: area="경북"; break;
		case 9: area="제주"; break;
			
		}
		System.out.println(area);
		System.out.print("나이 : ");
		Calendar cal = Calendar.getInstance();
		int age = cal.get(Calendar.YEAR)-year+1;
		System.out.println(age+" 세 ");
	}
	
}








