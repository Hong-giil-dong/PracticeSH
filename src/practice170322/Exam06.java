package practice170322;
/*
 * Ư�� ���ϸ��� Ű����� �Է��� �޾Ƽ� �ش� ������ �ִ��� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, ��δ� ������ ���� Ȱ���Ѵ�.
 */
import java.io.File;
import java.util.Scanner;

public class Exam06 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] ar){
		
		File f = new File("C:\\Windows");
		//String[] file = f.list();
		File[] file = f.listFiles();
		
		System.out.println("���ϸ��� �Է��Ͻÿ�");
		String searchFile = sc.nextLine();
		System.out.println(searchFile);
		for(int i=0;i<file.length;i++) {
			if(file[i].getName()==searchFile){
				
				System.out.println("!!!�ش� ������ �ֽ��ϴ�");
				break;
			}
			else{
				System.out.println(file[i]);
				
				// System.out.println("�ش� ������ �����ϴ�");				
			}
		}
		
		System.out.println("�ش� ������ �����ϴ�.");
		
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
