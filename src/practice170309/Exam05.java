package practice170309;
/*
 * 2way���� ����
 * ������ �� ������ ������ �Ǿ� �־�� �Ѵ� 
 * 
 * a {1,2,3,4}
 * b {3,4,5,6,8,9,0}
 * ���ؼ� ����
 *
 * c
 * 
 * ����ϰ� �������� ��°�� ������
 * ����� �ϳ� ������ ���� ���ƾ���
 */
public class Exam05 {
	public static void main(String[] ar){
		int[] a ={5,20,25};
		int[] b ={10,15,30,40,50};
		int[] c = new int[8];
		int i=0, j=0, k=0;
		
		while(true){
			if(a[i] > b[j]){
				c[k] = b[j];
				j++;
				k++;
			}else{
				c[k] = a[i];
				i++;
				k++;
			}
			
			if(i>=a.length){
				for(int l=j;l<b.length;l++){
					c[k] = b[l];
					k++;
					
				}
				break;
			}else if(j>=b.length){
				for(int l=i;i<a.length;l++){
					c[k] = a[l];
					k++;
				}
				break;
			}
		}
		
		for(int l=0;l<8;l++){
			System.out.println(c[l]);
		}
		
	}

}






/*

public class Exam05 {
	public static void main(String[] args){
		int[] a={5,20,30};
		int[] b={10,15,30,40,50};
		int[] c= new int[8];
		int i=0,j=0,k=0;
		
		while(true){
			if(a[i] > b[j]){
				c[k] = b[j];
				j++;
				k++;
			}else{
				c[k] = a[j];
				i++;
				k++;
			}
			
			if(i>=a.length){
				for(int l=j;j<b.length;j++){
					c[k]=b[l];
					k++;
				}
				break;
			}else{
				for(int l=i;j<a.length;j++){
					c[k]=a[l];
					k++;
				}
				break;
			}
		}
		
		for(int l=0;l<8;l++){
			System.out.println(c[l]);
		}
		
	}

}
*/
