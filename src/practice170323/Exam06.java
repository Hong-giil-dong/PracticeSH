package practice170323;
import java.io.*;
public class Exam06 {
	public static void main(String[] ar) throws IOException{
		File dir = new File("c:\\workspace\\java2"); //����
		File file = new File(dir, "Object.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = null;
		try{
			obj = ois.readObject();
		}catch(Exception e){}
		ois.close();
		Exam05_sub ex = (Exam05_sub)obj;
		//Object��  ���� ���°� Exam04_sub�� ���̹Ƿ� ���� ����ȯ
		System.out.println("X = " + ex.x);
		System.out.println("Y = " + ex.y);
		
	}

}