package practice170307;
/*
 * (77*1)+(76*2)+....+(2*76)+(1*77)
 * �ݺ����� �ϳ��� �����
 * 
 */
public class Exam05 {
	public static void main(String[] ar){
		int a=0,b=0,c=0,d=0; 
		for(a=77;a>=1;a--){
			b=b+1;
			c=a*b;
			d=d+c;


		}
		System.out.println();
		System.out.print(d);
		System.out.println();
		}
	}
