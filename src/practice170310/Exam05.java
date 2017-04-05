package practice170310;
import java.io.*;

//범용 메소드 작성 예
public class Exam05 {
	public static String getIrum(String str) throws IOException{
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print(str + " : ");
		String irum = in.readLine();
		return irum;
		
	}
}
