package practice170306;

public class Exam05 {
	public static void main(String[] args){
	/**
	 * 'A' <- ���� "A" <- ���ڿ�
	 * switch~case~break��
	 * �������ǹ�
	 * if�� ��Ÿ
	 * if���� �������� �����  ���ϱ� ������ �ӵ��� ������ �������� �ȴ�.
	 * switch(����:���� �Ǵ� ���� ���� ��Ÿ���� ����){
	 *  case ��1: 
	 *  ����1;
	 *  ����2;
	 *  [break;]
	 *  case ��2: 
	 *  ����3;
	 *  ����4;
	 *  ...
	 *  [default;]
	 *  �ֹι�ȣ 7��
	 */
		int jum=50;
		switch(jum/10){
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		default: System.out.println("��");
			
		}
	}
}
