package practice170323;
//

import java.io.*;

public class Exam08 implements Serializable{
	private String name;
	private String tel;
	private String addr;
	private static BufferedReader in;
	static{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public Exam08() throws IOException{
		System.out.print("이름 : ");
		this.name = in.readLine();
		System.out.print("전화 : ");
		this.tel = in.readLine();
		System.out.print("주소 : ");
		this.addr = in.readLine();
	}
	
	public void disp(){
		System.out.print(name + "\t");
		System.out.print(tel + "\t");
		System.out.println(addr);
	}
}