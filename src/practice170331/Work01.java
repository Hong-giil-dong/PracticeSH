package practice170331;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;


class FileIO {
	FileIO() throws Exception {
		
		File dir = new File("c:\\workspace\\java2");
		File file = new File(dir, "Address.txt");
		file.createNewFile();
		Vector vc = new Vector();
		
		try {
			if(file.exists()){
				ObjectInputStream ois = new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(file)));
				vc = (Vector)ois.readObject();
				ois.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class InputInfo {
	Scanner sc = new Scanner(System.in);

	static int mNum = 0;
	static int wNum = 0;
	static int mSalTot = 0;
	static int wSalTot = 0;
	String eNum = "?Ç¨Î≤?";
	String name = "?ù¥Î¶?";
	String dept = "Î∂??Ñú";
	String rank = "ÏßÅÍ∏â";
	int eDate = 99999999;
	int birthDate = 11111111;
	String mw = "?Ñ±Î≥?";
	int baseSal = 3333333;	

	void InputInfo() {
		System.out.print("?Ç¨Î≤? : ");
		eNum = sc.nextLine();
		System.out.print("?ù¥Î¶? : ");
		name = sc.nextLine();
		System.out.print("Î∂??Ñú : ");
		dept = sc.nextLine();
		System.out.print("ÏßÅÍ∏â : ");
		rank = sc.nextLine();
		System.out.print("?ûÖ?Ç¨?ó∞?èÑ : ");
		eDate = Integer.parseInt(sc.nextLine());
		System.out.print("?Éù?ùº : ");
		birthDate = Integer.parseInt(sc.nextLine());
		System.out.print("?Ñ±Î≥? : ");
		mw = sc.nextLine();
		System.out.print("Í∏∞Î≥∏Í∏? : ");
		baseSal = Integer.parseInt(sc.nextLine());
		System.out.println();
		if(mw.equals("?Ç®?ûê")) {
			mNum++;
			mSalTot=mSalTot+baseSal;
		}else{
			wNum++;
			wSalTot=wSalTot+baseSal;
		}

	}

	void DisplayGroup() {
		System.out.println();
		System.out.println("Î≥¥Í≥†?Ñú                                                  ?Ñ±Î≥?\t?à´?ûê\tÍ∏∞Î≥∏Í∏âÌï©Í≥?");
		System.out.println("?ûë?Ñ±?ùº : " + "2017?ÖÑ 3?õî 27?ùº" + "                    ?Ç®?ûê\t" +    mNum   +  "\t" +mSalTot);		
		System.out.println("                                                           ?ó¨?ûê\t" +     wNum   + "\t" + wSalTot);				
		System.out.println();
	}

	void DisplayPersonal(){
		System.out.println(eNum + "\t" + name +  "\t" + dept +  "\t" + rank +  "\t" + eDate +  "\t" + birthDate +  "\t" + mw +  "\t" + baseSal);		
	}

	void Calc() { 
		Calendar cal = Calendar.getInstance();

		int age = 100;
		int workDuYear = 9999;
		int workDuMonth = 0; 
		int workDuDay = 0;
		String ageSeparation = "?Çò?ù¥Íµ¨Î∂Ñ";

		long eDateM = eDate; 
		long birthDateM = birthDate; 

		Date lifeDuM = new Date(eDate); 
		Date workDuM = new Date(birthDate); 

		//lifeDu = LifeDuM;
		//workDu = WorkDuM;

		System.out.println(cal.get(Calendar.YEAR)); 
		System.out.println(cal.get(Calendar.MONTH)+1); 
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));  
	}
}

public class Work01 {
	public static void main(String[] args) throws Exception {
		FileIO fio = new FileIO();
		InputInfo ii[] = new InputInfo[20]; 
		InputInfo dg = new InputInfo(); 

		for(int i=0;i<3;i++){
			ii[i] = new InputInfo(); 
			ii[i].InputInfo(); 		

		}

		dg.DisplayGroup();
		System.out.println("Îß? ?úóÏ§?~~~~");
		for(int i=0;i<3;i++){
			ii[i].DisplayPersonal();
		}
	}
}






























