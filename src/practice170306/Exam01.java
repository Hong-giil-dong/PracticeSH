package practice170306;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		/*
		 * if문 1형식
		 * if(논리형 조건) -> 트루나 펄스가 되어야함
		 * 		내용_실행문;
		 * if(논리형 조건){ ->여러줄 블럭?
		 * 		내용_실행문;
		 * 		내용_실행문;
		 *  	내용_실행문;
		 * }
		 * if문 2형식
		 * if(조건)
		 * 		내용실행문; // 조건이 참일경우
		 * else
		 * 		내용 실행문; // 거짓일때
		 * 
		 * if문 3형식
		 * if(조건)
		 * 		실행문
		 * else if(조건)
		 * 		실행문;
		 * else if(조건)
		 * 		실행문;
		 * else
		 * 		실행문;
		 * 
		 */
		/**
		System.out.print("숫자를 입력(0~9) : ");
/**
		int num = System.in.read()-'0'; //-48은 아스키 코드값을 빼는거임 ()-'0'; 대체도 가능
		if(num%2 == 0)
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
		*/
		/**
		int num = System.in.read()-48;
		if ((num%3 == 0) && (num%5 == 0))
			System.out.println("3과 5의 배수입니다.");	
		else 
			System.out.println("3과 5의 배수가 아닙니다.");	
		*/
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("점수 입력 : ");
		int num = Integer.parseInt(in.readLine());
		
		if(num<=100 && num>=90)
			System.out.println("수");
		else if(num>=80)
			System.out.println("우");
		else if(num>=70)
			System.out.println("미");
		else if(num>=60)
			System.out.println("양");
		else
			System.out.println("가");
		//Swaping
		int a=5, b=6;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		int t = a;
		a=b;
		b=t;
		System.out.println("A = " + b);
		System.out.println("B = " + a);
	}
}




/** 조건문
{실행문1
실행문2} 
대괄호 해줘야됨
if실행문
else
3if (조건)
else if (조건)
딘ㄷ
스위치 조건문

임의의 수를 입력받아 3의 배수이면서 동시에 5의배수

값을 세개 받아서 큰순으로 정렬하시오
자리교환



 */
*/