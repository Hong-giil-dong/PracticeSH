package practice170306;

public class Exam08 {
	public static void main(String[] ar){
		int a=1,b=1,c=0;
		System.out.print(a+"\t"+b+"\t");
		for(int j=1;j<=8;j++){
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
	}
}

/**
 * �Ǻ���ġ ����
 * ù��° ���� �ι�° ���� �־�ߵ�
 * 1 1 2 3 5 8 13 21 34 55
 * ù��°��
 * �ι�°��
 * ����°���� ù��° �ι�°���� ���Ѱ��� ����
 * 8���� ����ؾߵ�
*/
