package practice170310;
/*
 * 
 * 메소드로 프로그램 작성 
 * 1. 최대수 2. 사이값 3. 수나열 4. 종료 (1~4사이의 숫자를 입력하시오) : 
 * 철번째 수 : 100
 * 두번째 수 : 200
 * 최대수는 200입니다
 * 
 * 1. 최대수 2. 사이합 3. 수나열  4. 종료 :
 * 1,2,3은 메소드로 만든다
 * 
 * System.exit(-1);// 프로그램 종료
 */
import java.io.*;
import java.util.*;

public class Exam04 {

	//최대수 구하는 메소드
	public static void Max(int first, int second){
		if(first<second){
			System.out.print("최대값 : " + second);
		}else{
			System.out.print("최대값 : " + first);			
		}
		System.out.println();	
		System.out.print("종료합니다");
		System.exit(-1);
	}
	
	//사이값 구하는 메소드
	public static void Bet(int first, int second){
		System.out.print("사이합 : ");

		if(first<second){
			int t=0;
			for(int i=first+1;i<second;i++){
			t=t+i;}
			System.out.print(t);
		
		}else{
			int t=0;
			for(int i=second+1;i<first;i++){
				t=t+i;}
				System.out.print(t);
			
			}
		System.out.println();	
		System.out.println("종료합니다");
		System.exit(-1);
	}
	
	//수를 나열하는 메소드
	public static void Seq(int first, int second){
		System.out.print("수나열 : ");
		if(first<second){
			for(int i=first;i<=second;i++)
			System.out.print(i+"\t");
			
		}else{
			for(int i=second;i<=first;i++)
			System.out.print(i+"\t");		
		}
		System.out.println("종료합니다");
		System.exit(-1);
	}
	
	// 메인 메소드
	public static void main(String[] args) throws IOException {
		
		int input = 0;
		int first=0, second=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 최대수 2. 사이값 3. 수나열 4. 종료 (1~4사이의 숫자를 입력하시오) : ");
		input = Integer.parseInt(sc.nextLine());
		if (input==4){
			System.out.print("종료합니다");
			System.exit(-1);
			
		}
		else
		{
				
		System.out.print("첫번째 수 : ");
		first = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 수 : ");
		second = Integer.parseInt(sc.nextLine());
		
		switch(input){
		case 1 : Max(first,second);
		case 2 : Bet(first,second);
		case 3 : Seq(first,second);
		default: System.out.println("잘못 입력하셨습니다");
		
		}
		}
	}
		
}

