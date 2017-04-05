package practice170326;
class Animal {
	public String scream() {
		return "���� �����Ҹ�";
	}
	public String getName() {
		return null;
	}
}

class Dog1 extends Animal {
	private String name;
	public Dog1() {
		name = getClass().getSimpleName();
	}
	public String scream() {
		return "�۸۱���";
	}
	public String getName() {
		return name;
	}
}

class Cat extends Animal {
	private String name;
	public Cat() {
		name = getClass().getSimpleName();
	}
	public String scream() {
		return "�߿˾߿�";
	}
	public String getName() {
		return name;
	}
}

class Tiger extends Animal {
	private String name;
	public Tiger() {
		name = getClass().getSimpleName();
	}
	public String scream() {
		return "�׸����������";
	}
	public String getName() {
		return name;
	}
}

class Hospital {
	public void inject(Animal animal) {
		System.out.println(animal.getName()+ "�� ġ���ϱ� ���� �ֻ縦 ���ҽ��ϴ�.");
		System.out.println(animal.scream());
	}
}

public class AnimalHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		Animal dog = new Dog1();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		hospital.inject(dog);
		hospital.inject(cat);
		hospital.inject(tiger);
	}

}
