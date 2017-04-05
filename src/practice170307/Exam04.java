package practice170307;
/**
 * 구구단 출력
 * 2*1=2 2*2=4 ...
 * ...
 * 9*1=9 9*2=18... 9*9=81
 * 
 *
 */

public class Exam04 {
	public static void main(String[] ar){
		for(int a=1;a<=9;a++){
		for(int b=2;b<=9;b++){
			System.out.printf("%2d * %2d = %2d\t",b,a,b*a);
			//System.out.print(b+" * "+a+ " = "+(a*b)+"\t");
		}
		System.out.println();
		}
		
	}
	}

/**


public class Exam04 {
	public static void main(String[] ar){
		int a=1,b=1;{
			
		for(a=1;a<=9;a++){
			

			System.out.println();
			System.out.println();
			
		for(b=2;b<=9;b++){
			System.out.print(b+" * "+a+ " = "+(a*b)+"\t");
		}
		}
	}
	}
}

*/