package practice170322;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * Ű����� 1����Ʈ�� ������ �Է� �޾Ƽ� ���Ͽ� ���� �Ͻÿ�.
 * ���ڿ��� ���� �ϳ��ϳ��� ����Ʈ�� �ٲٴ� ���� �ٽ��̴�.
 */
public class Exam10 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java\\abc.txt");
		// �Ű����� ()�� ������ FileŬ������ �ν��Ͻ��� �����ؼ� �ʱ�ȭ�� fileŸ���� ���� f�� �������� ����
		try{
			FileInputStream fis = new FileInputStream(FileDescriptor.in);
			// �Ű����� filedes)�� ������  fileinputstream Ŭ������ �ν��Ͻ��� �����ؼ� �ʱ�ȭ�� ���� Ÿ���� ���� fis�� ����
			BufferedInputStream bis = new BufferedInputStream(fis);
			// �Ű����� (fis�ν��Ͻ�)�� ������  BufferedInputStream Ŭ������ �ν��Ͻ��� �����ؼ� �ʱ�ȭ�� ���� Ÿ���� ���� bis�� ����
			DataInputStream dis = new DataInputStream(bis);
			// �Ű����� (bis�ν��Ͻ�)�� ������  DataInputStream Ŭ������ �ν��Ͻ��� �����ؼ� �ʱ�ȭ�� ���� Ÿ���� ���� dis�� ����
			byte[] by = new byte[65536]; // by�� �迭 ����
			int i=0;
			//byte[] buffer = new byte[1024];
			//int readcount = 0;
			
			try{
				FileOutputStream fos = 
						new FileOutputStream(FileDescriptor.out);
				FileOutputStream fos1 = 
						new FileOutputStream(f);
				byte[] data = {66,68,70,72,(byte)'!'};
				fos.write(data);
				fos1.write(data);
			}catch(Exception e){}
			System.out.println("���� ��!!!");
			
			do{ // �ϴ� �Ʒ��� ���� ����
				System.out.print("�Է�(Q:����) : "); // ���
				data[i] = dis.readByte(); // ����ƮŸ���� by�ν��Ͻ��迭�� dis�ν��Ͻ��� readbyte�޼ҵ带  ����
				dis.readByte(); // dis.readByte�޼ҵ带 �ι� ����
				dis.readByte();
				
				if(by[i] == (byte)'Q'){ // by�ν��Ͻ��� ���� Q�� byte�� ����ȯ �� ���� ���� �� true
					break;
				}
				i++;
			}while(true);
			
			FileOutputStream fos1 = 
					new FileOutputStream(f);
			for(int j=0;j<i;j++){
				fos1.write(by[j]);
				System.out.println(by[j]);
			}
			
		
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
		System.out.println("���� ��!!!");
		*/
	}
}
