package practice170308;
/*
 * 5명의 학생의 국어, 영어, 수학 점수를 입력 받아서 총점과 평균을 구하고 총점을 기준으로 석차를 출력 하시오.
 * (단, 평균은 소수점 이하 2자리까지 표시하시오.)
 * <입력>
 * 이름 : 
 * 국어 : 
 * 영어 : 
 * 수학 : 
 * 
 * <<출력>>
 * 이름 국어 영어 수학 총점 평균 석차
 * 
 */
import java.io.IOException;
import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args){
		
		int[][] num = new int[5][4];
		String[] name=new String[5];
		String[] kwa={"국어","영어","수학","총점","평균"};
		float avg[] = new float[5];
		int rank[] = new int[5];
		
		Scanner sc = new Scanner(System.in);

		for(int j=0;j<5;j++){
			System.out.print("이름 : ");
		
			name[j] = sc.nextLine();
			for(int i=0;i<3;i++){
			System.out.print(kwa[i]+":");
			num[j][i] = Integer.parseInt(sc.nextLine());

		}
			System.out.println();
		}
		
		for(int j=0;j<5;j++){
			num[j][3] = num[j][0]+num[j][1]+num[j][2];
			avg[j]=(float)num[j][3]/3;
		}
		
		for(int i=0;i<avg.length;i++){
				rank[i]=1;
				for(int j=0;j<avg.length;j++)
					if(avg[i]<avg[j])
						rank[i]++;
		}
		System.out.println("이름" + "\t" + "국어" + "\t" +"영어" + "\t" +"수학" + "\t" +"총점" + "\t" +"평균" + "\t" +"석차");
		for(int j=0;j<5;j++){
			System.out.print(name[j]);
			for(int i=0;i<4;i++){
			System.out.print("\t" + num[j][i]);
		}
			System.out.println("\t" + String.format("%1.2f",avg[j]) + "\t" + rank[j]);
		}
	}
}