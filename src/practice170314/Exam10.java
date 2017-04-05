package practice170314;
//주민번호 관련 P/G
//이름, 주민번호 입력받음
// 주민번호 가지고 생년월일, 성별, 출생지 만듬
// 



/*
public class Exam10 {
	private int[] pernum;
	private String name;
	
	public Exam10(){
		pernum = new int[14];
		name = " ";
		
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.nextLine();		
		System.out.print("주민번호 입력(13자리) : ");
		pernum = Integer.parseInt(sc.nextLine());

	}
}

*/
import java.util.Scanner;
import java.io.*;

class Exam10{
	
	private String name; // 이름
	private int[] perFroNum = new int[6]; 
	private int[] perBotNum = new int[7];

	Exam10() throws IOException{
		
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		
		
			System.out.print("이름 입력 : ");
			name = in.readLine();
			
			for(int i=0;i<perFroNum.length;i++){
			System.out.print("주민 번호 " + (i+1) +"자리 입력 : ");
			perFroNum[i] = Integer.parseInt(in.readLine());
			}
			for(int i=0;i<perBotNum.length;i++){
			System.out.print("주민 번호 " + (i+7) +"자리 입력 : ");
			perBotNum[i] = Integer.parseInt(in.readLine());
			}
		
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + perFroNum + "-" +perBotNum);
		System.out.println("생년월일 : " + perFroNum[1]+perFroNum[2]+perFroNum[3]+perFroNum[4]+perFroNum[5]+perFroNum[6]);
		System.out.println("성별 : " + perBotNum[1]);
		System.out.println("출생지 : " + perBotNum[2]);
	}
	
	public static void main(String[] ar) throws IOException{
			Exam10 ex = new Exam10();


	}
}

