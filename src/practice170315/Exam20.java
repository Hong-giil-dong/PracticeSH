package practice170315;
/*
 * static를 최대한 활용하여 작성 하시오.
 * 은행 처리 프로그램을 작성 하시오.
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
 */

import java.util.Calendar;
import java.util.Scanner;

//static을 최대한 활용하여 작성하시오
//은행처리프로그램
//<입력>
//1.신규가입 2.이율변경 3.등록인원정보 4.종료 

public class Exam20 {
 static double Iyul;
 static Scanner sc=new Scanner(System.in);
 static String name[]=new String[10];
 static int mon[]=new int[10];

 public static void logIn(int cnt){
  System.out.print("이름: ");
  name[cnt]= sc.nextLine();
  System.out.print("입금금액: ");
  mon[cnt]=sc.nextInt();
  
  Calendar cal = Calendar.getInstance();
  System.out.print("신규 가입이" + cal.get(Calendar.YEAR));
  System.out.print("년 " + (cal.get(Calendar.MONTH)+1));
  System.out.print("월 " + cal.get(Calendar.DATE));;
  System.out.print("일 " + cal.get(Calendar.HOUR));
  System.out.print("시 " + cal.get(Calendar.MINUTE));
  System.out.println("분에 처리 되었습니다. ");
  System.out.println("입금한 금액은 "+mon[cnt]+"원 입니다.");
  System.out.println("현재 적용이율은 "+Iyul+"입니다.");
 }
 public static void chanIyul() {
  System.out.print("관리자 패스워드:");
  int pw=1111;
  int pw_in=sc.nextInt();
  if(pw_in==pw){
   System.out.println("현재 "+Iyul+"%의 이율이 적용 되고 있습니다.");
   System.out.print("변경 이율:");
   Iyul=sc.nextDouble();
   System.out.println(+Iyul+"%로 변경 적용 됩니다.");
  }
  else
   System.out.print("비밀번호가 틀렸습니다."); 
 }

 public static void infoMan(int cnt) {
  System.out.println("====현재 등록 고객 정보====");
  for(int i=0;i<cnt;i++){
  System.out.println(name[i]+" "+mon[i]+" "+Iyul);
  }
  System.out.println("=======================");
  
 }
 public static void main(String []ar){
 
 while(true){
  System.out.println("1.신규가입 2.이율변경 3.등록인원정보 4.종료");
  int num=sc.nextInt();
  int cnt=0;
 switch(num){
 case 1:
  logIn(cnt);
  cnt++;
  continue;
 case 2:
  chanIyul();
  continue;
 case 3:
  infoMan(cnt);
  continue;
 case 4:
  break;
 }
 System.exit(-1);
 }
}


} 



