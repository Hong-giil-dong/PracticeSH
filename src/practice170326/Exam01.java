package practice170326;

import java.util.Calendar;
import java.util.Date;

public class Exam01 {
	public static void main(String[] ar) throws Exception{
		String str = "Hello Java!!!"; // str���� ������ �ʱ�ȭ
		char ch = str.charAt(2); // ch ���� ���� ��  l �� ���� ������ �ʱ�ȭ 
		System.out.println("ch = " + ch); //ch������ ����� ���� �Է�
		String str1 = "www.daum.net";
		if(str1.endsWith(".net")){
			System.out.println(".net ����Ʈ �Դϴ�." + str1.length());
		}
		String str2 = "AbcD";
		String str3 = "abcd";
		
		if(str2.equalsIgnoreCase(str3)) // ������ ��ҹ��� ������� ���ؼ� true false ������ �����ϴ� �޼ҵ�
			System.out.println("����");
		
		String str4 = "java2java5"; // ����� ���� �� 1����Ʈ�� ���ڿ��鸦 ����Ʈ�� ����ȯ �ϱ�
		byte[] by = str4.getBytes(); // ���ڿ��� ����Ʈ �迭�� ������ִ� �޼ҵ� by ���� �迭�� ����
		for(int i=0;i<by.length;i++) // by�迭�� ���̸�ŭ ����
			System.out.println((char)by[i]); // by �� �迭�� ���� ���ڷ� ����ȯ �ؼ� ���-> �� �迭�� ������ ���ڿ��� �ѱ��ھ��� �־����ִ�
		
		String str5 = "����ȣ"; // �ѱ۰� ���� 2����Ʈ ¥�� ���ڿ��� ����Ʈ�� ����ȯ �ϱ�
		byte[] by1 = str5.getBytes("iso-8859-1");//�Ȱ��� getbytes�޼ҵ带 ���� �Ű������� "iso8859_1"�� ����� , �ϼ��� �ѱ� �ڵ� ��ȣ ????
		System.out.println(new String(by1));
		
		//String email = "aaaaa.aaa@com"; 
		String email = "aaaaa@aaa.com"; // �̸����� ��ȿ�� �˻�
		boolean a = email.indexOf("@") == -1; //indexof�� ���ڿ����� Ư�����ڿ��� ã�Ƽ� �ִ� ��ġ�� ���� ������ ���ڿ��� ������  -1���� �����ϴ� �޼ҵ�  5 ���ϵǸ� false
		boolean b = email.indexOf(".") == -1; //email���ڿ��� . ���ڿ��� ������ �� ��ġ�� 9���ϵǰ� ���� b���� false ���� �����
		boolean c = email.indexOf("@") > email.indexOf("."); // 5>9 �̹Ƿ� false
		
		System.out.println(email.indexOf("@")); // 5 ���
		
		if(a == false && b == false && c==false){ // ���� ���������� �̰��� ���
			System.out.println("��Ģ�� �ùٸ��ϴ�.");
		}else{
			System.out.println("��Ģ�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		String aaa="abcd@bbb.com";
		String bbb = aaa.substring(aaa.indexOf("@")+1,aaa.indexOf(".")); // bbb�� bbb ���ڿ��� �Էµ�
		String ccc = aaa.substring(5, 8); // ccc �� bbb ���ڿ��� �Էµ�
		String ddd = aaa.substring(5);  // ddd�� bbb.com ���ڿ��� �Էµ�? �´�
		System.out.println(ddd);
		
		aaa="aaa";
		bbb="aaa";
		if(aaa == "aaa"){
			System.out.println("�ȴ�");
		}
		
		if(aaa.equals("aaa"))
			System.out.println("�ȴ�");
		
		
		//java.util.Date Ŭ����
		Date date = new Date(); // ����ð� ���
		Date date1 = new Date(123123312L);
		//1970�� 1��1�� 0��0��0�ʸ� �������� ms�� ����Ͽ� �� ����� 
		//�ð����� ȯ���Ͽ� ǥ�� �Ѵ�.
		
		System.out.println(date);
		System.out.println(date1);
		
		System.out.println(date.getYear()); // 1900���� �������� ���糯¥������ �޼��� ��� �޼ҵ�
		System.out.println(date.getMonth()); // ������ ���� ������ ���° �������� ���  0,1,2 ��° // �޸� �츮�� �ν��ϴ� ���� ������ +1�� ����� �Ѵ�
		System.out.println(date.getDate()); // ������ ���� �̹����� ���° ������ ���
		System.out.println(date.getHours()); // ������ �ð��� ������ ���° �ð����� ���
		System.out.println(date.getMonth());
		System.out.println(date.getSeconds()); // ������ �ʰ� �̹� ���� ���° ������ ���
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	}

}












