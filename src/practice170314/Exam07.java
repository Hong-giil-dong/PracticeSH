package practice170314;

/*
 * 접근 제한자(예약어) : 외부로부터의 접근을 제어 하기 위한 목적으로 사용된다.
 * 종류 
 * private : 자신의 클래스내에서만 사용 되도록 제한
 * protected : 자신의 클래스와 상속받은 하위 클래스 그리고 동일한 파일내부 및 동일한 폴더에서만 사용
 * package : default 생략가능, 동일 클래스, 동일한 파일, 동일한 패키지(폴더) 내부에서만 사용
 * public : 객체가 선언이 되어 있으면 어디서든 사용이 가능하다
 * 사용가능 범위
 * 1. 멤버 필드
 * 2. 멤버 메소드
 * 3. 생성자 메소드
 * 4. 클래스


 */
class Person{
	/**디폴트 생성자의 경우 멤버변수의 초기화에 주로 사용한다.
	 * 
	 */
	private int perID;//private로 선언된 변수는 같은 클래스일 경우에만 사용가능
	private int milID;
	
	Person(){}//디폴트 일경우에만 가능
	
	
	public Person(int pID, int mID){
		perID = pID;
		milID = mID;
	}
	
	public Person(int pID){
		perID = pID;
		milID = 0;
	}
	
	public void showInfo(){
		System.out.println("민번 : " + perID);
		
		if(milID != 0)
			System.out.println("군번 : " + milID);
		else
			System.out.println("군과 상관 없음");
				
	}
}
public class Exam07 {
	public static void main(String[] ar){
		Person man = new Person(950123,880102);
		Person woman = new Person(941125);
	}

}