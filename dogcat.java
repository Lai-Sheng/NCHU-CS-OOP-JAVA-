package animal;

import java.util.Scanner;

public class dogcat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str1 = sc.nextLine();
	    String str2 = sc.nextLine();
	    String str3 = sc.nextLine();
	    String str4 = sc.nextLine();
	    boolean bool = sc.nextBoolean();

	    Animal animal = new Animal(str1);
	    animal.makeSound();
	    System.out.println(animal.getName());


	    Cat cat = new Cat(str4, bool);
	    System.out.println(cat.getName());
	    cat.makeSound();
	    System.out.println(cat.getIsDomestic());

	    Dog dog = new Dog(str2, str3);
	    System.out.println(dog.getName());
	    dog.makeSound(); 
	    System.out.println(dog.getBreed());

	    sc.close();
	  }
}
class Animal { //只有名字
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

    public String getName() {
        return name;
    }
}
class Dog extends Animal { 
	private String breed;
	public Dog(String name, String breed) {
		super(name);
		this.breed=breed;
		
	};
	String getBreed() {
		return this.breed;
		
		
	};
// write your code here
	public void makeSound() {
		super.makeSound();
		System.out.println("Woof");
}
}
class Cat extends Animal {
	private boolean isDomestic;
	public Cat(String name,boolean isDomestic) {
		super(name);
		this.isDomestic=isDomestic;
		
	}
	boolean getIsDomestic() {
		return this.isDomestic;
		
	}
	public void makeSound() {
		super.makeSound();
		System.out.println("Meow");
}
}