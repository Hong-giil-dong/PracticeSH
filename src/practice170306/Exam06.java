package practice170306;
import java.io.*;
import java.util.*;

public class Exam06 {
	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int num, year = 0;
		String gender="";
		System.out.print("�ֹι�ȣ 7��° �ڸ� �Է� : ");
		num = Integer.parseInt(sc.nextLine());
		if(num%2==0)
			gender = "����";
		else
			gender = "����";
			
	switch(num){
	case 1:	
	case 2:
		year=1900;
	case 3:
	case 4:
		year=2000;
		break;
	case 9:
	case 0:
		year=1800;
		break;
	default: System.out.println("�߸� �Է��ϼ̽��ϴ�");
		System.exit(-1);//���α׷� ����
	}
	System.out.println(year + gender);
}
}


/**�ֹι�ȣ 7��° ���ڸ� �Է� �޾Ƽ� �����븦 ����Ͻÿ�
 * 1,2 1900���	3,4 2000��� 9,0 : 1800��� 
 * ����
 * 1---> 1900��� ���� 
 * 2---> 1900��� ����
 * 3---> 2000��� ����
 * 4---> 2000��� ����
 * 9---> 1800��� ����
 * 0---> 1800��� ����
 */

