package practice170322;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * 키보드로 1바이트의 정보를 입력 받아서 파일에 저장하시오.
 */
public class Exam09 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		File f = new File("c:\\workspace\\java\\input.txt");	
		String inputSt = sc.nextLine();
		
		try{
			FileOutputStream fos =  
					new FileOutputStream(FileDescriptor.out);
			FileOutputStream fos1 = 
					new FileOutputStream(f);
			
			byte[] data = {65,66,67,68};
			fos.write(data);
			fos1.write(data);
		}catch(Exception e){}
		
		System.out.println("");
		System.out.println("다음줄");	
		
		try{
			FileInputStream fis = new FileInputStream(f);
			byte[] by = new byte[65536]; // 2의 16승
			int count = fis.read(by);
			for(int i=0;i<count;i++)
				System.out.print((char)by[i]);
			//	System.out.println(i + " : " + (char)by[i]);
		}catch(Exception e){}
		System.out.println("");
		System.out.println("실행 끝");
		
	}
	
}
