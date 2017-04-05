package practice170320;
import java.util.Scanner;

// 직책 조건  : 사원 대리 과장 차장 부장
//입력 : 이름, 사번, 부서, 직책, 호봉
//출력(조회) : 사번, 이름, 부서, 직책, 호봉, 기본급(호봉에 영향 받음), 수당(직책에 따른 영향), 수령액(기본급+수당) 
// 클래스를 여러개로 나누는게 어려울 경우 한통으로 만들고 배열처리 부분을?

public class Exam02 {

	public static void main(String[] args) {
		Salary[] s = new Salary[3]; // 인스턴스 객체 배열은 각 주소마다 초기화를 시켜줘야한다
		s[0] = new Salary();
		s[1] = new Salary();
		s[2] = new Salary();
		for(int i=0;i<3;i++) {
		s[i].calc();
		}
		System.out.println("사번\t이름\t부서\t직책\t호봉\t기본급\t수당\t수령액");			
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
		System.out.print("이름 : ");
		name=sc.nextLine();
		System.out.print("사번 : ");
		comNum=Integer.parseInt(sc.nextLine());
		System.out.print("부서 : ");
		department=sc.nextLine();
		System.out.print("직책 : ");
		duty=sc.nextLine();
		System.out.print("호봉 : ");
		salaryClass=Integer.parseInt(sc.nextLine());
	}
	
	protected void display() {
		System.out.print(comNum + "\t" + name + "\t" + department + "\t" + duty + "\t" + salaryClass + "호봉");
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
		case "대리" : allowance = 100; break;
		case "과장" : allowance = 150; break;
		case "차장" : allowance = 200; break;
		case "부장" : allowance = 250; break;
		default :  allowance = 50; break;
		}
		
		totalPay = basicPay + allowance;
	}
	
	protected void display() {
		super.display();
		System.out.println("\t" + basicPay + "만원\t" + allowance + "만원\t" + totalPay + "만원");
	}
}

