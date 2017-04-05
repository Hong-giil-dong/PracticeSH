package practice170305;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work01 {
	public static void main(String args[]) {
		int a=2,num=0;
		try {
			System.out.print("�Ҽ� �Ǻ��ϰ� ���� ���� �Է� : ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			num=Integer.parseInt(br.readLine());
			boolean check=true;
			while(a<=(num/2)&&check) {
			if(num%a==0) {
				check=false;
			}
			a++;
		}
		if(check) {
			System.out.println(num+"���� �Ҽ���");
		}
		else {
			System.out.println(num+"���� �Ҽ��� �ƴ�");
		}
	}
		catch(IOException e) {
			System.out.println("IOException �Դϴ�.");
		}
		catch(NumberFormatException nfe) {
			System.out.println("NumberFormatException �Դϴ�.");
		}
	}
}
/**		
import java.io.*;

public class Work01 {
	public static void main(String args[]) {
  int a=2;
  int num=0;
  
  try{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   num=Integer.parseInt(br.readLine());
   boolean check=true;
   while(a<=(num/2)&&check)
   {
    if(num%a==0){
     check=false;
    }
    a++;
   }
   if(check)
   {
    System.out.println("�Ҽ��Դϴ�.");
   }
   else{
    System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
   }
  }catch(IOException e){System.out.println("IOException �Դϴ�.");}
  catch(NumberFormatException nfe){System.out.println("NumberFormatException �Դϴ�.");}
 }
}
*/

/**

import java.io.*;

public class Work01 {
	public static String readFromKeyboard() {
		String inp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			inp = br.readLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return inp;
}
}

public class Work02 {
	public static void main(String[] args) {
		boolean sym = false;
		int inp=0,div=2;
		System.out.println("�Ҽ� �Ǻ��ϰ� ���� ���� �Է� : ");
		inp=integer.parselnt(readFromKeyboard());
		while (true) {
			if(inp%div==0) {
				System.out.println(inp+"�� �Ҽ��� �ƴմϴ�");
				break;
			}
			else {
				div++;
				if (div > (inp/2)) {
					sym = true;
					break;
				}
			}
		}
		if (sym) {
			System.out.println("�Է��� ���ڴ� �Ҽ��Դϴ�");
			
		}
		else {
			System.out.println("�Ҽ��� �ƴմϴ�");
		}
	}
}

*/

/**
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sosu {
 public static String readFromKeyboard() {//Ű����� �Է��ϴ� ���� �����ϴ� �޼ҵ�
  String input = "";                                    
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  try {
   input = br.readLine();
  } catch (IOException e) {
   e.printStackTrace();
  }
  return input;
 }
 
 public static void main (String[]args) {
  boolean flag = false;         // �Ҽ����� �ƴ����� �Ǵ��ϱ� ���� ����
  int input = 0;                     // ����ڰ� �Է��ϴ� ��
  int div = 2;                        // ����ڰ� �Է��� ���� ������ ���� ��. 2���� ����
  System.out.println("üũ�Ͻ� ���� �Է����ּ���");
  input = Integer.parseInt(readFromKeyboard());                //readFromKeyboard�޼ҵ带 ȣ���Ͽ�
                                                                                         //Ű���尪 ����
  while (true) {                         //break���� ���������� ���� �ݺ�
   if(input%div == 0) {                 //����� �Է°��� div������ ������ �� �������� 0 �̶�� break
    System.out.println(input+"����"+div+"�� �������׿�");
    break;
   }
   else {         // �������� ������ div���� 1�� �����ϰ� �׶� div�� ���� �Է��� ���� �ݰ����� ũ��
    div++;        // flag���� true�� ����
    if (div > (input/2)) {
     flag = true;
     break;
    }
   }
  }
  if (flag) {
   System.out.println("�Է��Ͻ� ���� �Ҽ��Դϴ�.");
  }
  else {
   System.out.println("�Ҽ��� �ƴմϴ�.");
  }
 }
}
*/

/**
public class Work01 {
	public static void main(String[] args) {
		int i,j;
		boolean s;
		for(i=2;i<=1000;i++) {
			s=false;
			for(j=2;j<i;j++) {
				if(i%j==0){
					s=true;
					break;
				}
			}
			if(s)
				continue;
			System.out.println(i);
		}
		
	}
}
*/


/**
public class Work01 {
	public static void main(String[] args) {
		for(int i=1,j=10;i<=10;i++,j--)
			System.out.printf("%d \t %d%n", i, j);
	}
}
*/

/**
import java.io.*;
import java.util.Scanner;

public class Work01 {
	public static void main(String[] args) throws IOException {
		int input;
		
		System.out.print("������ �Է��Ͻÿ� : ");
		
		Scanner Scanner = new Scanner(System.in);
		String tmp = Scanner.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
		}
		
		
		if(input!=0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input);
		}
	}
}
*/

/**
import java.io.IOException;

public class Work01 {
	public static void main(String[] args) throws IOException {
		int sum=0;
			for (int x=1; x<=10; x++) {
				sum=sum+x;
			}
			System.out.println(sum);
	}
}

*/





/**

import java.util.Scanner;

public class Work01 {

	private static Scanner input;

	public static void main(String[] args) {
		
		int a;


			input = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			a=input.nextInt();
			
			Work(a);
		}
	
	public static void Work(int b){
		int c, cnt=0;
		
		for(c=2; c<=b; c++){
			if(b%c==0)
				cnt++;
		}
		
		if(cnt==1)
			System.out.println(b+"�� �Ҽ��Դϴ�.");
		else
			System.out.println(b+"�� �Ҽ��� �ƴմϴ�.");
		
	}
}

*/

/**
 * �ݺ���
*/
