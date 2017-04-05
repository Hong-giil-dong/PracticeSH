package practice170320;
/*
 * 3과목의 점수를 입력받아 총점 평균 석차를 출력하는 프로그램을 클래스로 적절히 나누어 작성하시오.
 * 최대 10명의 학생의 점수를 입력받을수 있다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Subject{
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double ave;
	private int rank;
	protected static BufferedReader in;
	static{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	protected Subject() throws IOException{
		System.out.print("국어 = ");
		kor = Integer.parseInt(in.readLine());
		System.out.print("영어 = ");
		eng = Integer.parseInt(in.readLine());
		System.out.print("수학 = ");
		math = Integer.parseInt(in.readLine());

		tot=this.kor+this.eng+this.math;
		ave=tot/3;
		
	}
		
	protected void disp(){
		System.out.println(this.kor + "  " + this.eng + "  " + this.math + "  "
		+ this.tot + "  " + this.ave);	
	}
}

class Calculator extends Subject {
	public Calculator() throws IOException {
	void disp();
	System.out.println(tot);
	System.out.println(ave);
	
	}
}

class Rank {
	int rank[] = new int[10]; {
		protected void (){
			for(int i=0;i<data.length;i++){
				rank[i]=1;
				for(int j=0;j<data.length;j++)
					if(data[i]<data[j])
						rank[i]++;
			}
		}
	}	
}


class Exam01 {
	public static void main(String[] args) throws IOException {
		Subject[] sj = new Subject[10];
		for(int i=0;i<10;i++){
			sj[i] = new Subject();
		}
		
		System.out.println("국어, 영어, 수학, 총점, 평균, 석차");
		for(int i = 0; i<10; i++){
			sj[i].disp();
		}
		
	}
}

