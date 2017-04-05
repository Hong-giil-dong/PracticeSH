package practice170331;
import java.io.*;
import java.util.*;
public class Exam01 {

	public static void main(String[] args) throws Exception{
		File dir = new File("c:\\workspace\\java2");
		File file = new File(dir, "Address.txt");
		Vector vc = new Vector(); //���� Ÿ�� vc���� �� �ʱ�ȭ
		if(file.exists()){ //������ ������ ���? �Ʒ� ����
			ObjectInputStream ois = new ObjectInputStream( // ��ü�Է� ��Ʈ�� �ν��Ͻ� �����ؼ� �ű⿡ �Ʒ� ���� �������?
					new BufferedInputStream( //���ۿ� ���� �ְ�
							new FileInputStream(file)));// ���Ͽ� �ִ� ������ �ҷ��ͼ�
			// ���������? ois�� �̹� ����Ǿ�? �ִ� ���� ������ ���?
			vc = (Vector)ois.readObject(); //ois�� �ִ� ������ �о�鿩�ͼ�? vector�� ����ȯ �� vc�� ����
			ois.close();//vc������ �ʿ��� ������ ���� ���������Ƿ� ��Ʈ�� ����
		}
		Scanner sc = new Scanner(System.in); //��ĳ�� Ŭ���� �ҷ��ͼ� �ʱ�ȭ
		while(true){
			System.out.print("1. �Է�  2. ��ȸ  3. ���� :");
			int choose = Integer.parseInt(sc.nextLine());
			if(choose==1){
				Exam01 ae = new Exam01(); // Exam08�ν��Ͻ� ����
				vc.add(ae); // vc�� �Էµ� ���� �߰�������
				System.out.println(".");
			}else if(choose == 2){
				System.out.println("�̸�\t��ȭ\t�ּ�");
				for(int i=0;i<vc.size();i++){ // ����vc�� ũ�⸸ŭ ����
					Exam01 imsi = (Exam01)vc.elementAt(i); //����vc�� �����? �����͸� i�� �ε����� �̿��ؼ� �ҷ��� ���� ������.
					// �׸��� Exam08�� ����ȯ �ؼ� ����
					imsi.disp(); //imsi �ν��Ͻ��� �޼ҵ带 ����
				}
			}else if(choose == 3){
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)));
				oos.writeObject(vc);
				oos.close();
				System.exit(0);
			}
		}

	}

	private void disp() {
		// TODO Auto-generated method stub
		
	}

}
