package practice170310;
/*
 * 
 * �޼ҵ�� ������ �ݺ��� ����
 * 5!(���丮��) = 1*2*3*4*5
 * 
 */
//�ݺ����� ������� �ʰ� �޼ҵ�� ��� 5!

public class Exam03{
	public static int fact(int x){//���� ���⼭ void �� ��ٸ� �ؿ� ���� ���� ���� ����
		if(x==1)
			return 1;
		else
			return x*fact(x-1);//fact�� fact�� �ҷ��� - > ���ȣ�� 
		//����Ҷ��� ��������� Ȯ���ϰ� �������� infinite ���°����� ���� 
		//�긦 �ҷ��� �ٽ� �����ض�
	}
	
	public static void main(String[] ar){
		
		int x = fact(5);
				System.out.println("5! = "+x);
	}
}

//�ݺ��� ���� ��� 5!
/*
public class Exam03 {
	public static void main(String[] ar){
		int a=1;
		for(int i=1;i<=5;i++)
			a*=i;
		System.out.println("5! = "+a);
	}
}
*/