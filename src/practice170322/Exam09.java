package practice170322;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
 * Ű����� 1����Ʈ�� ������ �Է� �޾Ƽ� ���Ͽ� �����Ͻÿ�.
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
		System.out.println("������");	
		
		try{
			FileInputStream fis = new FileInputStream(f);
			byte[] by = new byte[65536]; // 2�� 16��
			int count = fis.read(by);
			for(int i=0;i<count;i++)
				System.out.print((char)by[i]);
			//	System.out.println(i + " : " + (char)by[i]);
		}catch(Exception e){}
		System.out.println("");
		System.out.println("���� ��");
		
	}
	
}
