package practice170306;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Exam03 {
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 : ");
		int first = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 값 : ");
		int second = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 값 : ");
		int third = Integer.parseInt(sc.nextLine());
		int temp;
		
		if(first<second && second>third){
			temp = first;
			first = second;
			second = temp;
		else if(third>first && third>second){
			temp = first;
			first = third;
			thrid = temp;
		}
		if (second<third){
			temp = second;
			second = third;
			thrid = temp;}
}
	System.out.println();
	System.out.println(first +"\t"+second+"\t"+third);
}