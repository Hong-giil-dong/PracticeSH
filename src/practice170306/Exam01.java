package practice170306;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		/*
		 * if�� 1����
		 * if(���� ����) -> Ʈ�糪 �޽��� �Ǿ����
		 * 		����_���๮;
		 * if(���� ����){ ->������ ��?
		 * 		����_���๮;
		 * 		����_���๮;
		 *  	����_���๮;
		 * }
		 * if�� 2����
		 * if(����)
		 * 		������๮; // ������ ���ϰ��
		 * else
		 * 		���� ���๮; // �����϶�
		 * 
		 * if�� 3����
		 * if(����)
		 * 		���๮
		 * else if(����)
		 * 		���๮;
		 * else if(����)
		 * 		���๮;
		 * else
		 * 		���๮;
		 * 
		 */
		/**
		System.out.print("���ڸ� �Է�(0~9) : ");
/**
		int num = System.in.read()-'0'; //-48�� �ƽ�Ű �ڵ尪�� ���°��� ()-'0'; ��ü�� ����
		if(num%2 == 0)
			System.out.println("¦�� �Դϴ�.");
		else
			System.out.println("Ȧ�� �Դϴ�.");
		*/
		/**
		int num = System.in.read()-48;
		if ((num%3 == 0) && (num%5 == 0))
			System.out.println("3�� 5�� ����Դϴ�.");	
		else 
			System.out.println("3�� 5�� ����� �ƴմϴ�.");	
		*/
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(in.readLine());
		
		if(num<=100 && num>=90)
			System.out.println("��");
		else if(num>=80)
			System.out.println("��");
		else if(num>=70)
			System.out.println("��");
		else if(num>=60)
			System.out.println("��");
		else
			System.out.println("��");
		//Swaping
		int a=5, b=6;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		int t = a;
		a=b;
		b=t;
		System.out.println("A = " + b);
		System.out.println("B = " + a);
	}
}




/** ���ǹ�
{���๮1
���๮2} 
���ȣ ����ߵ�
if���๮
else
3if (����)
else if (����)
��
����ġ ���ǹ�

������ ���� �Է¹޾� 3�� ����̸鼭 ���ÿ� 5�ǹ��

���� ���� �޾Ƽ� ū������ �����Ͻÿ�
�ڸ���ȯ



 */
*/