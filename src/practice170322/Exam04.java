package practice170322;
import java.io.*;

public class Exam04 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java2");
		//String[] file = f.list();
		File[] file = f.listFiles();
		
		for(int i=0;i<file[i].length;i++){
			if(file[i].getName().endsWith("java")){		//Ȯ���ڰ� �ڹ��̸�
				System.out.println(file[i].getName());	//�����̸��� ���
			}
	

		}
	}

}


// ������ ������ exe ���ϸ� ����Ʈ�� ���