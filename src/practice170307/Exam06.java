package practice170307;
/*
 * ����޷� �����
 * ���� ����ؼ�
 * 2006�� 1�� 1���� ����(�Ͽ���)
 */

import java.io.*;
import java.util.*;

public class Exam06 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		int year=0,month=0;
		int start=0,end=0;
		int base=0; //������ ���س�
		boolean bool=false; //���� üũ
		int pos=0;
				
		do{
			System.out.print("���� �Է�(2017) : ");
			year = Integer.parseInt(in.readLine());
		}while(year<0 || year>9999);
		
		do{
			System.out.print("�� �Է�(3) : ");
			month = Integer.parseInt(in.readLine());
		}while(month<1 || month>12);
		
		if (year%4 == 0 && year%100!=0 || year%400==0)
			bool=true;
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8:
		case 10: case 12: end=31;break;
		
		case 4: case 6: case 9: case 11: end=30;break;
			
		case 2:
			if(bool) end=29;else end=28;break;
		
		}
		
		if(year<base){ //2312321313
			start = base - year;
			for(int i=year;i<base;i++){
				if (year%4 == 0 && year%100!=0 || year%400==0)
					start++;
				start = 7-start%7;
			}
				if(start==7) start=0;
			}else{
				start = year - base;
				for(int i=base;i<year;i++)
					if(year%4 == 0 && year%100!=0 ||year%400==0)
						start++;
				start%=7;
						
				for (int i=1;i<month;i++){
						switch(i){
						case 1: case 3: case 5: case 7: case 8:
						case 10: case 12: start+=31;break;
						
						case 4: case 6: case 9: case 11: start+=30;break;
							
						case 2:
							if(bool) start+=29;else start+=28;break;
						//4������ ���ƿö����� ��¥�� �ϳ��� �и�
							//4�� 2���� �� ������ �ƴѰɷ� ǥ�õɱ�
			}
		}
		start%=7;
		System.out.print(year + "��");
		System.out.print(month + "��");
		System.out.println();
		System.out.print("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println();
		for(int i=0;i<start;i++,pos++)
			System.out.print("\t");
		for(int i=1;i<=end;i++){
			if(i<10) System.out.print(' ');
			System.out.print(i);
			++pos;
			if(pos%7==0)
				System.out.println();
			else
				System.out.print("\t");
	}
		if(pos%7!=0)
			System.out.println();
		System.out.println("===================================================");
	}
}	
}
		
/**
		}
		
		Scanner sc = new Scanner(System.in);
		int year =0;
		boolean bool=false;
		
		System.out.print("���� Ȯ�ο��� �Է� : ");
		year = Integer.parseInt(sc.nextLine());
		if (year%4 == 0 && year%100!=0 || year%400==0)
			bool=true;
			System.out.println();
			System.out.print(year + "���� ");
			System.out.print(bool?"�����Դϴ�":"����Դϴ�");
	}
}
*/
/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		boolean bool=false;
		System.out.print("���� Ȯ�ο��� �Է� : ");
		int a = Integer.parseInt(in.readLine());
		if (((a/400)==0) || ((a/100)==0))
			System.out.print(a + "�� �����Դϴ�");

			
		}
	}
*/


/*
 * ����޷� �����
 * ���� ���ϴ� ���α׷� �����
 * 1. �������� �Ǵ��ϰ��� �ϴ� �⵵ �Է�
 * 2. ������ 4�⿡ �ѹ�
 * 3. ��, 10���� ������ �������� �ش� ������ �ƴ� 
 * 4. ��, 100���� ������ �������� �� �߿��� \400���� ������ �������� �ش� �����̴�.
 * 5. 2000���� ����
 * 
 * �Է� 
 * ������ �Է� : 2000
 * ���
 * 2000���� �����Դϴ�
 * 2013���� ������ �ƴմϴ�
 * 
 * 12�� �Ͽ��� �� 12�ñ��� ��¥ ����޷�
 * kkoun@naver.com
 * �ҽ��ڵ常 ������ �ȴ�
 * ���� ���� �̸�
*/