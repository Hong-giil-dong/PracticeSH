package practice170323;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * ������ ������� �̿��Ͽ� �ּҷ� ���α׷��� �ϼ��Ͻÿ�.
 * 1. �Է�  2. ��ȸ  3. ���� : 
 * 1.
 * �̸� :
 * ��ȭ :
 * �ּ� :
 * 2.
 * ������ ��ü ���� ���
 * ��, ��ü�� Ȱ���Ͽ� �ۼ� �Ͻÿ�.
 */
public class Exam04 {
	
	
	public static void main(String[] ar){
		String data="";
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		try{
			
			PrintWriter out=null;
			/*= new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(
					  new File(
					  new File("c:\\workspace\\java"),"address.txt"))));
			*/
			
			BufferedReader in=new BufferedReader(
					new FileReader( 
					new File(
					new File("c:\\workspace\\java"),"address.txt")));
				
			
			
			do{
				System.out.print("1. �Է�  2. ��ȸ  3. ���� : ");
				int choose = Integer.parseInt(sc.nextLine());
				switch(choose){
				case 1:
					out = new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(
					  new File(
					  new File("c:\\workspace\\java"),"address.txt"))));
					System.out.print("�̸� : ");
					String name = sc.nextLine();
					System.out.print("��ȭ : ");
					String tel = sc.nextLine();
					System.out.print("�ּ� : ");
					String addr = sc.nextLine();
					 
					out.println(name+","+tel+","+addr);
					out.close();
					
					FileOutputStream fos = new FileOutputStream(out);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					ObjectOutputStream oos = new ObjectOutputStream(bos);
					
					oos.writeObject(out);
					oos.close();
					
					break;
				case 2:// ���� ���߿� ����� �͸� ��ϵ� 
					
					while((data = in.readLine()) != null){ // data ���� ���� ������ ���� �Ʒ��� ����
						int first = data.indexOf(','); // 
						int last = data.lastIndexOf(','); //
						cnt++; //�ݺ����� ���� �ɶ����� cnt ���� 1�� ����
						System.out.println("���� : " + cnt);
						System.out.println("�̸� = " + data.substring(0, first));
						System.out.println("��ȭ = " + data.substring(first+1, last));
						System.out.println("�ּ� = " + data.substring(last+1, data.length()));
						System.out.println("\n\n");			
											
					}
					
					break;
				case 3:
					System.out.println("�۾� ����");
					
					in.close();
					System.exit(0);
				}
			}while(true);
			
		}catch(Exception e){
			
		}
	}
}
