package practice170308;
/*
 * 선언
 * 입력
 * 처리
 * 출력
 * 출력값 먼저 분석
 * 
 * 배열에 일정한 양의 수가 입력 되어잇을때 범위 안에서 가장 큰 값과 가장 작은 값을 구하시오.
 * 9,15,10,7,6,30,21
 * 
 */

public class Exam03 {
	public static void main(String[] args){
		int[] data = {5,15,10,7,6,30,21};
		//int max=0, min=100; // 반드시 초기값이 있어야함
		int max = data[0], min=data[0]; //데이터가 사전 등록되어있을경우에만 사용 가능한 방법
		
		for(int i=0;i<data.length;i++){//데이터의 길이가지만 수행하게됨
			if(max < data[i])
				max = data[i];
			if(min>data[i])
				min = data[i];
			}
		System.out.println(min+" "+max);
	}
	
	
}
