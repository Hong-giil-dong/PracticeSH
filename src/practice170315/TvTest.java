package practice170315;

class Tv {
	//Tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;
	
	//Tv�� ���(�޼���)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class TvTest {
	public static void main(String[] args) {
		Tv t;				//Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv();		//Tv�ν��Ͻ��� �����Ѵ�.
		t.channel = 7;		//Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�
		t.channelDown();	//Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
	}
}
