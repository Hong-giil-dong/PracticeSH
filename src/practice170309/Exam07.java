package practice170309;

public class Exam07 {
	
	public static void main(String[] ar){
		int[][] data = new int[5][5];
		int cnt = 0;
		
		for(int i=0;i<5;i++){
			cnt=1;

			for(int j=i;j<5;j++){
				data[j][i]=cnt;
				cnt++;

			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
		System.out.println();		
		
		for(int i=4;i>=0;i--){
			cnt=1;
			for(int j=4-i;j<5;j++){
				data[j][i]=cnt;
				cnt++;
			}
		}
		for(int i=0;i<5;i++){
			System.out.println();
			for(int j=0;j<5;j++){
				if(data[i][j]<4){
					System.out.print(data[i][j]);
				}

			else
				System.out.print(" ");
	
/*
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				
				System.out.print(data[i][j]);
			}
			System.out.println();
			

		}
		*/

	}
		}
	}
}
