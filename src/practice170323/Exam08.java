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
		System.out.print("�̸� : ");
		this.name = in.readLine();
		System.out.print("��ȭ : ");
		this.tel = in.readLine();
		System.out.print("�ּ� : ");
		this.addr = in.readLine();
	}
	
	public void disp(){
		System.out.print(name + "\t");
		System.out.print(tel + "\t");
		System.out.println(addr);
	}
}