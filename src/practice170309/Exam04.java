package practice170309;
/*
 * Bouble Sorting
 */
public class Exam04 {
	public static void main(String[] ar){
		int[] data ={1,5,6,4,7};
		int f=1;
		for(int i=0;i<data.length-1;i++){
			f=1;
			for(int j=0;j<(data.length-1)-i;j++){
				if(data[j] > data[j+1]){
					int t=data[j];
					data[j]=data[j+1];
					data[j+1] = t;
					f=0;
					
				}
			}
			
			System.out.print((i+1)+"��° :\t");
			for(int j=0;j<data.length;j++)
				System.out.print("\t"+data[j]);
			System.out.println();
			if(f==1) break;
		}
	}
}
