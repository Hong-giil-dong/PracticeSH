package practice170323;
import java.io.*;
import java.util.*;
public class Exam07 {

	public static void main(String[] args) throws Exception{
		File dir = new File("c:\\workspace\\java2");
		File file = new File(dir, "Address.txt");
		Vector vc = new Vector(); //벡터 타입 vc선언 후 초기화
		if(file.exists()){ //파일이 존재할 경우 아래 실행
			ObjectInputStream ois = new ObjectInputStream( // 객체입력 스트림 인스턴스 생성해서 거기에 아래 내용 집어넣음
					new BufferedInputStream( //버퍼에 집어 넣고
							new FileInputStream(file)));// 파일에 있는 내용을 불러와서
			// 결과적으로 ois에 이미 저장되어 있던 파일 내용이 대기
			vc = (Vector)ois.readObject(); //ois에 있는 내용을 읽어들여와서 vector로 형변환 후 vc에 저장
			ois.close();//vc변수에 필요한 값들을 전부 저장했으므로 스트림 종료
		}
		Scanner sc = new Scanner(System.in); //스캐너 클래스 불러와서 초기화
		while(true){
			System.out.print("1. 입력  2. 조회  3. 종료 :");
			int choose = Integer.parseInt(sc.nextLine());
			if(choose==1){
				Exam08 ae = new Exam08(); // Exam08인스턴스 생성
				vc.add(ae); // vc에 입력된 값을 추가시켜줌
				System.out.println(".");
			}else if(choose == 2){
				System.out.println("이름\t전화\t주소");
				for(int i=0;i<vc.size();i++){ // 벡터vc의 크기만큼 실행
					Exam08 imsi = (Exam08)vc.elementAt(i); //벡터vc에 저장된 데이터를 i값 인덱스를 이용해서 불러온 값을 리턴함.
					// 그리고 Exam08로 형변환 해서 저장
					imsi.disp(); //imsi 인스턴스의 메소드를 실행
				}
			}else if(choose == 3){
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)));
				oos.writeObject(vc);
				oos.close();
				System.exit(0);
			}
		}

	}

}
