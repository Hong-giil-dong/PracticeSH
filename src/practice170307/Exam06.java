package practice170307;
/*
 * 만년달력 만들기
 * 모든걸 사용해서
 * 2006년 1월 1일을 기준(일요일)
 */

import java.io.*;
import java.util.*;

public class Exam06 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		int year=0,month=0;
		int start=0,end=0;
		int base=0; //연도의 기준년
		boolean bool=false; //윤년 체크
		int pos=0;
				
		do{
			System.out.print("연도 입력(2017) : ");
			year = Integer.parseInt(in.readLine());
		}while(year<0 || year>9999);
		
		do{
			System.out.print("월 입력(3) : ");
			month = Integer.parseInt(in.readLine());
		}while(month<1 || month>12);
		
		if (year%4 == 0 && year%100!=0 || year%400==0)
			bool=true;
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8:
		case 10: case 12: end=31;break;
		
		case 4: case 6: case 9: case 11: end=30;break;
			
		case 2:
			if(bool) end=29;else end=28;break;
		
		}
		
		if(year<base){ //2312321313
			start = base - year;
			for(int i=year;i<base;i++){
				if (year%4 == 0 && year%100!=0 || year%400==0)
					start++;
				start = 7-start%7;
			}
				if(start==7) start=0;
			}else{
				start = year - base;
				for(int i=base;i<year;i++)
					if(year%4 == 0 && year%100!=0 ||year%400==0)
						start++;
				start%=7;
						
				for (int i=1;i<month;i++){
						switch(i){
						case 1: case 3: case 5: case 7: case 8:
						case 10: case 12: start+=31;break;
						
						case 4: case 6: case 9: case 11: start+=30;break;
							
						case 2:
							if(bool) start+=29;else start+=28;break;
						//4윤년이 돌아올때마다 날짜가 하나씩 밀림
							//4년 2월이 왜 윤년이 아닌걸로 표시될까
			}
		}
		start%=7;
		System.out.print(year + "년");
		System.out.print(month + "월");
		System.out.println();
		System.out.print("일\t월\t화\t수\t목\t금\t토");
		System.out.println();
		for(int i=0;i<start;i++,pos++)
			System.out.print("\t");
		for(int i=1;i<=end;i++){
			if(i<10) System.out.print(' ');
			System.out.print(i);
			++pos;
			if(pos%7==0)
				System.out.println();
			else
				System.out.print("\t");
	}
		if(pos%7!=0)
			System.out.println();
		System.out.println("===================================================");
	}
}	
}
		
/**
		}
		
		Scanner sc = new Scanner(System.in);
		int year =0;
		boolean bool=false;
		
		System.out.print("윤년 확인연도 입력 : ");
		year = Integer.parseInt(sc.nextLine());
		if (year%4 == 0 && year%100!=0 || year%400==0)
			bool=true;
			System.out.println();
			System.out.print(year + "년은 ");
			System.out.print(bool?"윤년입니다":"평년입니다");
	}
}
*/
/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		boolean bool=false;
		System.out.print("윤년 확인연도 입력 : ");
		int a = Integer.parseInt(in.readLine());
		if (((a/400)==0) || ((a/100)==0))
			System.out.print(a + "는 윤년입니다");

			
		}
	}
*/


/*
 * 만년달력 만들기
 * 윤년 구하는 프로그램 만들기
 * 1. 윤년인지 판단하고자 하는 년도 입력
 * 2. 윤년은 4년에 한번
 * 3. 단, 10으로 나누어 떨어지는 해는 윤년이 아님 
 * 4. 단, 100으로 나누어 떨어지는 해 중에서 \400으로 나누어 떨어지는 해는 윤년이다.
 * 5. 2000년은 윤년
 * 
 * 입력 
 * 연도를 입력 : 2000
 * 출력
 * 2000년은 윤년입니다
 * 2013년은 윤년이 아닙니다
 * 
 * 12일 일요일 밤 12시까지 진짜 만년달력
 * kkoun@naver.com
 * 소스코드만 보내면 된다
 * 제목 본인 이름
*/