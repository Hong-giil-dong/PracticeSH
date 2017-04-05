package practice170326;
import java.util.Calendar;

public class ThreeMonthCalendar {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.nowYear();
		c.nowMonth();
		System.out.println("===================================================");

		if(c.month==12) {
			for(int i=-1;i<1;i++){
				int start = c.setStart(c.year, c.month+i); 
				int end = c.setDay(c.month+i); 
				c.disp(c.year, c.month+i, start, end);
			}
			int start = c.setStart(c.year+1, c.month-11); 
			int end = c.setDay(c.month-11); 
			c.disp(c.year+1, c.month-11, start, end);
			
		}else if(c.month==1){
			{
			int start = c.setStart(c.year-1, c.month+11); 
			int end = c.setDay(c.month+11); 
			c.disp(c.year-1, c.month+11, start, end);
		}
			for(int i=0;i<2;i++){
				int start = c.setStart(c.year, c.month+i); 
				int end = c.setDay(c.month+i); 
				c.disp(c.year, c.month+i, start, end);
			}
			
		}else{
			for(int i=-1;i<2;i++){
				int start = c.setStart(c.year, c.month+i);
				int end = c.setDay(c.month+i);
				c.disp(c.year, c.month+i, start, end);
			}
		}
	}
}

class Calc {

	int start=0;
	int end=0,pos=0;
	Calendar cal = Calendar.getInstance();
	static int year=1023, month=4;
	static final int BASE = 1;

	
	int nowMonth() {
		month = (cal.get(Calendar.MONTH)+1);
		return month;
	}
	
	
	int nowYear() {
		year = cal.get(Calendar.YEAR);
		return year;
	}
	
	
	static boolean yun() {
		if (year%4 == 0 && year%100!=0 || year%400==0){
			return true;
		}else{
			return false;
		}
	}
	
	
	int setDay (int month) {
		Calc c = new Calc();
		switch(month){
		case 1: case 3: case 5: case 7: case 8:
		case 10: case 12: c.end=31;break;
		
		case 4: case 6: case 9: case 11: c.end=30;break;
			
		case 2:
			if(yun()) c.end=29;else c.end=28;break;
		}
		return c.end;
	}
	
	
	int setStart(int year, int month) {
		start = year - BASE;
		for(int i=BASE;i<year;i++)
			if(i%4 == 0 && i%100!=0 ||i%400==0){
				start=start+1;}
		for (int i=1;i<month;i++)
				switch(i){
				case 1: case 3: case 5: case 7: case 8:
				case 10: case 12: start+=31;break;
				
				case 4: case 6: case 9: case 11: start+=30;break;
					
				case 2:
					if(yun()) start+=29; else start+=28;break;
	}
		return start;
	}
	
	
	void disp(int year, int month, int start, int end) {
		Calc c = new Calc();
		start%=7;
		
		System.out.print(year + "년\t");
		System.out.print(month + "월\t");
		System.out.println();
		System.out.print("월\t화\t수\t목\t금\t토\t일");
		System.out.println();
 
		for(int i=0;i<start;i++,c.pos++){
			System.out.print("\t");
			}
					
		for(int i=1;i<=end;i++){
			if(i<10) System.out.print(' ');
			System.out.print(i);
			++c.pos;
			if(c.pos%7==0)
				System.out.println();
			else
				System.out.print("\t");
			}
		
			System.out.println();
		System.out.println("===================================================");
	}
	
}
