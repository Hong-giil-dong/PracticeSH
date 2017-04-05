package practice170327;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* 
 * 파일로 불러와서 저장하고 파일로 출력
 * 현재 잘 모르겠는것 
 */



class FileIO {
	
}

class InputInfo {
	Scanner sc = new Scanner(System.in);
	
	static int mNum = 0;
	static int wNum = 0;
	static int mSalTot = 0;
	static int wSalTot = 0;
	String eNum = "미입력";
	String name = "미입력";
	String dept = "미입력";
	String rank = "미입력";
	int eDate = 99999999;
	int birthDate = 11111111;
	String mw = "미입력";
	int baseSal = 3333333;	
	
	void InputInfo() {
		System.out.print("사원번호 입력 : ");
		eNum = sc.nextLine();
		System.out.print("사원이름 입력 : ");
		name = sc.nextLine();
		System.out.print("부서 입력 : ");
		dept = sc.nextLine();
		System.out.print("직위 입력 : ");
		rank = sc.nextLine();
		System.out.print("입사일 입력 : ");
		eDate = Integer.parseInt(sc.nextLine());
		System.out.print("생년월일 입력 : ");
		birthDate = Integer.parseInt(sc.nextLine());
		System.out.print("성별 입력 : ");
		mw = sc.nextLine();
		System.out.print("기본급 입력 : ");
		baseSal = Integer.parseInt(sc.nextLine());
		
			if(mw.equals("남자")) {
				mNum++;
				mSalTot=mSalTot+baseSal;
			}else{
				wNum++;
				wSalTot=wSalTot+baseSal;
			}
				
	}
	
	void DisplayGroup() {
		System.out.println();
		System.out.println("직원 현황표                                   구분\t인원\t기본급합계");
		System.out.println("작성일 : " + "2017년 3월 27일" + "                    남자\t" +    mNum   +  "\t" +mSalTot);		
		System.out.println("                                              여자\t" +     wNum   + "\t" + wSalTot);				
		System.out.println();
	}
	
	void DisplayPersonal(){
		System.out.println(eNum + "\t" + name +  "\t" + dept +  "\t" + rank +  "\t" + eDate +  "\t" + birthDate +  "\t" + mw +  "\t" + baseSal);		
	}
	
	void Calc() { //각 성별 인원계산, 각 성별 기본급 총합, 생년월일 기반으로 한 나이 계산, 입사일을 기반으로 한 근무년,월,일, 연령구분??
		Calendar cal = Calendar.getInstance();

		int age = 100;
		int workDuYear = 9999;
		int workDuMonth = 0; 
		int workDuDay = 0;
		String ageSeparation = "연령구분";
		
		long eDateM = eDate; // 입사일을 밀리세컨드로 바꿈
		long birthDateM = birthDate; // 생일을 밀리세컨드로 바꿈

		Date lifeDuM = new Date(eDate); // 매개변수에 생일을 밀리세컨드로 집어넣으면 지금까지의 살아온 시간을 밀리세컨드로 출력		
		Date workDuM = new Date(birthDate); // 매개변수에 입사일을 밀리세컨드로 집어넣으면 지금까지의 근무시간을 밀리세컨드로 출력
		
		//lifeDu = LifeDuM;//밀리세컨드로 표현되어 있는 '살아온날'을 연으로 로 변환 해야함
		//workDu = WorkDuM;//밀리세컨드로 표현되어 있는 '일해온날'을 연,월,일 로 변환 해야함
		
		System.out.println(cal.get(Calendar.YEAR)); // 현재 연도 출력
		System.out.println(cal.get(Calendar.MONTH)+1); // 현재 달 출력
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 현재 일 출력
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));  // 현재까지 이번연도의 총 일수  
	}
}

public class Work01 {
	public static void main(String[] args) {


		InputInfo ii[] = new InputInfo[20]; // ii 인스턴스 배열 선언
		InputInfo dg = new InputInfo(); 
		
		
		for(int i=0;i<3;i++){
		ii[i] = new InputInfo(); // ii 인스턴스 배열 초기화
		ii[i].InputInfo(); 		// 임의로 입력 받음 -> 사원번호, 성명, 부서, 직위, 입사일, 생년월일, 성별, 기본급
		
		}
		
		
		
		dg.DisplayGroup();
		System.out.println("사원번호\t성명\t부서\t직위\t입사일\t생년월일\t성별\t기본급\t나이\t연령구분\t근무년\t근무월\t근무일");
		for(int i=0;i<3;i++){
			ii[i].DisplayPersonal();
		}
		
		//계산메소드가 들어가야 할곳,  계산 (각 성별 인원계산, 각 성별 기본급 총합, 생년월일 기반으로 한 나이 계산, 입사일을 기반으로 한 근무년,월,일, 연령구분??)
		//데이터를 파일에 입력, 파일 입출력
		
	}
}





















