package practice170326;
class Animal {
	public String scream() {
		return "동물 울음소리";
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
		return "멍멍깨갱";
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
		return "야옹야옹";
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
		return "그르르어흥어흥";
	}
	public String getName() {
		return name;
	}
}

class Hospital {
	public void inject(Animal animal) {
		System.out.println(animal.getName()+ "을 치료하기 위해 주사를 놓았습니다.");
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
