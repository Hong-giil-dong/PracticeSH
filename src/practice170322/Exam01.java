package practice170322;
// 자바의 입출력
// file class 
// 파일에 대한 입력과 출력을 처리하기 위해 사용된다.
// fields
// String pathSeparator - 경로 구분자 (:)
// char pathSeparatorChar : 경로에 대한 구분자 char 형
// String separator : 파일 경로 구분자(\)
// char separatorChar : 
// c:\work\data\abc.txt
// 1byte i/o (1바이트 입출력이므로 한글은 안됨)
// text i/o
// object i/o
/*
import java.io.File;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) {
		File f = new File("c:\\work\\java");
		if(f.exists())
			f.delete();
		
		//예외 처리
		try{
			//실 처리 내용 입력
			Thread.sleep(3000);
		}catch(Exception e) {
			//예외 상황 처리
			e.printStackTrace();
			
		}System.out.println("시작");
	}
}
*/

import java.io.File;

public class Exam01 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java"); //매개변수를 파일 경로로 하는 file메소드의 인스턴스를 생성해서 참조변수 f값에 저장하고 초기화
		if(f.exists()){	// f 인스턴스의 exists메소드를 실행한 반환값이 true 이면 아래 문장 실행
			System.out.println("경로 존재"); // 경로 존재를 출력
			f.delete(); //f 인스턴스의 delete 메소드를 실행
		}
		//예외 처리
		try{ // try 
			//실 처리 내용 입력
			Thread.sleep(3000); // 쓰레드 클래스의 sleep 메소드를 3000 매개변수 값으로 실행
			
		}catch(Exception e){ // ?
			//예외 상황 처리
			e.printStackTrace(); // ?
		}
		
		System.out.println("시작"); // 예외처리 끝나고 시작을 출력
		File f1 = new File(f, "abc.txt"); // f참조변수와 abc.txt를 매개변수로 하는 새로운 파일 인스턴스를 생성해서 초기화하고 f1참조변수에 매칭
		
		try{ // 
			Thread.sleep(3000);
		}catch(Exception e){ // 예외사항 처리 하는 곳
			
		}
		
		if(!f.exists()){ // f인스턴스의 exists 메소드의 부정 값이 True 일경우 아래 실행 
			System.out.println("경로 생성"); // 경로 생성 문자열을 출력
			f.mkdir(); // f 인스턴스의 mkdir 메소드를 실행
		}
		
		try{ // ? 
			System.out.println("파일 생성중...."); // 파일 생성중을 출력
			f1.createNewFile(); // 파일 속성이 읽기 / 쓰기 전용
			Thread.sleep(3000); // 쓰레드 클래스의 sleep메소드를 3000 매개변수로 실행
			System.out.println("파일 생성 성공"); // 파일 생성 성공 출력
		}catch(Exception e){ // 예외처리 클래스를  참조변수 e값에 저장
			e.printStackTrace(); // exception의 인스턴스의 printStackTrace 메소드를 실행
		}finally{ // ?
			if(f1.canRead()) // f1 인스턴스의 
				f1.setWritable(false);
		}
		
		File f2 = new File("c:\\workspace\\java\\abc.txt");
		System.out.println("파일명 : " + f2.getName());
		System.out.println("파일 경로 : " + f2.getPath());
		System.out.println("파일 경로 : " + f2.getParent());
		System.out.println("파일 크기 : " + f2.length());
		//System.out.println("파일 작성일 : " + new java.util.Date(f.lastModifield()));
		
		File abc = new File("c:\\workspace\\java\\abc.txt");
		if(abc.exists()){
			System.out.println("파일 삭제");
			abc.delete();
		}
		
			
	}

}

//파일 없으면 만들고
























