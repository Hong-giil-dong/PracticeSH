package practice170314;
/*
자바 메서드
<단원목표>
 - 메서드의 정의 및 용법
 - 메서드의 종류
 - 결과형 리턴값

1. 메서드의 정의 및 형식
   <문법>
   접근제한자 [지정예약어] 결과형_리턴값 메서드명(매개변수)[throws 예외]{
	사용할 내용-1
	사용할 내용-2
	사용할 내용-n
	[return 값]
}
1) 결과형 리턴값
 메서드가 내용부를 수행하고 나 후 결과로 돌아가는 값을 의미(자료형)
 void : 호출한 곳으로 넘겨줄 값이 없다.
 int, long, short, byte, float, double, String, char, boolean

 2) 메서드명
  main()메서드명을 제외하고 사용자가 임의로 지정한다.
 3) 매개변수
 4) throws 예외 : 예외처리나 예외 전가를 한다.


메서드(function)의 종류
 - Call By Name : 메서드의 이름으로 호출
 - Call By Value : 매개변수를 전달해서 처리
 - Call By Reference(Address) : 객체의 주소를 이용해 내용 데이터를 변화 시킨다.

Camel Case 적용 작명 규칙
1. 클래스 이름 규칙
 - 첫글자는 대문자로 시작한다.
 - 둘 이상의 단어가 묶어서 하나의 이름을 정할 경우, 새로 시작하는 단어의 첫글자는 대문자이다.
ex) circle + point = Circle_Point

2. 메소드와 변수의 이름 규칙
 - 메소드와 변수의 이름은 클래스의 이름과 구별되어야 한다.(가독성을 위하여)
 - 소문자로 작성 한다, 둘 이상의 단어를 묶어서 작성시 새로 시작하는 단어의 첫글자는 대문자
ex) add + Your + money = addYourMoney

상수의 이름 규칙(사용자 정의 상수)
final int COLOR=7;
final int COLOR_RAINBOW=7;
final int _COLOR=7;

package


회의 -> 클래스 디자인 -> 경로 설정(패키지)

접근제한자
private : 동일한 클래스 내부에서만 사용
[package]: 클래스 및 패키지에서만 접근(default)
protected : 상속받은 클래스에서 접근
public : 어디서든지 접근 가능

public > protected > package > private

클래스 사용법
클래스는 사용자 정의 자료형 이다. (스트링은 클래스형이기 때문에 기본 자료형에서 원래 빠진다)
클래스 객체를 생성하여 사용한다.

작성 규칙
클래스명 객체명 = new 클래스생성자(매개변수);


*/
public class Exam01 {

}
