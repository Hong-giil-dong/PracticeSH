package practice170315;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Vector;

/*
 *은행 처리 프로그램을 작성 하시오.
 * 
 * <<입력>>
 * 1. 신규가입  2. 이율변경  3. 등록인원정보  4. 종료 : 1 
 * ==신규가입==
 * 이름 : 전용호
 * 입금금액 :1000
 * 
 * 신규 가입이 2017년 3월 15일 20시 26분에 처리 되었습니다.
 * 입금한 금액은 1000원 입니다.
 * 현재 적용 이율은 5%입니다.
 * 
 * 1. 신규가입  2. 이율변경  3. 등록인원정보  4. 종료 : 
 * 관리자 패스워드 : 1111
 * 현재 5%의 이율이 적용 되고 있습니다.
 * 변경 이율 : 7
 * 7%로 변경 적용 됩니다.
 * 
 * 1. 신규가입  2. 이율변경  3. 등록인원정보  4. 종료 : 3
 * ==현재 등록 고객 정보==
 * 이름    금액    이율
 * ====================
 * 전용호   1000    7%
 * 전선구  10000    7%
 * ....
 * ====================
 * 
 *  1. 신규가입  2. 이율변경  3. 등록인원정보  4. 종료 : 4
 *  
 *  은행 영업을 마감 합니다.
 *  수고 하셨습니다.
 * 
 * 
 * 
 */

public class Exam05 {


	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	
	public Exam05() throws IOException{
		System.out.print("1. 신규가입  2. 이율변경  3. 등록인원정보  4. 종료 : ");
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
			System.out.println("은행 영업을 마감합니다.");
			System.out.println("수고하셨습니다.");
			break;
		default: System.out.println("잘못 입력하셨습니다");
		}	
	}
}

class Customer {

	int moneyTot[];
	Vector<String> names = new Vector();
	
	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	
	void new_person() throws IOException {
		System.out.print("이름 : ");
		names.add(in.readLine());
		System.out.print("입금 금액 : ");
		moneyTot[(moneyTot.length)+1] = Integer.parseInt(in.readLine());

		Calendar cal = Calendar.getInstance();
		System.out.print("신규가입이 " + cal.get(Calendar.YEAR) + "년 " + cal.get(Calendar.MONTH) + "월 " + cal.get(Calendar.DATE) + "일 " + cal.get(Calendar.HOUR) + "시 " + cal.get(Calendar.MINUTE) + "분에 처리되었습니다." );	
	
		System.out.print("이름 : " + names);		
		System.out.println("입금 금액 : " + moneyTot[moneyTot.length]);
	
		Bank bi = new Bank();
		System.out.println(bi.iyul);
	}
	
	void info_person() {
		Bank bi = new Bank();

		System.out.print("==현재 등록 고객 정보==");
		System.out.print("  이름 	   금액    이율");
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

		System.out.print("관리자 패스워드 : ");
		inputNum = Integer.parseInt(in.readLine());
		if (inputNum!=password){
			return;
		}
		else {
			System.out.println("현재 " + iyul + "의 이율이 적용 되고 있습니다.");
			System.out.print("변경 이율 : ");
			iyul = Double.parseDouble(in.readLine());//   Iyul=sc.nextDouble();
			System.out.println("이율이 " + iyul + "로 변경 적용 됩니다.");			
		}
	}
}
