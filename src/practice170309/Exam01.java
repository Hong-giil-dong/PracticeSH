package practice170309;
/**
 * Sorting 
 *오름차순이 스탠다드
 *자바는 기본적로
 *셀렉션 버블
 *셀렉션 교환법
 *Selection Sorting 선택 정렬
 */
public class Exam01 {
	public static void main(String[] args){
		int[] data={7,3,6,2};
		System.out.print("정렬전 : ");	
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
		}

		System.out.println("정렬후 : ");	
		for(int i=0;i<data.length;i++){

			for(int j=i+1;j<data.length;j++){
				if(data[i]>data[j]){
					int t = data[i];
					data[i]=data[j];
					data[j]= t;
				}
			}

			System.out.print(data[i]+"\t");
		}

	}

}
