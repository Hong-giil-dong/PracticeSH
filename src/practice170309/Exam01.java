package practice170309;
/**
 * Sorting 
 *���������� ���Ĵٵ�
 *�ڹٴ� �⺻����
 *������ ����
 *������ ��ȯ��
 *Selection Sorting ���� ����
 */
public class Exam01 {
	public static void main(String[] args){
		int[] data={7,3,6,2};
		System.out.print("������ : ");	
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
		}

		System.out.println("������ : ");	
		for(int i=0;i<data.length;i++){

			for(int j=i+1;j<data.length;j++){
				if(data[i]>data[j]){
					int t = data[i];
					data[i]=data[j];
					data[j]= t;
				}
			}

			System.out.print(data[i]+"\t");
		}

	}

}
