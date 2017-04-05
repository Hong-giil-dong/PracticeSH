package practice170310;
/**
 * 자바 메서드
 * <단원목표>
 * - 메서드의 정의 및 용법
 * - 메서드의 종류
 * - 결과형 리턴값
 * 
 * 1. 메서드의 정의 용법
 * <문법>
 * 접근제한자 [지정예약어] 결과형_리턴값 메서드명(매개변수)[throws 예외}{
 * 		사용할 내용-1
 * 		사용할 내용-2 
 * 		사용할 내용-n
 * 		[return 값]
 * }
 * 결과형 리턴값
 *  메서드가 내용부를 수행하고 난 후 결과로 돌아가는 값을 의미(자료형)
 *  ex) void : 호출한 곳으로 넘겨줄 값이 없다.
 *  int, long, short, byte, float, double, String, char, boolean
 *  
 *  자바는 포인터가 없기때문에 신경 쓸필요가 없다?
 *  
 * 2. 메서드명
 * main()메서드명을 제외하고 사용자가 임의로 지정한다.
 * 메인 메소드명은 없어도 되거나 1개만 존재하여야 한다
 * 메인 메소드가 필요한 이유는 시작 위치를 알기 위해서이다.
 *
 *3. 매개변수
 * 4. throws 예외 : 예외처리나 예외 전가를 한다.
 * 
 * 메서드(function)의 종류
 * -Call by Name : 메소드의 이름으로 호출
 * -Call by Value : 매개변수를 전달해서 처리
 * -Call by Reference(Address) : 객체의 주소를 이용해 내용 데이터를 변화 시킨다.
 * 많이 쓰는것은 name value
 */
/*
public class Exam01 {
	public int abc(int a){
		return 0; // int만 쓰면 안됨 리턴값을 줘야함
	}
}
*/

public class Exam01 {
	public static void aaa(int aa){//이곳의 aa는 가인수, call by value
		int a = bbb();
		System.out.println("X = " + (aa+a));
		return;
	}
	public static int bbb(){
		int x = 10;
		return x;
	}
	public static void main(String[] ar){//이곳의 5는 실인수
		aaa(5);
	}
}



