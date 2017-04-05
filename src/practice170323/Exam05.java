package practice170323;
/*
 * 1. 출력
 * 1) 파일 출력
 *	File file = new File("파일명");
 *  FileOutputStream fos = new FileOutputStream(file);
 *  BufferedOutputStream bos  = new BufferedOutputStream(fos)
 *  ObjectOutputStream oos = new ObjectOutputStream(bos);
 *  oos.writeObject(); 
 *  
 * 2. 입력
 * 파일 입력
 * File file = new File("파일명");
 * FileInputStream fis = new FileInputStream(file);
 * BufferedInputStream bis = new BufferedInputStream(fis);
 * ObjectInputStream oos = new ObjectInputStream(bis);
 * try{
 * 		Object 
 */
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Exam05_sub implements Serializable{ // 직렬화 인터페이스
	int x;
	int y;
}

public class Exam05 {
	public static void main(String[] ar) throws IOException{ // 실행
		Exam05_sub ex = new Exam05_sub(); // Exam05_sub를 인스턴스화 하고 초기화해서 ex 값에 참조변수 저장
		ex.x = 100; // ex인스턴스의 x변수값을 100으로
		ex.y = 200; // ex인스턴스의 y변수값을 200으로
		
		File dir = new File("c:\\workspace\\java2"); // java2디렉토리 생성
		File file = new File(dir, "Object.txt"); // object.txt 파일 생성
		FileOutputStream fos = new FileOutputStream(file); 
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		ObjectOutputStream oos = new ObjectOutputStream(bos); 
		
		oos.writeObject(ex);
		oos.close();
		
	}

}










