package practice170313;

public class Exam01 {
	int numOfApple=20;
	int myMoney=0;
	
	public int SaleApple(int money){
		int num = money / 1000;
		numOfApple-=num;
		myMoney += money;
		return num;
	}
	
	public void showBuyResult(){
		System.out.println("���� ��� : "+ numOfApple);
		System.out.println("�Ǹ� ���� : "+ myMoney);
	}
}