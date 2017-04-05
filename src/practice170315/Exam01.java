package practice170315;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

//주민번호 관련 P/G
public class Exam01 {
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
			/*
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
			
			if(temp1 != jumin[13]){//연산자의 부등호를 =만 쓰면 안된다
				System.out.println("주민번호가 올바르지 않습니다!");
				continue;
			}
			right = true;
						*/
			
		}while(right);
		
		/**
		 * 이름 : 
		 * 주민번호 : 
		 * 생년월일 : 19(18,20)00년 00월 00일
		 * 성별 : 남성, 여성
		 * 출생신고지 : ??
		 * 나이 : 00세
		 */
		
		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : ");
		for(int i=0;i<jumin.length;i++){
			if(i==6){
				System.out.print("-");
				continue;
			}
			System.out.print(jumin[i]);
		}
		//생년월일 출력

		if(jumin[7]<3){
			System.out.println();		
			System.out.print("생년월일 : 18");
			for(int i=0;i<6;i++){
				System.out.print(jumin[i]);
			}
		}
		
		else if (jumin[7]>2){
			System.out.println();	
			System.out.print("생년월일 : 19");
			for(int i=0;i<6;i++){
				System.out.print(jumin[i]);
				}
		}
		else{
			System.out.println();	
			System.out.print("생년월일 : 20");
			for(int i=0;i<6;i++){
				System.out.print(jumin[i]);	
			}
		}
		
		//성별 구분
		if(jumin[7]<7){
			System.out.println();		
			System.out.print("남성");
		}
		else{
			System.out.print("여성");
		}
		
		//출생신고지
		
		int pos = 0;
		String area="";
		switch(pos){
		case 0: area="서울";break;
		case 1: area="경기,인천";break;
		case 2: area="부산";break;
		case 3: area="강원";break;
		case 4: area="충청";break;
		case 5: area="전라";break;
		case 6: area="대구,광주";break;
		case 7: area="경상";break;
		case 8: area="경남";break;
		case 9: area="제주";break;
		}
		
		System.out.println(area);
		System.out.print("나이 : ");
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("년 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("오전(0)/오후(1) : " + cal.get(Calendar.AM_PM));
		System.out.println("시 : " + cal.get(Calendar.HOUR));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("밀리초 : " + cal.get(Calendar.MILLISECOND));
		System.out.println("밀리초 : " + cal.get(Calendar.YEAR));
		
		int Na;
		
		/*
		나이를 구하는법
		현재 연도에서 내 생년을 뺀다
		
		현재 월에서 내 생월과 비교해서 생월(02)이 현재월(03)보다 작으면 나이가 하나 늘어난다
		그렇지 않으면 나이는 그대로다
		
		현재 일에서 내 생'일'과 비교해서 생일(14)이 현재일(15)보다 작으면 나이가 하나 늘어난다
		그렇지 않으면 나이는 그대로다
		*/
		
		
		if(jumin[7]<3){
			System.out.println();		
			int Y = 1800;
			Y+=(jumin[0]*10)+jumin[1];
			Na=(cal.get(Calendar.YEAR))-Y;
			System.out.println("나이 : " + Na);
			
			if((Y+=(jumin[2]*10)+jumin[3]) >= (cal.get(Calendar.MONTH)));
			System.out.println("나이 : " + Na+1);
		}
			
		else if (jumin[7]>2){
			System.out.println();		
			int Y = 1900;
			Y+=(jumin[0]*10)+jumin[1];
			Na=(cal.get(Calendar.YEAR))-Y;
			System.out.println("나이 : " + Na);
		}
		else{
			System.out.println();		
			int Y = 2000;
			Y+=(jumin[0]*10)+jumin[1];
			Na=(cal.get(Calendar.YEAR))-Y;
			System.out.println("나이 : " + Na);
		}
	}		
}
