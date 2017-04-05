package practice170306;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exam11 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("국어 점수 입력(0~100사이 입력) : ");
		int a = Integer.parseInt(in.readLine());
		do{
		}while(!(a>=0) || !(a<=100));
		
		System.out.print("영어 점수 입력(0~100사이 입력) : ");
		int b = Integer.parseInt(in.readLine());
		do{
		}while(!(b>=0) || !(b<=100));
		
		System.out.print("수학 점수 입력(0~100사이 입력) : ");
		int c = Integer.parseInt(in.readLine());
		do{
		}while(!(c>=0) || !(c<=100));
		
		System.out.println("국어 점수 : " + a);
		System.out.println("영어 점수 : " + b);
		System.out.println("수학 점수 : " + c);
		float avg;
		double sum=a+b+c;
		System.out.println("총점 : " + sum);	
		avg=((int)(((sum/3.0f)+0.05f)*10)/10.0f); //핵심
		System.out.println("평균 : " + avg);		
	}
}
/**
 * 국어 영어 수학 점수를 입력받아서 총점과 평균을 구하여 출력하시오.
 * 단 평균은 소수 2자리에서 반올림하여 1자리까지출력하고 각 과목의 점수는 0~100사이의 수만 입력받을 수 있다.평균 :  avg
 */

