package practice170315;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

//�ֹι�ȣ ���� P/G
public class Exam01 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name ="";
		int[] jumin = new int[14];
		boolean right = false;
		
		System.out.print("�̸� : ");
		name = in.readLine();
		
		do{
			right=false;
			System.out.print("�ֹι�ȣ (ex. 123456-1234567) : ");
			for(int i=0;i<jumin.length;i++){
				jumin[i] = System.in.read() - 48;
			}
			System.in.read();
			System.in.read();
			
			if(jumin[2]*10 + jumin[3]>12){
				System.out.println("�¾ ���� 12�� ���� Ŭ �� �����ϴ�.");
				continue;
			}
			else if(jumin[4]*10 + jumin[5] > 31){
				System.out.println("�¾ ���� 31�� ���� Ŭ �� �����ϴ�.");
				continue;
			}
			else if(jumin[7] != 9 && jumin[7] != 0 &&
					jumin[7] != 1 && jumin[7] != 2 &&
					jumin[7] != 3 && jumin[7] != 4 ){
				System.out.print("������ ��Ÿ���� ���ڴ� ");
				System.out.println("0,1,2,3,4 �� �ϳ����� �մϴ�. ");
				continue;
			}
			/*
			//�ֹι�ȣ ����
			int hap =0, cre = 2;
			float temp = 0.0f, temp1 = 0.0f;
			
			for(int i=0;i<jumin.length;i++){
				if(i==6) continue;
				hap+=jumin[i]+cre;
				cre++;
				if(cre==10) cre=2;
			}

			
			
			temp = (int)(hap /11.0f)*11.0f+11.0f - hap;
			temp1 = temp - (int)(temp / 10.0f)*10.0f;
			
			if(temp1 != jumin[13]){//�������� �ε�ȣ�� =�� ���� �ȵȴ�
				System.out.println("�ֹι�ȣ�� �ùٸ��� �ʽ��ϴ�!");
				continue;
			}
			right = true;
						*/
			
		}while(right);
		
		/**
		 * �̸� : 
		 * �ֹι�ȣ : 
		 * ������� : 19(18,20)00�� 00�� 00��
		 * ���� : ����, ����
		 * ����Ű��� : ??
		 * ���� : 00��
		 */
		
		System.out.println();
		System.out.println("�̸� : " + name);
		System.out.println("�ֹι�ȣ : ");
		for(int i=0;i<jumin.length;i++){
			if(i==6){
				System.out.print("-");
				continue;
			}
			System.out.print(jumin[i]);
		}
		//������� ���

		if(jumin[7]<3){
			System.out.println();		
			System.out.print("������� : 18");
			for(int i=0;i<6;i++){
				System.out.print(jumin[i]);
			}
		}
		
		else if (jumin[7]>2){
			System.out.println();	
			System.out.print("������� : 19");
			for(int i=0;i<6;i++){
				System.out.print(jumin[i]);
				}
		}
		else{
			System.out.println();	
			System.out.print("������� : 20");
			for(int i=0;i<6;i++){
				System.out.print(jumin[i]);	
			}
		}
		
		//���� ����
		if(jumin[7]<7){
			System.out.println();		
			System.out.print("����");
		}
		else{
			System.out.print("����");
		}
		
		//����Ű���
		
		int pos = 0;
		String area="";
		switch(pos){
		case 0: area="����";break;
		case 1: area="���,��õ";break;
		case 2: area="�λ�";break;
		case 3: area="����";break;
		case 4: area="��û";break;
		case 5: area="����";break;
		case 6: area="�뱸,����";break;
		case 7: area="���";break;
		case 8: area="�泲";break;
		case 9: area="����";break;
		}
		
		System.out.println(area);
		System.out.print("���� : ");
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("�� : " + cal.get(Calendar.YEAR));
		System.out.println("�� : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("�� : " + cal.get(Calendar.DATE));
		System.out.println("����(0)/����(1) : " + cal.get(Calendar.AM_PM));
		System.out.println("�� : " + cal.get(Calendar.HOUR));
		System.out.println("�� : " + cal.get(Calendar.MINUTE));
		System.out.println("�� : " + cal.get(Calendar.SECOND));
		System.out.println("�и��� : " + cal.get(Calendar.MILLISECOND));
		System.out.println("�и��� : " + cal.get(Calendar.YEAR));
		
		int Na;
		
		/*
		���̸� ���ϴ¹�
		���� �������� �� ������ ����
		
		���� ������ �� ������ ���ؼ� ����(02)�� �����(03)���� ������ ���̰� �ϳ� �þ��
		�׷��� ������ ���̴� �״�δ�
		
		���� �Ͽ��� �� ��'��'�� ���ؼ� ����(14)�� ������(15)���� ������ ���̰� �ϳ� �þ��
		�׷��� ������ ���̴� �״�δ�
		*/
		
		
		if(jumin[7]<3){
			System.out.println();		
			int Y = 1800;
			Y+=(jumin[0]*10)+jumin[1];
			Na=(cal.get(Calendar.YEAR))-Y;
			System.out.println("���� : " + Na);
			
			if((Y+=(jumin[2]*10)+jumin[3]) >= (cal.get(Calendar.MONTH)));
			System.out.println("���� : " + Na+1);
		}
			
		else if (jumin[7]>2){
			System.out.println();		
			int Y = 1900;
			Y+=(jumin[0]*10)+jumin[1];
			Na=(cal.get(Calendar.YEAR))-Y;
			System.out.println("���� : " + Na);
		}
		else{
			System.out.println();		
			int Y = 2000;
			Y+=(jumin[0]*10)+jumin[1];
			Na=(cal.get(Calendar.YEAR))-Y;
			System.out.println("���� : " + Na);
		}
	}		
}
