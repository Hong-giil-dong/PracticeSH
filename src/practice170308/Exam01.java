package practice170308;


//변수->배열(연속된 공간)-> 구조체(배열은 정수만 저장가능해서 다양한 값(정수,실수 등)을 저장하기 위해)->클래스(java,c++)
//배열명[요소수] -> 요소수가 1개 잇으면 1차원 2개 있으면 2차원 3개 있으면 3차원 4개 있으면 다차원, 보통 2차원내에서 해결됨
//int kor[5] ->  0 1 2 3 4 
//선언할때는 개수 사용할때는 위치
//kor[3] = 123; 123을 3 위치에 기억시켜라
// int kore[2][3]
//          행 열
// int kor [2][3][4]
//         면  행  열



import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args){
		
		//배열의 선언
		int[] sung;
		int sung1[]={1,2,3};// 아예 배열 선언할때 초기값을 부여하면 데이터 개수만큼 바로 사용할 수 있다

		String[] kwa={"국어","영어","수학"};
		
		//배열의 초기화(실제 공간을 사용하기 위해서는 생성해야됨
		sung = new int[3]; // new는 생성자
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.print(kwa[i]+":");
			sung[i]=Integer.parseInt(sc.nextLine());
		}
		for(int i=0;i<3;i++){
			System.out.println(kwa[i]+":"+sung[i]);
		}
	}
}


/**
 * 3명의 국어, 영어, 수학 점수를 각각 입력 받아서 총점과 평균을 모두 구하시오
 * 출력예시
 * 번호 국어 영어 수학 총점 평균
 */



