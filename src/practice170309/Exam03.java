package practice170309;
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
 * 석차 기준으로 정렬
 * 
 */
import java.io.IOException;
import java.util.Scanner;

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

public class Exam03 {
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
		for(int k=0;k<5;k++){
			System.out.println();
		for(int i=0;i<rank.length;i++){			
			for(int j=i+1;j<rank.length;j++){
				if(rank[i]>rank[j]){
					
					String u = name[i];
					name[i]=name[j];
					name[j]= u;
					
					int t = num[i][k];
					num[i][k]=num[j][k];
					num[j][k]= t;
					
					t = num[i][k];
					num[i][k]=num[j][k];
					num[j][k]= t;
					
					t = num[i][k];
					num[i][k]=num[j][k];
					num[j][k]= t;
					
					t = num[i][k];
					num[i][k]=num[j][k];
					num[j][k]= t;
					
					float q = avg[i];
					avg[i]=avg[j];
					avg[j]= q;
					
					t = rank[i];
					rank[i]=rank[j];
					rank[j]= t;
					
				}
				}
			}
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

/**
 * 
 * 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] ar){
		//각종 선언문
		Scanner sc = new Scanner(System.in);
		
		String[] irum = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		
		
		
		//출력 변수(계산 또는 가공)
		int[] tot = new int[5];
		int[] rank = new int[5];
		float[] ave = new float[5];
		//임시 변수
		
		//입력
		for(int i=0;i<irum.length;i++){
			System.out.print("이름 : ");
				irum[i] = sc.nextLine();
					
				System.out.print("국어 : ");
				kor[i]=Integer.parseInt(sc.nextLine());
			System.out.print("영어 : ");
				eng[i]=Integer.parseInt(sc.nextLine());
			System.out.print("수학 : ");
				mat[i]=Integer.parseInt(sc.nextLine());
				
			tot[i]=kor[i]+eng[i]+mat[i];
			ave[i]=((int)((tot[i]/3.0f+0.005)*100))/100;					
		}
		
		for(int i=0;i<tot.length;i++){ //석차 구하기
			rank[i]=1;
			for(int j=0;j<tot.length;j++){
				if(tot[i]<tot[j])
					rank[i]++;
			}
		}
		
		for(int i=0;i<rank.length-1;i++){ //정렬 하기
			for(int j=i+1;j<rank.length;j++){
				if(rank[i]>rank[j]){ //석차를 기준으로 오름차순
					//이름
					String temp = irum[i];
					irum[i] = irum[j];
					irum[j] = temp;
				
					//국어
					int t = kor[i];
					kor[i] = kor[j];
					kor[j] = t;
					
					//영어
					t = kor[i];
					eng[i] = eng[j];
					eng[j] = t;
					
					//수학
					t = mat[i];
					mat[i] = mat[j];
					mat[j] = t;
					
					//총점
					t = tot[i];
					tot[i] = tot[j];
					tot[j] = t;
					
					//평균
					float tt = ave[i];
					ave[i] = ave[j];
					ave[j] = tt;
					
					//석차
					t = rank[i];
					rank[i] = rank[j];
					rank[j] = t;
				}
			}
		}
		
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i=0;i<rank.length;i++){
			System.out.println(irum[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+ave[i]+"\t"+rank[i]);
		}
		
		
	}
}

*/
	