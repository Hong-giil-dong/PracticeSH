package practice170323;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * ??Ό? ?μΆλ ₯? ?΄?©??¬ μ£Όμλ‘? ?λ‘κ·Έ?¨? ??±???€.
 * 1. ?? ₯ 2. μ‘°ν 3. μ’λ£ : 
 * 1.
 * ?΄λ¦? : 
 * ? ? : 
 * μ£Όμ : 
 * 2.
 * ??Ό? ? μ²? ?΄?© μΆλ ₯
 * 
 * //? λ³΄ν?Ό? ??±
 * //?΄λ¦μ ?μ£Όμλ₯? ?? ₯λ°κ³  κ·? ?΄?©? ? λ³? ??Ό? ?? ₯
 * //?? ₯ ???? 
 * 
 */

public class Exam03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ?? ₯ 2. μ‘°ν 3. μ’λ£ : ");
		int input = Integer.parseInt(sc.nextLine()); 
		switch(input){
		case 1 : 
		FileCreation fc = new FileCreation(); // κ°μΈ? λ³? ??Ό ??±
		InputInfo ii = new InputInfo(); // ??Ό? κ°μΈ? λ³΄λ?? ?? ₯ λ°μ?Ό?¨
		break;
		case 2 : 
		ViewInfo vi = new ViewInfo();
		break;
		case 3 : 
		System.out.println("μ’λ£");
		System.exit(-1);
		break;
		}
	}
}

class FileCreation {
	FileCreation() throws Exception {}
	
	File f = new File("c:\\workspace\\java");
	File file = new File(f, "PersonalInfo.txt");
	FileWriter fw = new FileWriter(file);
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter pw = new PrintWriter(bw);
}

class InputInfo extends FileCreation {
	
	Scanner sc = new Scanner(System.in);
	
	InputInfo() throws Exception {
		System.out.println("?΄λ¦? : ");
		String name = sc.nextLine(); 
		System.out.println("? ? : ");
		int phoneNum = Integer.parseInt(sc.nextLine()); 
		System.out.println("μ£Όμ : ");
		String address = sc.nextLine();
		
		String info = (name + "\t" + phoneNum + "\t" + address);
		byte[] infoByte = info.getBytes();
		System.out.println(infoByte);
		
	try{
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(infoByte);
	}catch(Exception e){}
	}
}

class ViewInfo { 
	
}