package practice170310;
//�޼ҵ带 ��� �ϴ°��
//1 �ݺ��Ǵ� �Լ��� �ѹ��� ���� ����
//2 �����Ҷ� ���� ���


//�޼ҵ带 �����
public class Exam02 {
	
	public static void PrintX(){
		for(int i=0;i<10;i++)
			System.out.print("*");
	}
	
	public static void main(String[] ar){
		
		PrintX(); //call by name
		System.out.print("\nHello\n");
		PrintX();
		System.out.print("\nJAVA\n");
		PrintX();
	}
}



/* �޼ҵ带 ������
public class Exam02 {
	public static void main(String[] ar){//�̰��� aa�� ���μ�
		
		for(int i=0;i<10;i++)
			System.out.print("*");
		
		System.out.print("\nHello\n");
		
		for(int i=0;i<10;i++)
		System.out.print("*");
	}
}

*/