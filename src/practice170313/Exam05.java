package practice170313;
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
public class Exam05 {
	public static void main(String[] ar){
		Person man = new Person(950123,880102);
		Person woman = new Person(941125);
	}

}
