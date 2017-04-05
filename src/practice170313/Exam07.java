package practice170313;
/* camel case 적용 작명 규칙
 * 1. 클래스 이름 규칙
 * - 첫글자는 대문자로 시작한다.
 * -둘 이상의 단어가 묶어서 하나의 이름을 정할 경우, 새로 시작하는 단어의 첫글자는 대문자로 쓴다.
 * ex) circle + point = Circle_Point
 * 2. 메소드와 변수의 이름 규칙
 * - 메소드와 변수의 이름은 클래스의 이름과 구별되어야 한다.(가독성을 위하여)-> 디폴드 생성자는 제외됨
 * - 소문자로 작성 한다. 둘 이상의 단어를 묶어서 작성시 새로 시작하는 단어의 첫글자는 대문자
 * ex add + your + money = addYourMoney
 * 3. 상수의 이름 규칙(사용자 정의 상수를 말하는거임)
 * final int COLOR=7;
 * final int COLOR_RAINBOW=7;
 * final int _COLOR=7; 
 * MAX_SPEED
 * 
 * package
 * 
 * 회의 -> 클래스 디자인 -> 경로 설정
 * 
 * 접근제한자
 * private : 동일한 클래스 내부에서만 사용
 * [package] : 클래스 및 패키지에서만 접근(접근 제한자를 삭제 했을때 default로 이게 설정된다)
 * protected : 클래스 및 패키지 및 상속 받은 클래스에서 접근 가능
 * public : 어디서든지 접근 가능
 * 위부터 아래쪽 순서대로 권한이 커짐
 */

import java.awt.*;

class Exam07 {
	
}
