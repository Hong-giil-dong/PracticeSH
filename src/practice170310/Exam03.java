package practice170310;
/*
 * 
 * 메소드로 만들자 반복문 없이
 * 5!(팩토리얼) = 1*2*3*4*5
 * 
 */
//반복문을 사용하지 않고 메소드로 출력 5!

public class Exam03{
	public static int fact(int x){//만약 여기서 void 를 썼다면 밑에 값이 리턴 되지 않음
		if(x==1)
			return 1;
		else
			return x*fact(x-1);//fact가 fact를 불러옴 - > 재귀호출 
		//사용할때는 종료시점을 확실하게 만들어줘야 infinite 상태가되지 않음 
		//얘를 불러서 다시 실행해라
	}
	
	public static void main(String[] ar){
		
		int x = fact(5);
				System.out.println("5! = "+x);
	}
}

//반복문 으로 출력 5!
/*
public class Exam03 {
	public static void main(String[] ar){
		int a=1;
		for(int i=1;i<=5;i++)
			a*=i;
		System.out.println("5! = "+a);
	}
}
*/