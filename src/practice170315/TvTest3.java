package practice170315;
/*
class Tv {
	//Tv�� �Ӽ�(�������)
	String color;		//����
	boolean power;		//��������(on/off)
	int channel;		//ä��
	
	//Tv�� ���(�޼���)
	void power() {power = !power;}	//Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}	//Tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() {-`-channel;}	//Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
}
*/
 
class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();	// Tv t1; t1 = new Tv();�� �ѹ������� ����
		Tv t2 = new Tv();
		System.out.println("t1�� ä�ΰ��� " + t1.channel + "�Դϴ�");
		System.out.println("t2�� ä�ΰ��� " + t2.channel + "�Դϴ�");
		
		t2 = t1; //t2�� ��(���⼭ �� ���� �����ϴ� '�ּ�'�̴�)�� t1�� ������ �����ϴ� ���̴�-> �� �����ּҰ� t1�� �����ּҷ�
		t1.channel = 7;		//ä�ΰ��� 7�� �Ѵ�
		System.out.println("t1�� ä�ΰ��� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� ä�ΰ��� " + t1.channel + "�Դϴ�");
		System.out.println("t2�� ä�ΰ��� " + t2.channel + "�Դϴ�");
	}
}