package practice170326;
//����Ŭ����
public class Exam05 {
 public static void main(String[] args) {
  Product ex = new Car(); // �θ�Ŭ������ Ÿ������ ex �������� �����ؼ� �ڽ�Ŭ������ �ν��Ͻ��� �ʱ�ȭ
  // �θ��� �������� ����ϸ� �ڽ��� �޼ҵ带 �����
  
  Car ex2 = (Car)ex;// �θ�Ŭ���� Ÿ���̾��� ex�� �ڽ�Ŭ������ ����ȯ�Ͽ� �ڽ�Ŭ���� Ÿ�� �������� ex2 �����Ѱ��� �Է�
 Car c= new Car();
 
   System.out.println(ex.productCode); //ex�ν��Ͻ��� productcode ������ ��� procode1212?
   //System.out.println(ex.price); //ex�ν��Ͻ��� price ������ ��� ? price �������� �����Ƿ� ã���� ����  
   System.out.println(ex2.price); //ex�ν��Ͻ���  car�� ����ȯ �Ͽ� ������Ų������ ���������� ���� ��Ȯ�� ����ų�� �����Ƿ� price 10000�� ��µ�?
   System.out.println(ex2.productCode); 
   System.out.println(c.price);
   System.out.println(c.productCode);
   ex.print(); // �θ�Ŭ������ �޼ҵ带 ��� �ϹǷ� pro�޼ҵ� ���
   ex2.print(); // car�޼ҵ� ���
   c.print();
   
 }
}

//Car Ŭ����
class Car extends Product{
 
 int price = 10000; // �ڽ�Ŭ�������� �����  price����
 String productCode="CarCode1212";   // �ڽ�Ŭ�������� �����  productcode����
   public void print(){ // �ڽ� Ŭ������ �޼ҵ�
    System.out.println("Car�޼ҵ�");
   }
 
}

// Product Ŭ����
class Product {
 
 String productCode="ProCode1212"; //�θ� Ŭ�������� ����� ���� productcode
 
 public void print(){// �θ�Ŭ������ �޼ҵ�
  System.out.println("Pro�޼ҵ�"); 
 }
 
}
//�ᱹ 


