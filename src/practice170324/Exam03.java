package practice170324;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Exam03  extends Exception {
	private String message;
	private Throwable cause;
	
	public Exam03(){
		super();
	}
	
	public Exam03(String msg){
		super(msg);
		this.message = msg;
	}
	
	public Exam03(Throwable cause){
		super(cause);
		this.cause = cause;
	}
	
	public Exam03(String msg, Throwable cause){
		super(msg, cause);
		this.message = msg;
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	
	public void printStackTrace(){
		System.out.println("Error 발생" );
		System.out.println("에러 사유 : " + this.message );
		System.out.println("관련 클래스 : " + this.cause );
		System.out.println("Error 출력 끝" );
		super.printStackTrace(System.out);
	}
	
	
	public void printStackTrace(PrintStream out){
		super.printStackTrace(out);
	}
	
	public void printStackTrace(PrintWriter out){
		super.printStackTrace(out);
	}
	
	
	

}







