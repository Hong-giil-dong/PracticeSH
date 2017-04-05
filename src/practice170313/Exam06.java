package practice170313;
class Joystick{
    int left;
    int right;
     
    public void setMove(int left, int right){
        // 클래스 메소드를 통해 인자를 자기자신으로 재정의해주는 과정(일종의 인스턴스화)이다.
        this.right = right;  
        this.left = left;
    }
      
    public void Left(){
        System.out.println("왼쪽으로 " + this.left + " 이동");
    }
     
    public void Right(){
        System.out.println("오른쪽으로 " + this.right + " 이동");
    }
}
 
public class Exam06 {
    public static void main(String[] args) {
        // Joystick 객체(클래스를) joy라는 이름으로 인스턴스화 하는 과정
        Joystick joy = new Joystick();  
        joy.setMove(100,50);
        joy.Left();     
        joy.Right();      
    }
 
}