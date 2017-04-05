package practice170326;

import java.util.Calendar;
import java.util.Date;

public class Exam01 {
	public static void main(String[] ar) throws Exception{
		String str = "Hello Java!!!"; // str변수 생성및 초기화
		char ch = str.charAt(2); // ch 변수 생성 및  l 을 읽은 것으로 초기화 
		System.out.println("ch = " + ch); //ch변수에 저장된 값을 입력
		String str1 = "www.daum.net";
		if(str1.endsWith(".net")){
			System.out.println(".net 사이트 입니다." + str1.length());
		}
		String str2 = "AbcD";
		String str3 = "abcd";
		
		if(str2.equalsIgnoreCase(str3)) // 변수를 대소문자 관계없이 비교해서 true false 값으로 리턴하는 메소드
			System.out.println("같다");
		
		String str4 = "java2java5"; // 영어와 숫자 등 1바이트의 문자열들를 바이트로 형변환 하기
		byte[] by = str4.getBytes(); // 문자열을 바이트 배열로 출력해주는 메소드 by 변수 배열에 저장
		for(int i=0;i<by.length;i++) // by배열의 길이만큼 수행
			System.out.println((char)by[i]); // by 각 배열의 값을 문자로 형변환 해서 출력-> 각 배열의 공간에 문자열의 한글자씩이 넣어져있다
		
		String str5 = "전용호"; // 한글과 같은 2바이트 짜리 문자열을 바이트로 형변환 하기
		byte[] by1 = str5.getBytes("iso-8859-1");//똑같이 getbytes메소드를 쓰되 매개변수를 "iso8859_1"로 줘야함 , 완성형 한글 코드 번호 ????
		System.out.println(new String(by1));
		
		//String email = "aaaaa.aaa@com"; 
		String email = "aaaaa@aaa.com"; // 이메일의 유효성 검사
		boolean a = email.indexOf("@") == -1; //indexof는 문자열에서 특정문자열을 찾아서 있는 위치를 값을 리턴함 문자열이 없으면  -1값을 리턴하는 메소드  5 리턴되면 false
		boolean b = email.indexOf(".") == -1; //email문자열에 . 문자열이 있으면 그 위치인 9리턴되고 따라서 b에는 false 값이 저장됨
		boolean c = email.indexOf("@") > email.indexOf("."); // 5>9 이므로 false
		
		System.out.println(email.indexOf("@")); // 5 출력
		
		if(a == false && b == false && c==false){ // 위의 예제에서는 이것이 출력
			System.out.println("규칙이 올바릅니다.");
		}else{
			System.out.println("규칙이 올바르지 않습니다.");
		}
		
		String aaa="abcd@bbb.com";
		String bbb = aaa.substring(aaa.indexOf("@")+1,aaa.indexOf(".")); // bbb에 bbb 문자열이 입력됨
		String ccc = aaa.substring(5, 8); // ccc 에 bbb 문자열이 입력됨
		String ddd = aaa.substring(5);  // ddd에 bbb.com 문자열이 입력됨? 맞다
		System.out.println(ddd);
		
		aaa="aaa";
		bbb="aaa";
		if(aaa == "aaa"){
			System.out.println("된다");
		}
		
		if(aaa.equals("aaa"))
			System.out.println("된다");
		
		
		//java.util.Date 클래스
		Date date = new Date(); // 현재시간 출력
		Date date1 = new Date(123123312L);
		//1970년 1월1일 0시0분0초를 기준으로 ms를 계산하여 그 결과를 
		//시간으로 환산하여 표시 한다.
		
		System.out.println(date);
		System.out.println(date1);
		
		System.out.println(date.getYear()); // 1900년을 기준으로 현재날짜까지의 햇수를 얻는 메소드
		System.out.println(date.getMonth()); // 현재의 달이 올해의 몇번째 달인지를 출력  0,1,2 번째 // 달만 우리가 인식하는 월로 보려면 +1을 해줘야 한다
		System.out.println(date.getDate()); // 현재의 일이 이번달의 몇번째 일인지 출력
		System.out.println(date.getHours()); // 현재의 시간이 오늘의 몇번째 시간인지 출력
		System.out.println(date.getMonth());
		System.out.println(date.getSeconds()); // 현재의 초가 이번 분의 몇번째 초인지 출력
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	}

}












