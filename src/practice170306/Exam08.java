package practice170306;

public class Exam08 {
	public static void main(String[] ar){
		int a=1,b=1,c=0;
		System.out.print(a+"\t"+b+"\t");
		for(int j=1;j<=8;j++){
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
	}
}

/**
 * 피보나치 수열
 * 첫번째 값과 두번째 값이 있어야됨
 * 1 1 2 3 5 8 13 21 34 55
 * 첫번째값
 * 두번째값
 * 세번째값은 첫번째 두번째값을 더한것을 저장
 * 8번을 계산해야됨
*/
