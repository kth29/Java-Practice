package examples;

public class UpDownCasting {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Dog myDog = new Dog();
		Animal counterDog = new Dog();
		
		//Animal counterDog = (Animal)myAnimal;
		
		myDog.eat();
		//counterDog.eat();
		
		System.out.println(myDog);
		System.out.println(myAnimal);
		System.out.println(counterDOg);

	}

}


class Animal {
	public boolean hasFur = false;
	
	public void eat() {
		System.out.println("This Animal object eats food");
	}
	
}

class Dog extends Animal {
	public boolean hasFur = true;
	
	public void eat() {
		System.out.println("This Dog object says: I eat kibble");
	}
	
	public void bark() {
		System.out.println("Woof!");
	}
}

class counterDOg extends Dog {
	
}
