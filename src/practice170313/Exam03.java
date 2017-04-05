package practice170313;

public class Exam03 {
	public static void main(String[] ar){
		Exam01 seller = new Exam01(); //셀러라는 인스턴스 생성
		Exam02 buyer = new Exam02(); // 바이어 인스턴스 생성
		
		buyer.buyApple(3000); //바이어 인스턴스에서 buyApple 메소드에 3000(money) 입력
		//seller에게 3000원 어치 사과 구매
		
		System.out.print("과일 구매자의 현재 상황");
		buyer.showBuyResult();// 바이어 인스턴스의 showbuyresult 메소드를 불러옴
		
		System.out.print("과일 판매자의 현재 상황");
		seller.showBuyResult();// 셀러 인스턴스의 showbuyresult 메소드를 불러옴
	}
}
