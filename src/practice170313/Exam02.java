package practice170313;

public class Exam02 {
	int myMoney = 5000;
	int numOfApple=0;
	
	public void buyApple(int money){// 3000 입력됨
		Exam01 seller = new Exam01(); // 셀러라는 인스턴스 생성
		numOfApple += seller.SaleApple(money); //numofapple에 셀러 인스턴스의 saleapple 메소드에 3000(money)를 입력한 결과(17이 아니라 3, 왜냐하면 인스턴스 생성시 원래 값을 불러 오는게 아니라 이 클래스의 값을 불러오는것)를 numofapple에 저장
		myMoney -= money; // 원래 있던 돈에서-3000 된 값  (2000)mymoney에 입력
	}
	
	public void showBuyResult(){
		System.out.println("현재 잔액 : "+ myMoney);
		System.out.println("사과 개수 : "+ numOfApple);
	}
}
