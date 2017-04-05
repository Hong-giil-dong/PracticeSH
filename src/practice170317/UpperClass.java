package practice170317;

public class UpperClass {
	int x;
	int y;
	public UpperClass(){
		x=10;
		y=20;
	}
	public UpperClass(int x, int y)
	
	public UpperClass(int x){
		this(); //오버로딩된 upperclass 둘중에 () <-- 아무것도 없는 메소드를 불러오라는 의미
		this.x = x;
	} 
}
