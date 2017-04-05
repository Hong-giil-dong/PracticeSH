package practice170323;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Exam02 {
	public static void main(String[] args) {
		try{
			BufferedReader in = new BufferedReader(
				new FileReader(
				new File(
				new File("c:\\workspace\\java"),"java.txt")));
			String data;
			data = in.readLine();
			in.close();
			System.out.println("data = " + data);
		}catch(Exception e){}
	}

}
