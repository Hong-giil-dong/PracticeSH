package practice170322;



import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Date;

/*
 * 특정 파일명을 키보드로 입력을 받아서 해당 파일 있는지 확인하는 프로그램
 * 을 작성 하시오.
 * 단, 경로는 정해진곳을 활용한다.
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
			System.out.print("파일명 : ");
			fileName = in.readLine();
			File f1 = new File(f, fileName);
			if(f1.exists()){
				System.out.println("파일명 : " + f1.getName());
				System.out.println("파일 경로 : " + f1.getPath());
				System.out.println("파일 경로 : " + f1.getParent());
				System.out.println("파일 크기 : " + f1.length());
				System.out.println("최종 수정일 : " + new Date(f1.lastModified()));
			}else{
				System.out.println("File Not Found....");
				
			}
			
		}catch(Exception e){}
	}

}
