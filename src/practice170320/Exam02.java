package practice170320;
import java.util.Scanner;

// ��å ����  : ��� �븮 ���� ���� ����
//�Է� : �̸�, ���, �μ�, ��å, ȣ��
//���(��ȸ) : ���, �̸�, �μ�, ��å, ȣ��, �⺻��(ȣ���� ���� ����), ����(��å�� ���� ����), ���ɾ�(�⺻��+����) 
// Ŭ������ �������� �����°� ����� ��� �������� ����� �迭ó�� �κ���?

public class Exam02 {

	public static void main(String[] args) {
		Salary[] s = new Salary[3]; // �ν��Ͻ� ��ü �迭�� �� �ּҸ��� �ʱ�ȭ�� ��������Ѵ�
		s[0] = new Salary();
		s[1] = new Salary();
		s[2] = new Salary();
		for(int i=0;i<3;i++) {
		s[i].calc();
		}
		System.out.println("���\t�̸�\t�μ�\t��å\tȣ��\t�⺻��\t����\t���ɾ�");			
		for(int i=0;i<3;i++) {
		s[i].display();
		}
	}
}

class InputInfo {
	private static Scanner sc = new Scanner(System.in);
	private String name;
	private int comNum;
	private String department;
	protected String duty;
	protected int salaryClass;
	
	protected InputInfo() {
		System.out.print("�̸� : ");
		name=sc.nextLine();
		System.out.print("��� : ");
		comNum=Integer.parseInt(sc.nextLine());
		System.out.print("�μ� : ");
		department=sc.nextLine();
		System.out.print("��å : ");
		duty=sc.nextLine();
		System.out.print("ȣ�� : ");
		salaryClass=Integer.parseInt(sc.nextLine());
	}
	
	protected void display() {
		System.out.print(comNum + "\t" + name + "\t" + department + "\t" + duty + "\t" + salaryClass + "ȣ��");
	}
}

class Salary extends InputInfo {
	protected int basicPay;
	protected int allowance;
	protected int totalPay;
	
	protected Salary() {
	super();
	basicPay = 0;
	allowance = 0;
	totalPay = 0;
	}
	
	protected void calc() {
		basicPay = 150+(salaryClass*15);
		
		switch(duty) {
		case "�븮" : allowance = 100; break;
		case "����" : allowance = 150; break;
		case "����" : allowance = 200; break;
		case "����" : allowance = 250; break;
		default :  allowance = 50; break;
		}
		
		totalPay = basicPay + allowance;
	}
	
	protected void display() {
		super.display();
		System.out.println("\t" + basicPay + "����\t" + allowance + "����\t" + totalPay + "����");
	}
}

