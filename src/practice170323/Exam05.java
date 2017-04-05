package practice170323;
/*
 * 1. ���
 * 1) ���� ���
 *	File file = new File("���ϸ�");
 *  FileOutputStream fos = new FileOutputStream(file);
 *  BufferedOutputStream bos  = new BufferedOutputStream(fos)
 *  ObjectOutputStream oos = new ObjectOutputStream(bos);
 *  oos.writeObject(); 
 *  
 * 2. �Է�
 * ���� �Է�
 * File file = new File("���ϸ�");
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
class Exam05_sub implements Serializable{ // ����ȭ �������̽�
	int x;
	int y;
}

public class Exam05 {
	public static void main(String[] ar) throws IOException{ // ����
		Exam05_sub ex = new Exam05_sub(); // Exam05_sub�� �ν��Ͻ�ȭ �ϰ� �ʱ�ȭ�ؼ� ex ���� �������� ����
		ex.x = 100; // ex�ν��Ͻ��� x�������� 100����
		ex.y = 200; // ex�ν��Ͻ��� y�������� 200����
		
		File dir = new File("c:\\workspace\\java2"); // java2���丮 ����
		File file = new File(dir, "Object.txt"); // object.txt ���� ����
		FileOutputStream fos = new FileOutputStream(file); 
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		ObjectOutputStream oos = new ObjectOutputStream(bos); 
		
		oos.writeObject(ex);
		oos.close();
		
	}

}










