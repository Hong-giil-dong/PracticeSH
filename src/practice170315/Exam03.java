package practice170315;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03 {
	int x;
	int y;
	static int tot;
	static BufferedReader in;
	static{
		in = new BufferedReader
				(new InputStreamReader(System.in));
		tot = 0;
	}
	
	public Exam03() throws IOException{
		System.out.print("x = ");
		this.x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		this.y = Integer.parseInt(in.readLine());
		
		Exam03.tot = this.x + this.y;
	}

	public static int getTot() {
		return tot;
	}

	public static void setTot(int tot) {
		Exam03.tot = tot;
	}
	
	public void display(){
		System.out.print(this.x +" + " + this.y +" = ");
		System.out.println(Exam03.tot);
		
	}
	
	
}


/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 */
/*
public class Exam03 {
	private int x;
	private int y;
	static int tot;
	static BufferedReader in;
	static{
		Exam03.in = new BufferedReader(new InputStreamReader(System.in));
		//this.tot = 0;// this에 에러남. static을 선언하는 과정중에 있는 문단이기 때문에 참조할 static이 없는 것이다 
		tot=0;
		
	}
	
	public void setXY() throws IOException{
		System.out.print("x = ");
		this.x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		this.y = Integer.parseInt(in.readLine());
		
		this.tot = this.x + this.y;
	}
	
	public static void setTot(int tot){
		Exam03.tot=tot;
	}
	
	public void display(){
		System.out.print(this.x+" + "+" + "+this.y +" = ");
		System.out.println(Exam03.tot);
	}
}
*/