package practice170322;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ���
 * 1) �ܼ�
 * FileOutputStream fos = new FileOutputStream(FileDecriptor.out);
 * BufferedOutputStream bos = new BufferedOutputStream(fos);
 * DataOutputStream dos = new DataOutputStream(bos);
 * dos.write....
 * 2) ����
 * File file = new File("���ϸ�");
 * FileOutputStream fos = new FileOutputStream(file); 
 * BufferedOutputStream bos = new BufferedOutputStream(fos);
 * DataOutputStream dos = new DataOutputStream(bos);
 * dos.write....
 * 3) ��Ʈ��ũ
 * Socket soc = new Socket
 */
public class Exam08 {
	public static void main(String[] args){
		File f = new File("c:\\workspace\\java\\abc.txt");

		
		try{
			FileInputStream fis = new FileInputStream(f);
			byte[] by = new byte[65536]; // 2�� 16��
			int count = fis.read(by);
			for(int i=0;i<count;i++)
				System.out.println(i + " : " + (char)by[i]);
		}catch(Exception e){}
		/*
		try{
			FileOutputStream fos =  
					new FileOutputStream(FileDescriptor.out);
			FileOutputStream fos1 = 
					new FileOutputStream(f);
			byte[] data = {66,68,70,72,(byte)'!'};
			fos.write(data);
			fos1.write(data);
		}catch(Exception e){}
		*/
		System.out.println("���� ��");
	}
	
}
