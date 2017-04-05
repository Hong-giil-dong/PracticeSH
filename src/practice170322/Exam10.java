package practice170322;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 키보드로 1바이트의 정보를 입력 받아서 파일에 저장 하시오.
 * 문자열의 문자 하나하나를 바이트로 바꾸는 것이 핵심이다.
 */
public class Exam10 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java\\abc.txt");
		// 매개변수 ()를 지정한 File클래스의 인스턴스를 생성해서 초기화후 file타입의 변수 f로 참조값을 저장
		try{
			FileInputStream fis = new FileInputStream(FileDescriptor.in);
			// 매개변수 filedes)를 지정한  fileinputstream 클래스의 인스턴스를 생성해서 초기화후 같은 타입의 변수 fis로 저장
			BufferedInputStream bis = new BufferedInputStream(fis);
			// 매개변수 (fis인스턴스)를 지정한  BufferedInputStream 클래스의 인스턴스를 생성해서 초기화후 같은 타입의 변수 bis로 저장
			DataInputStream dis = new DataInputStream(bis);
			// 매개변수 (bis인스턴스)를 지정한  DataInputStream 클래스의 인스턴스를 생성해서 초기화후 같은 타입의 변수 dis로 저장
			byte[] by = new byte[65536]; // by의 배열 선언
			int i=0;
			//byte[] buffer = new byte[1024];
			//int readcount = 0;
			
			try{
				FileOutputStream fos = 
						new FileOutputStream(FileDescriptor.out);
				FileOutputStream fos1 = 
						new FileOutputStream(f);
				byte[] data = {66,68,70,72,(byte)'!'};
				fos.write(data);
				fos1.write(data);
			}catch(Exception e){}
			System.out.println("실행 끝!!!");
			
			do{ // 일단 아래의 내용 실행
				System.out.print("입력(Q:종료) : "); // 출력
				data[i] = dis.readByte(); // 바이트타입의 by인스턴스배열에 dis인스턴스의 readbyte메소드를  저장
				dis.readByte(); // dis.readByte메소드를 두번 실행
				dis.readByte();
				
				if(by[i] == (byte)'Q'){ // by인스턴스의 값이 Q를 byte로 형변환 한 값과 같은 때 true
					break;
				}
				i++;
			}while(true);
			
			FileOutputStream fos1 = 
					new FileOutputStream(f);
			for(int j=0;j<i;j++){
				fos1.write(by[j]);
				System.out.println(by[j]);
			}
			
		
		}catch(Exception e){}
		
		/*
		try{
			FileOutputStream fos = 
					new FileOutputStream(FileDescriptor.out);
			FileOutputStream fos1 = 
					new FileOutputStream(f);
			byte[] data = {66,68,70,72,(byte)'!'};
			fos.write(data);
			fos1.write(data);
		}catch(Exception e){}
		System.out.println("실행 끝!!!");
		*/
	}
}
