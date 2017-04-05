package practice170322;
/*
 * 특정 파일명을 키보드로 입력을 받아서 해당 파일이 있는지 확인하는 프로그램을 작성하시오.
 * 단, 경로는 정해진 곳을 활용한다.
 */
import java.io.File;
import java.util.Scanner;

public class Exam06 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] ar){
		
		File f = new File("C:\\Windows");
		//String[] file = f.list();
		File[] file = f.listFiles();
		
		System.out.println("파일명을 입력하시오");
		String searchFile = sc.nextLine();
		System.out.println(searchFile);
		for(int i=0;i<file.length;i++) {
			if(file[i].getName()==searchFile){
				
				System.out.println("!!!해당 파일이 있습니다");
				break;
			}
			else{
				System.out.println(file[i]);
				
				// System.out.println("해당 파일이 없습니다");				
			}
		}
		
		System.out.println("해당 파일이 없습니다.");
		
		//PFRO.txt\
		/*
		for(int i=0;i<file.length;i++){
			if(file[i].getName().endsWith("exe")){
				System.out.println(file[i].getName());
			}
		}
		*/
		
	}

}
