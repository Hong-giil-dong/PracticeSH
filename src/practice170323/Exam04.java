package practice170323;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 파일의 입출력을 이용하여 주소록 프로그램을 완성하시오.
 * 1. 입력  2. 조회  3. 종료 : 
 * 1.
 * 이름 :
 * 전화 :
 * 주소 :
 * 2.
 * 파일의 전체 내용 출력
 * 단, 객체를 활용하여 작성 하시오.
 */
public class Exam04 {
	
	
	public static void main(String[] ar){
		String data="";
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		try{
			
			PrintWriter out=null;
			/*= new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(
					  new File(
					  new File("c:\\workspace\\java"),"address.txt"))));
			*/
			
			BufferedReader in=new BufferedReader(
					new FileReader( 
					new File(
					new File("c:\\workspace\\java"),"address.txt")));
				
			
			
			do{
				System.out.print("1. 입력  2. 조회  3. 종료 : ");
				int choose = Integer.parseInt(sc.nextLine());
				switch(choose){
				case 1:
					out = new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(
					  new File(
					  new File("c:\\workspace\\java"),"address.txt"))));
					System.out.print("이름 : ");
					String name = sc.nextLine();
					System.out.print("전화 : ");
					String tel = sc.nextLine();
					System.out.print("주소 : ");
					String addr = sc.nextLine();
					 
					out.println(name+","+tel+","+addr);
					out.close();
					
					FileOutputStream fos = new FileOutputStream(out);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					ObjectOutputStream oos = new ObjectOutputStream(bos);
					
					oos.writeObject(out);
					oos.close();
					
					break;
				case 2:// 문제 나중에 저장된 것만 기록됨 
					
					while((data = in.readLine()) != null){ // data 안의 값이 없을때 까지 아래를 실행
						int first = data.indexOf(','); // 
						int last = data.lastIndexOf(','); //
						cnt++; //반복문이 실행 될때마다 cnt 값은 1씩 증가
						System.out.println("순번 : " + cnt);
						System.out.println("이름 = " + data.substring(0, first));
						System.out.println("전화 = " + data.substring(first+1, last));
						System.out.println("주소 = " + data.substring(last+1, data.length()));
						System.out.println("\n\n");			
											
					}
					
					break;
				case 3:
					System.out.println("작업 종료");
					
					in.close();
					System.exit(0);
				}
			}while(true);
			
		}catch(Exception e){
			
		}
	}
}
