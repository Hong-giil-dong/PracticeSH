package practice170315;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Vector;

/*
 *���� ó�� ���α׷��� �ۼ� �Ͻÿ�.
 * 
 * <<�Է�>>
 * 1. �ű԰���  2. ��������  3. ����ο�����  4. ���� : 1 
 * ==�ű԰���==
 * �̸� : ����ȣ
 * �Աݱݾ� :1000
 * 
 * �ű� ������ 2017�� 3�� 15�� 20�� 26�п� ó�� �Ǿ����ϴ�.
 * �Ա��� �ݾ��� 1000�� �Դϴ�.
 * ���� ���� ������ 5%�Դϴ�.
 * 
 * 1. �ű԰���  2. ��������  3. ����ο�����  4. ���� : 
 * ������ �н����� : 1111
 * ���� 5%�� ������ ���� �ǰ� �ֽ��ϴ�.
 * ���� ���� : 7
 * 7%�� ���� ���� �˴ϴ�.
 * 
 * 1. �ű԰���  2. ��������  3. ����ο�����  4. ���� : 3
 * ==���� ��� �� ����==
 * �̸�    �ݾ�    ����
 * ====================
 * ����ȣ   1000    7%
 * ������  10000    7%
 * ....
 * ====================
 * 
 *  1. �ű԰���  2. ��������  3. ����ο�����  4. ���� : 4
 *  
 *  ���� ������ ���� �մϴ�.
 *  ���� �ϼ̽��ϴ�.
 * 
 * 
 * 
 */

public class Exam05 {


	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	
	public Exam05() throws IOException{
		System.out.print("1. �ű԰���  2. ��������  3. ����ο�����  4. ���� : ");
		int menuNum;
		menuNum = Integer.parseInt(in.readLine());
		switch(menuNum){
		case 1:
			System.out.print("aaa");
			Customer np = new Customer();
			np.new_person();
			break;
		case 2:
			Bank ic = new Bank();
			ic.int_change();
			break;
		case 3:
			Customer ip = new Customer();
			ip.info_person();
			break;
		case 4:
			System.out.println("���� ������ �����մϴ�.");
			System.out.println("�����ϼ̽��ϴ�.");
			break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}	
	}
}

class Customer {

	int moneyTot[];
	Vector<String> names = new Vector();
	
	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	
	void new_person() throws IOException {
		System.out.print("�̸� : ");
		names.add(in.readLine());
		System.out.print("�Ա� �ݾ� : ");
		moneyTot[(moneyTot.length)+1] = Integer.parseInt(in.readLine());

		Calendar cal = Calendar.getInstance();
		System.out.print("�ű԰����� " + cal.get(Calendar.YEAR) + "�� " + cal.get(Calendar.MONTH) + "�� " + cal.get(Calendar.DATE) + "�� " + cal.get(Calendar.HOUR) + "�� " + cal.get(Calendar.MINUTE) + "�п� ó���Ǿ����ϴ�." );	
	
		System.out.print("�̸� : " + names);		
		System.out.println("�Ա� �ݾ� : " + moneyTot[moneyTot.length]);
	
		Bank bi = new Bank();
		System.out.println(bi.iyul);
	}
	
	void info_person() {
		Bank bi = new Bank();

		System.out.print("==���� ��� �� ����==");
		System.out.print("  �̸� 	   �ݾ�    ����");
		System.out.print("==================");
		
		for(int i=0;i<names.length;i++)
			System.out.print(names[i] + " " + moneyTot[i] + " " + bi.iyul);
		
		System.out.print("==================");
	}
		
}

class Bank {
	double iyul=0.05;
	private final int password = 1111;
	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	
	void int_change() throws IOException {
		int inputNum; 

		System.out.print("������ �н����� : ");
		inputNum = Integer.parseInt(in.readLine());
		if (inputNum!=password){
			return;
		}
		else {
			System.out.println("���� " + iyul + "�� ������ ���� �ǰ� �ֽ��ϴ�.");
			System.out.print("���� ���� : ");
			iyul = Double.parseDouble(in.readLine());//   Iyul=sc.nextDouble();
			System.out.println("������ " + iyul + "�� ���� ���� �˴ϴ�.");			
		}
	}
}
