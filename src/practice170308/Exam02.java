package practice170308;
/**
 * 3명의 국어, 영어, 수학 점수를 각각 입력 받아서 총점과 평균을 모두 구하시오
 * 출력예시
 * 번호 국어 영어 수학 총점 평균
 */

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args){
		
		//배열의 선언
		int[][] sung;
		String[] name = new String[3];

		String[] kwa={"이름","국어","영어","수학","총점","평균"};
		
		//배열의 초기화(실제 공간을 사용하기 위해서는 생성해야됨
		sung = new int[3][6]; // new는 생성자
		
		Scanner sc = new Scanner(System.in);

		for(int j=0;j<3;j++){//입력을 3번 3줄씩 받는 곳
			for(int i=0;i<4;i++){
			System.out.print(kwa[i]+":");
			sung[j][i]=Integer.parseInt(sc.nextLine());
		}
		}
		//총점,평균계산하고 저장하는 곳
		for(int j=0;j<3;j++){
			for(int i=4;i<5;i++){
		
			sung[j][i]=sung[j][2]+sung[j][3]+sung[j][4];
			sung[j][i+1]=sung[j][i]/3;
			}
		}	
		
		for(int j=0;j<3;j++){//출력을 3줄 하는 곳
			for(int i=0;i<6;i++){
			System.out.print("\t"+kwa[i]+":"+sung[j][i]);
		}
			System.out.println();
		}
	}
}

/*
int sw=0;
for(int i=1;i<=5;i++){
	if(sw==0){
		System.out.print("+"+i);;//+1
		sw=1;
	}else{
		System.out.print("-"+i);//+1-2
		sw=0;
*/