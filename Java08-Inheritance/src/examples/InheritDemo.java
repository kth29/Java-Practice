package examples;

public class InheritDemo {

	public static void makeTalk(Animal input) {
		input.speak();
	}
	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Dog myDog = new Dog();
		Puppy myPuppy = new Puppy();
		
		System.out.println("Make the Animal object speak:");
		makeTalk(myAnimal);
		
		System.out.println("Make the Dog object speak:");
		makeTalk(myDog);
		
		System.out.println("Make the Puppy Object speak:");
		makeTalk(myPuppy);

	}

}

class Animal {
	
	public void speak() {
		System.out.println("Generic animal noise");
		
	}
}

class Dog extends Animal {
	public void speak() {
		System.out.println("Woof!");
	}

}

class Puppy extends Dog {
	
	public void speak() {
		super.speak();
		System.out.println("Bark!");
	}
}
