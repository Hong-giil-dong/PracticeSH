package practice170313;
class Joystick{
    int left;
    int right;
     
    public void setMove(int left, int right){
        // Ŭ���� �޼ҵ带 ���� ���ڸ� �ڱ��ڽ����� ���������ִ� ����(������ �ν��Ͻ�ȭ)�̴�.
        this.right = right;  
        this.left = left;
    }
      
    public void Left(){
        System.out.println("�������� " + this.left + " �̵�");
    }
     
    public void Right(){
        System.out.println("���������� " + this.right + " �̵�");
    }
}
 
public class Exam06 {
    public static void main(String[] args) {
        // Joystick ��ü(Ŭ������) joy��� �̸����� �ν��Ͻ�ȭ �ϴ� ����
        Joystick joy = new Joystick();  
        joy.setMove(100,50);
        joy.Left();     
        joy.Right();      
    }
 
}