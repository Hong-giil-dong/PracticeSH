package practice170315;
/*
 * static�� �ִ��� Ȱ���Ͽ� �ۼ� �Ͻÿ�.
 * ���� ó�� ���α׷��� �ۼ� �Ͻÿ�.
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
 */

import java.util.Calendar;
import java.util.Scanner;

//static�� �ִ��� Ȱ���Ͽ� �ۼ��Ͻÿ�
//����ó�����α׷�
//<�Է�>
//1.�ű԰��� 2.�������� 3.����ο����� 4.���� 

public class Exam20 {
 static double Iyul;
 static Scanner sc=new Scanner(System.in);
 static String name[]=new String[10];
 static int mon[]=new int[10];

 public static void logIn(int cnt){
  System.out.print("�̸�: ");
  name[cnt]= sc.nextLine();
  System.out.print("�Աݱݾ�: ");
  mon[cnt]=sc.nextInt();
  
  Calendar cal = Calendar.getInstance();
  System.out.print("�ű� ������" + cal.get(Calendar.YEAR));
  System.out.print("�� " + (cal.get(Calendar.MONTH)+1));
  System.out.print("�� " + cal.get(Calendar.DATE));;
  System.out.print("�� " + cal.get(Calendar.HOUR));
  System.out.print("�� " + cal.get(Calendar.MINUTE));
  System.out.println("�п� ó�� �Ǿ����ϴ�. ");
  System.out.println("�Ա��� �ݾ��� "+mon[cnt]+"�� �Դϴ�.");
  System.out.println("���� ���������� "+Iyul+"�Դϴ�.");
 }
 public static void chanIyul() {
  System.out.print("������ �н�����:");
  int pw=1111;
  int pw_in=sc.nextInt();
  if(pw_in==pw){
   System.out.println("���� "+Iyul+"%�� ������ ���� �ǰ� �ֽ��ϴ�.");
   System.out.print("���� ����:");
   Iyul=sc.nextDouble();
   System.out.println(+Iyul+"%�� ���� ���� �˴ϴ�.");
  }
  else
   System.out.print("��й�ȣ�� Ʋ�Ƚ��ϴ�."); 
 }

 public static void infoMan(int cnt) {
  System.out.println("====���� ��� �� ����====");
  for(int i=0;i<cnt;i++){
  System.out.println(name[i]+" "+mon[i]+" "+Iyul);
  }
  System.out.println("=======================");
  
 }
 public static void main(String []ar){
 
 while(true){
  System.out.println("1.�ű԰��� 2.�������� 3.����ο����� 4.����");
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



