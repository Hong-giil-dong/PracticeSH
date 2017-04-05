package practice170309;

public class Exam06 {
	
	public static void main(String[] ar){
		int[][] data = new int[5][5];
		int cnt = 0;
		
		for(int i=0;i<5;i++){
			cnt=1;
			//System.out.println();
			for(int j=i;j<5;j++){
				data[j][i]=cnt;
				cnt++;
				//System.out.print(data[j][i]);
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
		
	}

}
