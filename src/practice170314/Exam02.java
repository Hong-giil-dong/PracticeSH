package practice170314;
/*
 * 클래스의 기본 구성
 * - 서로 다른 자료형도 하나의 그룹으로 묶어서 사용(구조체)
 * - 결과를 출력 하는 행위를 집어 넣어 완성한 그룹(Class)
 * 1. 변수 : 기억장소 이름
 * 2. 배열 : 동일한 자료형의 변수를 묶어서 표현
 * 3. 구조체
 * 4. 클래스 : Method(Function, Sub Routin)의 수행을 포함
 * 
 * OOP(객체지향 프로그램) object oriented programing : 
 * 
 * 클래스 작성형식 -1
 * 
 * 접근제한자 지정예약어 class 클래스명 [extends 상위클래스 implements 상위인터페이스] // 클래스 상속은 1개만 가능인터페이스 상속은 하나이상가능
 * {
 * 실 내용 기술
 * }
 *   -> 접근제한자와 지정예약어는 생략이 가능하다
 * 
 * 클래스 작성형식 -2(단순클래스)
 * class 클래스명
 * {
 * 실내용 기술
 * }
 * 
 * 클래스에 포함되는 멤버들
 * 자바클래스  = Nested Class+Field+Construct+Method
 * 1) Nested Class : 중첩클래스
 * 2) Field : 변수
 * 3) Construct : 생성자, 일반적으로 각 필드들의 데이터 값을 초기화 하는 역할을 한다. 메소드와 혼동하면 안됨
 * 
 * 생성자
 * 작성규칙
 * 접근제한자 클래스명(매개변수) throws 예외처리{
 * 	멤버 필드 초기화 작업
 * }
 * 생성자의 특징
 * 1) 클래스명과 동일(대소문자까지)
 * 2) 결과형 리턴값을 가지지 않는다.
 * 3) 클래스 객체가 생성될 때 반드시 하나의 생성자가 호출된다.
 * 4) 멤버 필드의 값을 초기화 한다.
 * 5) 하나의 클래스 내부에 생성자가 하나도 없으면 자동적으로 default 생성자가 있는 것으로 간주
 * default 생성자 : 매개변수와 내용이 없는 생성자
 * 6) 하나의 클래스에는 매개변수의 개수와 자료형이 둘인 생성자들을 여러개 만들 수 있다.(생성자 오버로딩)
 * 7) 생성자의 첫번째 라인으로 this (매개변수)생성자를 사용하여 또 다른 생성자 하나를 호출할 수 있다.
 */


import java.io.*;

public class Exam02 {
	private int[] sub;
	private float avg;
	
	public Exam02(){
		sub = new int[14];
		avg = 0.0f;
	}
	
	public void calc(){ //Method
		int tot=0;
		for(int i=0;i<sub.length;i++)
			tot += sub[i];
		avg = tot / sub.length;
	}
	
	public static class Exam02_sub{ //Nested class
		private String[] subname = {"국어", "영어","수학"};
		public String getSubname(int x){
			return subname[x];
		}
	}
}

