package practice170326;
//메인클래스
public class Exam05 {
 public static void main(String[] args) {
  Product ex = new Car(); // 부모클래스의 타입으로 ex 참조변수 선언해서 자식클래스의 인스턴스로 초기화
  // 부모의 변수만을 사용하며 자식의 메소드를 사용함
  
  Car ex2 = (Car)ex;// 부모클래스 타입이었던 ex를 자식클래스로 형변환하여 자식클래스 타입 참조변수 ex2 선언한곳에 입력
 Car c= new Car();
 
   System.out.println(ex.productCode); //ex인스턴스의 productcode 변수를 출력 procode1212?
   //System.out.println(ex.price); //ex인스턴스의 price 변수를 출력 ? price 대응되지 않으므로 찾을수 없다  
   System.out.println(ex2.price); //ex인스턴스를  car로 형변환 하여 대응시킨것으로 참조변수가 이제 정확히 가리킬수 있으므로 price 10000이 출력됨?
   System.out.println(ex2.productCode); 
   System.out.println(c.price);
   System.out.println(c.productCode);
   ex.print(); // 부모클래스의 메소드를 사용 하므로 pro메소드 출력
   ex2.print(); // car메소드 출력
   c.print();
   
 }
}

//Car 클래스
class Car extends Product{
 
 int price = 10000; // 자식클래스에서 선언된  price변수
 String productCode="CarCode1212";   // 자식클래스에서 선언된  productcode변수
   public void print(){ // 자식 클래스의 메소드
    System.out.println("Car메소드");
   }
 
}

// Product 클래스
class Product {
 
 String productCode="ProCode1212"; //부모 클래스에서 선언된 변수 productcode
 
 public void print(){// 부모클래스의 메소드
  System.out.println("Pro메소드"); 
 }
 
}
//결국 


