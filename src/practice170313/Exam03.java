package practice170313;

public class Exam03 {
	public static void main(String[] ar){
		Exam01 seller = new Exam01(); //������� �ν��Ͻ� ����
		Exam02 buyer = new Exam02(); // ���̾� �ν��Ͻ� ����
		
		buyer.buyApple(3000); //���̾� �ν��Ͻ����� buyApple �޼ҵ忡 3000(money) �Է�
		//seller���� 3000�� ��ġ ��� ����
		
		System.out.print("���� �������� ���� ��Ȳ");
		buyer.showBuyResult();// ���̾� �ν��Ͻ��� showbuyresult �޼ҵ带 �ҷ���
		
		System.out.print("���� �Ǹ����� ���� ��Ȳ");
		seller.showBuyResult();// ���� �ν��Ͻ��� showbuyresult �޼ҵ带 �ҷ���
	}
}
