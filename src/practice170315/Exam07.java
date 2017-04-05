package practice170315;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Exam07 {
	private BufferedReader in;
	private String name;
	private int[] jumin;
	private boolean right;
	
	public Exam07() {
		in = new BufferedReader(new InputStreamReader(System.in));
		name = "";
		jumin = new int[14];
		right = false;
	}

	public void setName() throws IOException{
		System.out.print("�̸� = ");
		name = in.readLine();
	}

	public void setJumin() throws IOException{
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
			
			//�ֹι�ȣ ����
			int hap =0, cre = 2;
			float temp = 0.0f, temp1 = 0.0f;
			
			for(int i=0;i<jumin.length-1;i++){
				if(i==6) continue;
				hap+=jumin[i]*cre;
				cre++;
				if(cre==10) cre=2;
				
			}
			
			temp = hap % 11;
			temp1 = (11-temp)%10;
			
			if( temp1 != jumin[13]){
				System.out.println("�ֹι�ȣ�� �ùٸ��� �ʽ��ϴ�!");
				continue;
			}
			right = true;
			
		}while(!right);
	}
	
	public void display(){
		System.out.println();
		System.out.println("�̸� : "+name);
		System.out.print("�ֹι�ȣ : ");
		for(int i=0;i<jumin.length;i++){
			if(i==6){
				System.out.print("-");
				continue;
			}
			System.out.print(jumin[i]);
		}
		//������� ���
		// jumin[7] = 0,9 -> 1800, 1,2->1900, 3,4->2000
		
		System.out.println();
		System.out.print("������� : ");
		int year=0, month=0, day=0;
		switch(jumin[7]){
		case 0: case 9:
			year=1800;
			break;
		case 1: case 2:
			year=1900;
			break;
		case 3: case 4:
			year=2000;
			break;
		}
		
		year += jumin[0]*10 + jumin[1];
		month = jumin[2]*10 + jumin[3];
		day = jumin[4]*10 + jumin[5];
		
		System.out.println(year + "�� "+month+"�� "+day+"��");
		
		System.out.println("���� : " + (jumin[7]%2==0?"����":"����"));
		
		System.out.print("����Ű��� : ");
		String area = null;
		switch(jumin[8]){
		case 0: area="����"; break;
		case 1: area="���, ��õ"; break;
		case 2: area="�λ�"; break;
		case 3: area="������"; break;
		case 4: area="��û��"; break;
		case 5: area="����"; break;
		case 6: area="�뱸, ����"; break;
		case 7: area="���, �泲"; break;
		case 8: area="���"; break;
		case 9: area="����"; break;
			
		}
		System.out.println(area);
		System.out.print("���� : ");
		Calendar cal = Calendar.getInstance();
		int age = cal.get(Calendar.YEAR)-year+1;
		System.out.println(age+" �� ");
	}
	
}








