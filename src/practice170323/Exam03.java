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
 * ?ŒŒ?¼?˜ ?…ì¶œë ¥?„ ?´?š©?•˜?—¬ ì£¼ì†Œë¡? ?”„ë¡œê·¸?¨?„ ?™„?„±?•˜?‹œ?˜¤.
 * 1. ?…? ¥ 2. ì¡°íšŒ 3. ì¢…ë£Œ : 
 * 1.
 * ?´ë¦? : 
 * ? „?™” : 
 * ì£¼ì†Œ : 
 * 2.
 * ?ŒŒ?¼?˜ ? „ì²? ?‚´?š© ì¶œë ¥
 * 
 * //? •ë³´íŒŒ?¼?„ ?ƒ?„±
 * //?´ë¦„ì „?™”ì£¼ì†Œë¥? ?…? ¥ë°›ê³  ê·? ?‚´?š©?„ ? •ë³? ?ŒŒ?¼?— ?…? ¥
 * //?…? ¥ ?˜?—ˆ?„?•Œ 
 * 
 */

public class Exam03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ?…? ¥ 2. ì¡°íšŒ 3. ì¢…ë£Œ : ");
		int input = Integer.parseInt(sc.nextLine()); 
		switch(input){
		case 1 : 
		FileCreation fc = new FileCreation(); // ê°œì¸? •ë³? ?ŒŒ?¼ ?ƒ?„±
		InputInfo ii = new InputInfo(); // ?ŒŒ?¼?— ê°œì¸? •ë³´ë?? ?…? ¥ ë°›ì•„?•¼?•¨
		break;
		case 2 : 
		ViewInfo vi = new ViewInfo();
		break;
		case 3 : 
		System.out.println("ì¢…ë£Œ");
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
		System.out.println("?´ë¦? : ");
		String name = sc.nextLine(); 
		System.out.println("? „?™” : ");
		int phoneNum = Integer.parseInt(sc.nextLine()); 
		System.out.println("ì£¼ì†Œ : ");
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