package practice170313;
/*
 * �ظ�� ���� ������ ������ �� �ִ� Ŭ������ ���� �Ѵ�.
 * ������ ���ÿ� �ʱ�ȭ�� ������ �����ڵ� ���� �Ѵ�.
 * �غ��� ���� ������ �����ų �� �ִ� �޼ҵ�� �ﰢ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ嵵 �����Ѵ�.
 */
import java.io.*;
import java.util.*;

class Triangle{
	int Base;
	int Height;
	public Triangle(int b, int h){
		Base = b;
		Height = h;
	}
	public int area(){
		return Base*Height/2;
	}
}
public class Exam09 {
	public static void main(String[] ar){

		Triangle tri = new Triangle(6,10);

		System.out.println("���� : " + tri.area());		
	}
}
