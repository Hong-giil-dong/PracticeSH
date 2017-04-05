package practice170310;
//메소드를 사용 하는경우
//1 반복되는 함수를 한번만 쓰기 위해
//2 복잡할때 빼서 사용


//메소드를 사용후
public class Exam02 {
	
	public static void PrintX(){
		for(int i=0;i<10;i++)
			System.out.print("*");
	}
	
	public static void main(String[] ar){
		
		PrintX(); //call by name
		System.out.print("\nHello\n");
		PrintX();
		System.out.print("\nJAVA\n");
		PrintX();
	}
}



/* 메소드를 쓰기전
public class Exam02 {
	public static void main(String[] ar){//이곳의 aa는 가인수
		
		for(int i=0;i<10;i++)
			System.out.print("*");
		
		System.out.print("\nHello\n");
		
		for(int i=0;i<10;i++)
		System.out.print("*");
	}
}

*/