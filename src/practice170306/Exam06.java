package practice170306;
import java.io.*;
import java.util.*;

public class Exam06 {
	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		int num, year = 0;
		String gender="";
		System.out.print("주민번호 7번째 자리 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		if(num%2==0)
			gender = "여성";
		else
			gender = "남성";
			
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
	default: System.out.println("잘못 입력하셨습니다");
		System.exit(-1);//프로그램 종료
	}
	System.out.println(year + gender);
}
}


/**주민번호 7번째 숫자를 입력 받아서 출생년대를 출력하시오
 * 1,2 1900년대	3,4 2000년대 9,0 : 1800년대 
 * 성별
 * 1---> 1900년대 남성 
 * 2---> 1900년대 여성
 * 3---> 2000년대 남성
 * 4---> 2000년대 여성
 * 9---> 1800년대 남성
 * 0---> 1800년대 여성
 */

