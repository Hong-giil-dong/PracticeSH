package practice170306;

public class Exam05 {
	public static void main(String[] args){
	/**
	 * 'A' <- 문자 "A" <- 문자열
	 * switch~case~break문
	 * 다중조건문
	 * if문 오타
	 * if문은 종속적인 관계로  비교하기 때문에 속도가 현저히 느려지게 된다.
	 * switch(조건:정수 또는 문자 값을 나타내는 변수){
	 *  case 값1: 
	 *  내용1;
	 *  내용2;
	 *  [break;]
	 *  case 값2: 
	 *  내용3;
	 *  내용4;
	 *  ...
	 *  [default;]
	 *  주민번호 7번
	 */
		int jum=50;
		switch(jum/10){
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default: System.out.println("가");
			
		}
	}
}
