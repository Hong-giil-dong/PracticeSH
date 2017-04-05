package practice170307;
/**
 * 1+3+6+10+15+21+28+36+45+55
 * @author user2
 *
 */
public class Exam08 {
	public static void main(String[] ar){
		int a=0,b=0,c=0;{
			
		for(int i=1;i<=10;i++){
			
			a++;
			b += a;
			c += b;
			System.out.print(a+"\t");
			System.out.print(b+"\t");
		}
		System.out.println();
		System.out.print(c+"\t");
	}
	}
}
//임의의 수를 입력받아서 그 약수를 모두 출력

