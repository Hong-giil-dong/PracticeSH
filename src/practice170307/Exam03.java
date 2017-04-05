package practice170307;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 주민번호의 8번째 숫자를 입력하여 출생지역을 확인하는 프로그램을 작성하시오.
 * 지역
 * 0서울
 * 1경기 인철
 * 2부산
 * 3강원
 * 4충청
 * 5전라
 * 6대구,광주
 * 7경상
 * 8경남
 * 9제주
 */
public class Exam03 {
	public static void main(String[] args)  throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int pos = 0;
		String area="";
		
		System.out.print("8번째 자리 입력 : ");
		pos = Integer.parseInt(in.readLine());
		

		
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
				System.out.println();
				System.out.print(area);
	}
}
/*
import java.io.*;
import java.util.*;

public class Exam03 {
	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int num, loc = 0;
		System.out.print("주민번호 8번째 자리 입력 : ");
		num = Integer.parseInt(sc.nextLine());			
	switch(num){
	case 1:	
		System.out.println("경기, 인천");
		break;
	case 2:
		System.out.println("부산");
		break;
	case 3:
		System.out.println("강원");
		break;
	case 4:
		System.out.println("충청");
		break;
	case 5:
		System.out.println("전라");
		break;
	case 6:
		System.out.println("대구, 광주");
		break;
	case 7:
		System.out.println("경상");
		break;
	case 8:
		System.out.println("경남");
		break;
	case 9:
		System.out.println("제주");
		break;
	case 0:
		System.out.println("서울");
		break;
	default: System.out.println("잘못 입력하셨습니다");
		System.exit(-1);
	}
	System.out.println();
}
}
*/
