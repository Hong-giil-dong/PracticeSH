package practice170314;
//����)

import java.io.*;
class Exam05{
	int[] sub = new int[4]; //0:����,1:����,2:����,3:����
	float avg; //4.���
	Exam05() throws IOException{
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		String[] str ={"����","����","����"};
		for(int i=0;i<str.length;i++){
			System.out.print(str[i] +" : ");
			sub[i] = Integer.parseInt(in.readLine());
			sub[str.length] += sub[i];
		}
		avg = sub[str.length] / (float)str.length;
		
		System.out.println("���� : " + sub[str.length]);
		System.out.println("��� : " + avg);
	}
	
	public static void main(String[] ar) throws IOException{
		Exam05 ex = new Exam05();


	}
}


//���̤� Ŭ������ Ȱ���Ͽ� ����, ����, ������ ������ �Է� �޾Ƽ� ������ ����� ���ϴ� ���α׷��� �ۼ� �Ͻÿ�