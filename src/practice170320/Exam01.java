package practice170320;
/*
 * 3������ ������ �Է¹޾� ���� ��� ������ ����ϴ� ���α׷��� Ŭ������ ������ ������ �ۼ��Ͻÿ�.
 * �ִ� 10���� �л��� ������ �Է¹����� �ִ�.
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
		System.out.print("���� = ");
		kor = Integer.parseInt(in.readLine());
		System.out.print("���� = ");
		eng = Integer.parseInt(in.readLine());
		System.out.print("���� = ");
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
		
		System.out.println("����, ����, ����, ����, ���, ����");
		for(int i = 0; i<10; i++){
			sj[i].disp();
		}
		
	}
}

