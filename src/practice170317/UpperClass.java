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
		this(); //�����ε��� upperclass ���߿� () <-- �ƹ��͵� ���� �޼ҵ带 �ҷ������ �ǹ�
		this.x = x;
	} 
}
