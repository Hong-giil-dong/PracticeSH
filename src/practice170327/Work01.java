package practice170327;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* 
 * ���Ϸ� �ҷ��ͼ� �����ϰ� ���Ϸ� ���
 * ���� �� �𸣰ڴ°� 
 */



class FileIO {
	
}

class InputInfo {
	Scanner sc = new Scanner(System.in);
	
	static int mNum = 0;
	static int wNum = 0;
	static int mSalTot = 0;
	static int wSalTot = 0;
	String eNum = "���Է�";
	String name = "���Է�";
	String dept = "���Է�";
	String rank = "���Է�";
	int eDate = 99999999;
	int birthDate = 11111111;
	String mw = "���Է�";
	int baseSal = 3333333;	
	
	void InputInfo() {
		System.out.print("�����ȣ �Է� : ");
		eNum = sc.nextLine();
		System.out.print("����̸� �Է� : ");
		name = sc.nextLine();
		System.out.print("�μ� �Է� : ");
		dept = sc.nextLine();
		System.out.print("���� �Է� : ");
		rank = sc.nextLine();
		System.out.print("�Ի��� �Է� : ");
		eDate = Integer.parseInt(sc.nextLine());
		System.out.print("������� �Է� : ");
		birthDate = Integer.parseInt(sc.nextLine());
		System.out.print("���� �Է� : ");
		mw = sc.nextLine();
		System.out.print("�⺻�� �Է� : ");
		baseSal = Integer.parseInt(sc.nextLine());
		
			if(mw.equals("����")) {
				mNum++;
				mSalTot=mSalTot+baseSal;
			}else{
				wNum++;
				wSalTot=wSalTot+baseSal;
			}
				
	}
	
	void DisplayGroup() {
		System.out.println();
		System.out.println("���� ��Ȳǥ                                   ����\t�ο�\t�⺻���հ�");
		System.out.println("�ۼ��� : " + "2017�� 3�� 27��" + "                    ����\t" +    mNum   +  "\t" +mSalTot);		
		System.out.println("                                              ����\t" +     wNum   + "\t" + wSalTot);				
		System.out.println();
	}
	
	void DisplayPersonal(){
		System.out.println(eNum + "\t" + name +  "\t" + dept +  "\t" + rank +  "\t" + eDate +  "\t" + birthDate +  "\t" + mw +  "\t" + baseSal);		
	}
	
	void Calc() { //�� ���� �ο����, �� ���� �⺻�� ����, ������� ������� �� ���� ���, �Ի����� ������� �� �ٹ���,��,��, ���ɱ���??
		Calendar cal = Calendar.getInstance();

		int age = 100;
		int workDuYear = 9999;
		int workDuMonth = 0; 
		int workDuDay = 0;
		String ageSeparation = "���ɱ���";
		
		long eDateM = eDate; // �Ի����� �и�������� �ٲ�
		long birthDateM = birthDate; // ������ �и�������� �ٲ�

		Date lifeDuM = new Date(eDate); // �Ű������� ������ �и�������� ��������� ���ݱ����� ��ƿ� �ð��� �и�������� ���		
		Date workDuM = new Date(birthDate); // �Ű������� �Ի����� �и�������� ��������� ���ݱ����� �ٹ��ð��� �и�������� ���
		
		//lifeDu = LifeDuM;//�и�������� ǥ���Ǿ� �ִ� '��ƿ³�'�� ������ �� ��ȯ �ؾ���
		//workDu = WorkDuM;//�и�������� ǥ���Ǿ� �ִ� '���ؿ³�'�� ��,��,�� �� ��ȯ �ؾ���
		
		System.out.println(cal.get(Calendar.YEAR)); // ���� ���� ���
		System.out.println(cal.get(Calendar.MONTH)+1); // ���� �� ���
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // ���� �� ���
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));  // ������� �̹������� �� �ϼ�  
	}
}

public class Work01 {
	public static void main(String[] args) {


		InputInfo ii[] = new InputInfo[20]; // ii �ν��Ͻ� �迭 ����
		InputInfo dg = new InputInfo(); 
		
		
		for(int i=0;i<3;i++){
		ii[i] = new InputInfo(); // ii �ν��Ͻ� �迭 �ʱ�ȭ
		ii[i].InputInfo(); 		// ���Ƿ� �Է� ���� -> �����ȣ, ����, �μ�, ����, �Ի���, �������, ����, �⺻��
		
		}
		
		
		
		dg.DisplayGroup();
		System.out.println("�����ȣ\t����\t�μ�\t����\t�Ի���\t�������\t����\t�⺻��\t����\t���ɱ���\t�ٹ���\t�ٹ���\t�ٹ���");
		for(int i=0;i<3;i++){
			ii[i].DisplayPersonal();
		}
		
		//���޼ҵ尡 ���� �Ұ�,  ��� (�� ���� �ο����, �� ���� �⺻�� ����, ������� ������� �� ���� ���, �Ի����� ������� �� �ٹ���,��,��, ���ɱ���??)
		//�����͸� ���Ͽ� �Է�, ���� �����
		
	}
}





















