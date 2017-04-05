package practice170306;
/*
 * whle(조건){
 * 	조건을 만족하는 동안만 반복
 * }
 * 
 * ->조건을 보고 아예 수행을 안함
 * 
 * do{
 * 선처리 후조건
 * }while(조건);
 * 
 * ->일단 한번 수행해보고 조건을 따짐?
 * 
 * 중복되는 아이디 찾기위한 조건 처음부터 끝까지 구하지
 */
import java.io.*;
import java.util.*;

public class Exam09 {
	public static void main(String[] args)
		throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<=10){
			String st = sc.nextLine();
			if(st.equals("Q"))
				break;
			System.out.println(i);
			i++;
		}
	}
}
