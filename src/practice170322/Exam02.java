package practice170322;
import java.io.*;
public class Exam02 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java\\abc.txt");
		if(f.exists()){
			
			System.out.println("���ϸ� : " + f.getName());
			System.out.println("���� ��� : " + f.getPath());
			System.out.println("���� ��� : " + f.getParent());
			System.out.println("���� ũ�� : " + f.length());
		}else{
			System.out.print(f.getName()+"�̶�� ������ ���� ");
			System.out.println("������ ���� �մϴ�....");
			try{
				f.createNewFile();
			}catch(Exception e){}
		}
	}

}
