package practice170322;
import java.io.*;

public class Exam04 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java2");
		//String[] file = f.list();
		File[] file = f.listFiles();
		
		for(int i=0;i<file[i].length;i++){
			if(file[i].getName().endsWith("java")){		//확장자가 자바이면
				System.out.println(file[i].getName());	//파일이름을 출력
			}
	

		}
	}

}


// 윈도우 폴더의 exe 파일만 리스트를 출력