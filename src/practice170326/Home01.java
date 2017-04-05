package practice170326;
/*
 * 달력 -> 만년달력 -> 캘린더 클래스 가지고 만들기
 * 이제까지 배운것을 모두 가지고 만들기
 * 실행하는 날짜 기준으로 앞 뒤 2개월 날짜가 출력되게 만들자
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
 
public class Home01 {
	public static void main(String[] ar) throws IOException{

		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year=0,month=0;
		int start=0,end=0;
		int base=1;
		boolean bool=false;
		int pos=0;
	
		//계산할 날짜 입력 도구
		
		Calendar cal = Calendar.getInstance();
		
		do{
			System.out.print("현재 연도 : ");
			year = (cal.get(Calendar.YEAR));
			System.out.println(year + "년\t");
		}while(year<1 || year>9999);
		
		do{
			System.out.print("현재 월 : ");
			month = (cal.get(Calendar.MONTH));
			System.out.print(month+1 + "월");
		}while(month<1 || month>12);
		
		if (year%4 == 0 && year%100!=0 || year%400==0)//
			bool=true;
		
		switch(month){// 해당월에 대해 일수를 정해주는 부분
		case 1: case 3: case 5: case 7: case 8:
		case 10: case 12: end=31;break;
		
		case 4: case 6: case 9: case 11: end=30;break;
			
		case 2:
			if(bool) end=29;else end=28;break;
		
		}
		
 
		if(year<base){
			start = base - year;
			for(int i=year;i<base;i++){
				if (year%4 == 0 && year%100!=0 || year%400==0)
					start++;
				start = 7-start%7;
			}
				if(start==7) start=0;
			}else{
				start = year - base;
				for(int i=base;i<year;i++)//
					if(i%4 == 0 && i%100!=0 ||i%400==0){//
						start=start+1;}//
				for (int i=1;i<month;i++)
						switch(i){
						case 1: case 3: case 5: case 7: case 8:
						case 10: case 12: start+=31;break;
						
						case 4: case 6: case 9: case 11: start+=30;break;
							
						case 2:
							if(bool) start+=29; else start+=28;break;
			}
			}
		
	
		start%=7;
		System.out.println();
		System.out.print(year + "년\t");
		System.out.print(month + "월");
		System.out.println();
		System.out.print("월\t화\t수\t목\t금\t토\t일");
		System.out.println();
 
		for(int i=0;i<start;i++,pos++){
			System.out.print("\t");
			}
					
 
		for(int i=1;i<=end;i++){
			if(i<10) System.out.print(' ');
			System.out.print(i);
			++pos;
			if(pos%7==0)
				System.out.println();
			else
				System.out.print("\t");
			}
		
			System.out.println();
		System.out.println("===================================================");
	}
}	