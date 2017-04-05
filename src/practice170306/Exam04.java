package practice170306;

public class Exam04 {
	public static void main(String[] ar){
		int data[] = {50,60,35,80,90,200,300,123,4233};
		int i, j, t;
		
		for(i=0;i<data.length-1;i++){	//length-1?
			for(j=i;j<data.length;j++){
				if(data[i] > data[j]){
					t=data[i];
					data[i]=data[j];
					data[j]=t;
					
				}
			}
		}
		for(i=0;i<data.length;i++)
			System.out.println(data[i]);
		
	}
}
