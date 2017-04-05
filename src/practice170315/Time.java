package practice170315;

public class Time {
	
	//시간 클래스 안에 구성요소들을 선언
	private int hour;
	private int minute;
	private float second;
	
	
	public int getHour() {//??
		return hour;//?
	}
	
	public void setHour(int h) {
		if (h<0 || h>23)
			return;
		hour=h;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int m) {
		if (m<0 || m>59)
			return;
		minute=m;
	}

	public float getSecond() {
		return second;
	}
	
	public void setSecond(float s) {
		if (s<0.0f || s>59.99f)
			return;
		second=s;
	}
}
