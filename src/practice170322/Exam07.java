package practice170322;



import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Date;

/*
 * Ư�� ���ϸ��� Ű����� �Է��� �޾Ƽ� �ش� ���� �ִ��� Ȯ���ϴ� ���α׷�
 * �� �ۼ� �Ͻÿ�.
 * ��, ��δ� ���������� Ȱ���Ѵ�.
 * 
 */

public class Exam07 {
	public static void main(String[] ar){
		String fileName=null;
		BufferedReader in = new BufferedReader(
							new InputStreamReader(
									System.in));
		File f = new File("c:\\workspace\\java2");
		try{
			System.out.print("���ϸ� : ");
			fileName = in.readLine();
			File f1 = new File(f, fileName);
			if(f1.exists()){
				System.out.println("���ϸ� : " + f1.getName());
				System.out.println("���� ��� : " + f1.getPath());
				System.out.println("���� ��� : " + f1.getParent());
				System.out.println("���� ũ�� : " + f1.length());
				System.out.println("���� ������ : " + new Date(f1.lastModified()));
			}else{
				System.out.println("File Not Found....");
				
			}
			
		}catch(Exception e){}
	}

}
