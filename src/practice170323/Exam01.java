/*
�ڹ��� �����
- File class
  ���Ͽ� ���� �Է°� ����� ó���ϱ� ���� ���ȴ�.
  Fields
   String pathSeparator - ��� ������ (:)
   char pathSeparatorChar ��ο� ���� ������ char��
   String separator : ���� ��� ������(\)
   char separatorChar
   c:\work\data\abc.txt
- 1Byte I/O
���
1) �ܼ�
	FileOutputStream fos = new FileOutputStream(FileDecriptor.out);
 	BufferedOutputStream bos = new BufferedOutputStream(fos);
  	DataOutputStream dos = new DataOutputStream(bos);
	dos.write....
2) ����
	File file = new File("���ϸ�");
	FileOutputStream fos = new FileOutputStream(file);
 	BufferedOutputStream bos = new BufferedOutputStream(fos);
  	DataOutputStream dos = new DataOutputStream(bos);
	dos.write....
3) ��Ʈ��ũ
	Socket soc = new Socket(...);
	BufferedOutputStream bos = new BufferedOutputStream(soc.getOutputStream());
	DataOutputStream dos = new DataOutputStream(bos);
	dos.write...

�Է�
1) Ű����
	FileInputStream fos = new FileInputStream(FileDecriptor.In);
 	BufferedInputStream bos = new BufferedInputStream(fos);
  	DataInputStream dos = new DataInputStream(bos);
	dos.read....
2) ����
	File file = new File("���ϸ�");
	FileInputStream fos = new FileInputStream(file);
 	BufferedInputStream bos = new BufferedInputStream(fos);
  	DataInputStream dos = new DataInputStream(bos);`																							43
	dos.read....
3) ��Ʈ��ũ
	Socket soc = new Socket(...);
	BufferedInputStream bos = new BufferedInputStream(soc.getInputStream());
	DataInputStream dos = new DataInputStream(bos);
	dos.read...


- Text I/O
- Object I/O


2Byte �Է�
1) �ܼ�
input
*/
/*
�ڹ��� �����
- File class
  ���Ͽ� ���� �Է°� ����� ó���ϱ� ���� ���ȴ�.
  Fields
   String pathSeparator - ��� ������ (:)
   char pathSeparatorChar ��ο� ���� ������ char��
   String separator : ���� ��� ������(\)
   char separatorChar
   c:\work\data\abc.txt
- 1Byte I/O
���
1) �ܼ�
	FileOutputStream fos = new FileOutputStream(FileDecriptor.out);
 	BufferedOutputStream bos = new BufferedOutputStream(fos);
  	DataOutputStream dos = new DataOutputStream(bos);
	dos.write....
2) ����
	File file = new File("���ϸ�");
	FileOutputStream fos = new FileOutputStream(file);
 	BufferedOutputStream bos = new BufferedOutputStream(fos);
  	DataOutputStream dos = new DataOutputStream(bos);
	dos.write....
3) ��Ʈ��ũ
	Socket soc = new Socket(...);
	BufferedOutputStream bos = new BufferedOutputStream(soc.getOutputStream());
	DataOutputStream dos = new DataOutputStream(bos);
	dos.write...

�Է�
1) Ű����
	FileInputStream fos = new FileInputStream(FileDecriptor.In);
 	BufferedInputStream bos = new BufferedInputStream(fos);
  	DataInputStream dos = new DataInputStream(bos);
	dos.read....
2) ����
	File file = new File("���ϸ�");
	FileInputStream fos = new FileInputStream(file);
 	BufferedInputStream bos = new BufferedInputStream(fos);
  	DataInputStream dos = new DataInputStream(bos);`																							43
	dos.read....
3) ��Ʈ��ũ
	Socket soc = new Socket(...);
	BufferedInputStream bos = new BufferedInputStream(soc.getInputStream());
	DataInputStream dos = new DataInputStream(bos);
	dos.read...


- Text I/O
- Object I/O


2Byte �Է�
1) �ܼ�
input
*/
package practice170323;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\workspace\\java");
		File file = new File(f, "java.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		// ȭ�� ��� ����
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw1 = new BufferedWriter(osw);
		PrintWriter pw1 = new PrintWriter(bw1);		
		
		pw.println("���Ϸ� ���");
		pw1.println("ȭ������ ���");
		pw.close();
		pw1.close();
		
	}
}						

