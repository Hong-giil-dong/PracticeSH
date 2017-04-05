package practice170307;
import java.util.*;

public class Exam02 {
	public static void main(String[] ar){
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
*/