package practice170326;
/*
import java.util.*;

class Dog extends Animal {

	@Override
	void bark() {
		// TODO Auto-generated method stub
		super.bark();
		System.out.println("멍멍"); // 동물중 개만 할말
	}

}

class Cat extends Animal {

	@Override
	void bark() {
		// TODO Auto-generated method stub
		super.bark();
		System.out.println("야옹"); // 동물중 고양이만 할말
		
	}

}

class Animal {
	void bark() { //부모 클래스의 bark메소드를 통해서 자식클래스의 bark에 접근가능 메소드 이름이 똑같기 때문
		System.out.println("나는 동물이다!"); // bark메소드ㅇ에서 모든 동물들이 공통으로 할말 cat클래스와 dog클래스에 공통으로 들어가는 것이므로 한줄로 가능
	}
}
/*
class Hospital {
	public void inject(Animal animal) {
		System.out.println(animal.getName()+ "을 치료하기 위해 주사를 놓았습니다.");
		System.out.println(animal.scream());
	}
}
*/
/*
public class Polymorphism {
	public static void main(String[] args) {
		String animal;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신이 좋아하는 동물은? : ");
		animal = sc.nextLine();
		
		Animal a;
		switch(animal) {
		case "cat" :
			a=new Cat();
			break;
		case "dog" :
			a=new Dog();
			break;
		default :
			a=new Animal();
			break;
		}
		a.bark();
	}
}

*/