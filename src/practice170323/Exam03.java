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
 * ?��?��?�� ?��출력?�� ?��?��?��?�� 주소�? ?��로그?��?�� ?��?��?��?��?��.
 * 1. ?��?�� 2. 조회 3. 종료 : 
 * 1.
 * ?���? : 
 * ?��?�� : 
 * 주소 : 
 * 2.
 * ?��?��?�� ?���? ?��?�� 출력
 * 
 * //?��보파?��?�� ?��?��
 * //?��름전?��주소�? ?��?��받고 �? ?��?��?�� ?���? ?��?��?�� ?��?��
 * //?��?�� ?��?��?��?�� 
 * 
 */

public class Exam03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ?��?�� 2. 조회 3. 종료 : ");
		int input = Integer.parseInt(sc.nextLine()); 
		switch(input){
		case 1 : 
		FileCreation fc = new FileCreation(); // 개인?���? ?��?�� ?��?��
		InputInfo ii = new InputInfo(); // ?��?��?�� 개인?��보�?? ?��?�� 받아?��?��
		break;
		case 2 : 
		ViewInfo vi = new ViewInfo();
		break;
		case 3 : 
		System.out.println("종료");
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
		System.out.println("?���? : ");
		String name = sc.nextLine(); 
		System.out.println("?��?�� : ");
		int phoneNum = Integer.parseInt(sc.nextLine()); 
		System.out.println("주소 : ");
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