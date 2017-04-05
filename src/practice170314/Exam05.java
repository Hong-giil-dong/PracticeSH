package practice170314;
//과제)

import java.io.*;
class Exam05{
	int[] sub = new int[4]; //0:국어,1:영어,2:수학,3:총점
	float avg; //4.평균
	Exam05() throws IOException{
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		String[] str ={"국어","영어","수학"};
		for(int i=0;i<str.length;i++){
			System.out.print(str[i] +" : ");
			sub[i] = Integer.parseInt(in.readLine());
			sub[str.length] += sub[i];
		}
		avg = sub[str.length] / (float)str.length;
		
		System.out.println("총점 : " + sub[str.length]);
		System.out.println("평균 : " + avg);
	}
	
	public static void main(String[] ar) throws IOException{
		Exam05 ex = new Exam05();


	}
}


//위이ㅡ 클래스를 활용하여 국어, 영어, 수학의 점수를 입력 받아서 총점과 평균을 구하는 프로그램을 작성 하시오