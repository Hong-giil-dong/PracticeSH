package practice170313;

public class Exam02 {
	int myMoney = 5000;
	int numOfApple=0;
	
	public void buyApple(int money){// 3000 �Էµ�
		Exam01 seller = new Exam01(); // ������� �ν��Ͻ� ����
		numOfApple += seller.SaleApple(money); //numofapple�� ���� �ν��Ͻ��� saleapple �޼ҵ忡 3000(money)�� �Է��� ���(17�� �ƴ϶� 3, �ֳ��ϸ� �ν��Ͻ� ������ ���� ���� �ҷ� ���°� �ƴ϶� �� Ŭ������ ���� �ҷ����°�)�� numofapple�� ����
		myMoney -= money; // ���� �ִ� ������-3000 �� ��  (2000)mymoney�� �Է�
	}
	
	public void showBuyResult(){
		System.out.println("���� �ܾ� : "+ myMoney);
		System.out.println("��� ���� : "+ numOfApple);
	}
}
