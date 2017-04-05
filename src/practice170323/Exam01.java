/*
자바의 입출력
- File class
  파일에 대한 입력과 출력을 처리하기 위해 사용된다.
  Fields
   String pathSeparator - 경로 구분자 (:)
   char pathSeparatorChar 경로에 대한 구분자 char형
   String separator : 파일 경로 구분자(\)
   char separatorChar
   c:\work\data\abc.txt
- 1Byte I/O
출력
1) 콘솔
	FileOutputStream fos = new FileOutputStream(FileDecriptor.out);
 	BufferedOutputStream bos = new BufferedOutputStream(fos);
  	DataOutputStream dos = new DataOutputStream(bos);
	dos.write....
2) 파일
	File file = new File("파일명");
	FileOutputStream fos = new FileOutputStream(file);
 	BufferedOutputStream bos = new BufferedOutputStream(fos);
  	DataOutputStream dos = new DataOutputStream(bos);
	dos.write....
3) 네트워크
	Socket soc = new Socket(...);
	BufferedOutputStream bos = new BufferedOutputStream(soc.getOutputStream());
	DataOutputStream dos = new DataOutputStream(bos);
	dos.write...

입력
1) 키보드
	FileInputStream fos = new FileInputStream(FileDecriptor.In);
 	BufferedInputStream bos = new BufferedInputStream(fos);
  	DataInputStream dos = new DataInputStream(bos);
	dos.read....
2) 파일
	File file = new File("파일명");
	FileInputStream fos = new FileInputStream(file);
 	BufferedInputStream bos = new BufferedInputStream(fos);
  	DataInputStream dos = new DataInputStream(bos);`																							43
	dos.read....
3) 네트워크
	Socket soc = new Socket(...);
	BufferedInputStream bos = new BufferedInputStream(soc.getInputStream());
	DataInputStream dos = new DataInputStream(bos);
	dos.read...


- Text I/O
- Object I/O


2Byte 입력
1) 콘솔
input
*/
/*
자바의 입출력
- File class
  파일에 대한 입력과 출력을 처리하기 위해 사용된다.
  Fields
   String pathSeparator - 경로 구분자 (:)
   char pathSeparatorChar 경로에 대한 구분자 char형
   String separator : 파일 경로 구분자(\)
   char separatorChar
   c:\work\data\abc.txt
- 1Byte I/O
출력
1) 콘솔
	FileOutputStream fos = new FileOutputStream(FileDecriptor.out);
 	BufferedOutputStream bos = new BufferedOutputStream(fos);
  	DataOutputStream dos = new DataOutputStream(bos);
	dos.write....
2) 파일
	File file = new File("파일명");
	FileOutputStream fos = new FileOutputStream(file);
 	BufferedOutputStream bos = new BufferedOutputStream(fos);
  	DataOutputStream dos = new DataOutputStream(bos);
	dos.write....
3) 네트워크
	Socket soc = new Socket(...);
	BufferedOutputStream bos = new BufferedOutputStream(soc.getOutputStream());
	DataOutputStream dos = new DataOutputStream(bos);
	dos.write...

입력
1) 키보드
	FileInputStream fos = new FileInputStream(FileDecriptor.In);
 	BufferedInputStream bos = new BufferedInputStream(fos);
  	DataInputStream dos = new DataInputStream(bos);
	dos.read....
2) 파일
	File file = new File("파일명");
	FileInputStream fos = new FileInputStream(file);
 	BufferedInputStream bos = new BufferedInputStream(fos);
  	DataInputStream dos = new DataInputStream(bos);`																							43
	dos.read....
3) 네트워크
	Socket soc = new Socket(...);
	BufferedInputStream bos = new BufferedInputStream(soc.getInputStream());
	DataInputStream dos = new DataInputStream(bos);
	dos.read...


- Text I/O
- Object I/O


2Byte 입력
1) 콘솔
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
		
		// 화면 출력 설정
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw1 = new BufferedWriter(osw);
		PrintWriter pw1 = new PrintWriter(bw1);		
		
		pw.println("파일로 출력");
		pw1.println("화면으로 출력");
		pw.close();
		pw1.close();
		
	}
}						

