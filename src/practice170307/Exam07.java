package practice170307;
/**
 * ����Ī
 * 1-2+3-4+5
 * 
 * 
 *
 */
public class Exam07 {
	public static void main(String[] args){
		//����Ī ���� ����
		int sw=0;
		for(int i=1;i<=5;i++){
			if(sw==0){
				System.out.print("+"+i);;//+1
				sw=1;
			}else{
				System.out.print("-"+i);//+1-2
				sw=0;

				
			}
		}
		
		System.out.println();
		// ��ȣ ��ȯ ����Ī(-1)
		int s=-1;//1���൵ �������
		for(int i=1;i<=5;i++){
			System.out.print(i*s);
			s=s*(-1);

		}
		
		System.out.println();
		//�������ν���Ī
		int j=0;
		for(int i=1;i<=5;i++){
			j++;
			System.out.print("+"+j);
			if(j==5) break;
			j++;
			System.out.print("-"+j);
		}
		
		
		
		
		
		
		
	}
}
