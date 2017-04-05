package practice170322;
// �ڹ��� �����
// file class 
// ���Ͽ� ���� �Է°� ����� ó���ϱ� ���� ���ȴ�.
// fields
// String pathSeparator - ��� ������ (:)
// char pathSeparatorChar : ��ο� ���� ������ char ��
// String separator : ���� ��� ������(\)
// char separatorChar : 
// c:\work\data\abc.txt
// 1byte i/o (1����Ʈ ������̹Ƿ� �ѱ��� �ȵ�)
// text i/o
// object i/o
/*
import java.io.File;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) {
		File f = new File("c:\\work\\java");
		if(f.exists())
			f.delete();
		
		//���� ó��
		try{
			//�� ó�� ���� �Է�
			Thread.sleep(3000);
		}catch(Exception e) {
			//���� ��Ȳ ó��
			e.printStackTrace();
			
		}System.out.println("����");
	}
}
*/

import java.io.File;

public class Exam01 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java"); //�Ű������� ���� ��η� �ϴ� file�޼ҵ��� �ν��Ͻ��� �����ؼ� �������� f���� �����ϰ� �ʱ�ȭ
		if(f.exists()){	// f �ν��Ͻ��� exists�޼ҵ带 ������ ��ȯ���� true �̸� �Ʒ� ���� ����
			System.out.println("��� ����"); // ��� ���縦 ���
			f.delete(); //f �ν��Ͻ��� delete �޼ҵ带 ����
		}
		//���� ó��
		try{ // try 
			//�� ó�� ���� �Է�
			Thread.sleep(3000); // ������ Ŭ������ sleep �޼ҵ带 3000 �Ű����� ������ ����
			
		}catch(Exception e){ // ?
			//���� ��Ȳ ó��
			e.printStackTrace(); // ?
		}
		
		System.out.println("����"); // ����ó�� ������ ������ ���
		File f1 = new File(f, "abc.txt"); // f���������� abc.txt�� �Ű������� �ϴ� ���ο� ���� �ν��Ͻ��� �����ؼ� �ʱ�ȭ�ϰ� f1���������� ��Ī
		
		try{ // 
			Thread.sleep(3000);
		}catch(Exception e){ // ���ܻ��� ó�� �ϴ� ��
			
		}
		
		if(!f.exists()){ // f�ν��Ͻ��� exists �޼ҵ��� ���� ���� True �ϰ�� �Ʒ� ���� 
			System.out.println("��� ����"); // ��� ���� ���ڿ��� ���
			f.mkdir(); // f �ν��Ͻ��� mkdir �޼ҵ带 ����
		}
		
		try{ // ? 
			System.out.println("���� ������...."); // ���� �������� ���
			f1.createNewFile(); // ���� �Ӽ��� �б� / ���� ����
			Thread.sleep(3000); // ������ Ŭ������ sleep�޼ҵ带 3000 �Ű������� ����
			System.out.println("���� ���� ����"); // ���� ���� ���� ���
		}catch(Exception e){ // ����ó�� Ŭ������  �������� e���� ����
			e.printStackTrace(); // exception�� �ν��Ͻ��� printStackTrace �޼ҵ带 ����
		}finally{ // ?
			if(f1.canRead()) // f1 �ν��Ͻ��� 
				f1.setWritable(false);
		}
		
		File f2 = new File("c:\\workspace\\java\\abc.txt");
		System.out.println("���ϸ� : " + f2.getName());
		System.out.println("���� ��� : " + f2.getPath());
		System.out.println("���� ��� : " + f2.getParent());
		System.out.println("���� ũ�� : " + f2.length());
		//System.out.println("���� �ۼ��� : " + new java.util.Date(f.lastModifield()));
		
		File abc = new File("c:\\workspace\\java\\abc.txt");
		if(abc.exists()){
			System.out.println("���� ����");
			abc.delete();
		}
		
			
	}

}

//���� ������ �����
























