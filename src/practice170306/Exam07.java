package practice170306;
/**
 * 반복문 : 일정구간은 정해진 횟수 또는 조건에 만족 할 때까지 순환을 한다.
 * 1. for : 횟수
 * 	문법)
 * for(초기값;최종 조건식;증감식){
 * ....
 * }
 * 2. while : 조건
 * while(조건){
 *	조건이 참인 동안에만 반복
 * ....
 * }
 * while 조건문은 조심해야 됨
 * 1부터 100까지 홀수의 합
 * 
 * 		for(int i=0;i<5;i++) //제어문 끝에는 세미콜론이 안들어간다, 0번부터 되도록 출발하는게 좋다, 포문 안에서 쓴 선언은 이외에는 사용을 못한다
		System.out.println("*");
 */
public class Exam07 {
	public static void main(String[] ar){
		
	int a=0;
		for(int i=1;i<=100;i+=2)
			a+=i; //sum=sum+i;
		System.out.println("sum = " + a);
				
		
	}
}
