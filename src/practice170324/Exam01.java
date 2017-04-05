package practice170324;
/*
 * 예외처리
 * 예외 : 특정 규칙이나 범위에서 어긋남을 의미 한다.
 * 		예상치 못한 일로 인한 에러를 의미 한다.
 * 1. throw : 강제 예외 발생
 * 2. throws : 예외를 전가시킴
 * 3. try - catch - finally : 예외 처리
 *
 * 예외 처리 용도
 * 1. 예외 발생시 정상 종료
 * 2. 예외 내용 보고 // 꼭 들어가야함
 * 3. 예외 무시
 * 4. 예외 발생시 대안적인 결과값을 대입 //
 * 
 * 예외 처리 형식
 * try{
 *		예외 발생 예상 코드를 이곳에 집어넣음 
 *	} catch(예외발생 클래스 객체){
 *		예외 발생시 처리할 내역 : 
 * 	} catch(예외발생 클래스 객체){ // 여러종류의 exception이 발생할 수 있기 때문에 catch는 여러개가 있어도 상관없다.
 *		예외 발생시 처리할 내역 : 
 *	} finally{
 *		예외와 상관없이 처리해야 할 내용
 *	}
 */
public class Exam01 {
	public static void main(String[] ar) {
		try{
		System.out.print("X = ");
		int x = System.in.read(); //에러가 남, 이 에러는 뻔한 ioeexception이기때문에 바로 대처가 가능하다
		// 하지만 우리는 보통 어떤 에러가 날지 예상이 불가능함
		}catch(Exception e){
			System.out.println("Error = " + e.toString());
			System.exit(0);
		}
		//catch(IOException e){} // 위의 Exception메소드에 포함된 내용이므로 필요 없다는 의미임
		
	}
}
