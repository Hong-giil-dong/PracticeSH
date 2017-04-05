package practice170322;
import java.io.*;
public class Exam02 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java\\abc.txt");
		if(f.exists()){
			
			System.out.println("파일명 : " + f.getName());
			System.out.println("파일 경로 : " + f.getPath());
			System.out.println("파일 경로 : " + f.getParent());
			System.out.println("파일 크기 : " + f.length());
		}else{
			System.out.print(f.getName()+"이라는 파일이 없어 ");
			System.out.println("파일을 생성 합니다....");
			try{
				f.createNewFile();
			}catch(Exception e){}
		}
	}

}
