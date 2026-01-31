package inheritance;

import inheritance.Animal1;
import inheritance.Bird;
import inheritance.Mammal;
import inheritance.Reptile;

class Animal1{
	String name;
	String habitat;
	public Animal1(String name, String habitat) {
		super();
		this.name = name;
		this.habitat = habitat;
	}
	
	public void displayHabitat() {
		System.out.println("Animal Name: "+name);
		System.out.println("Animal Habitat: "+habitat);
	}
}

class Mammal extends Animal1{
	boolean isWarmBlooded;
	
	public Mammal(String name, String habitat, boolean isWarmBlooded) {
		super(name, habitat);
		this.isWarmBlooded = isWarmBlooded;
	}



	public void displayMammalInfo() {
		System.out.println("IsWarm blooded: "+isWarmBlooded);
	}
}

class Bird extends Animal1{
	boolean canFly;
	
	public Bird(String name, String habitat, boolean canFly) {
		super(name, habitat);
		this.canFly = canFly;
	}



	public void displayBirdInfo() {
		System.out.println("is can fly: "+canFly);
	}
	
}

class Reptile extends Animal1{
	boolean isColdBlooded;

	public Reptile(String name, String habitat, boolean isColdBlooded) {
		super(name, habitat);
		this.isColdBlooded = isColdBlooded;
	}
	
	public void displayReptileInfo() {
		System.out.println("Is cold blooded: "+isColdBlooded);
	}
}

public class AnimalHierarchy {

	public static void main(String[] args) {
		Animal1 mammal=new Mammal("Lion", "Savannah", true);
		mammal.displayHabitat();
		((Mammal)mammal).displayMammalInfo();
		System.out.println("-------------------------");
		Animal1 bird=new Bird("Eagle", "Forest", true);
		bird.displayHabitat();
		((Bird)bird).displayBirdInfo();
		System.out.println("--------------------------");
		Animal1 reptile=new Reptile("Snake", "Desert", true);
		reptile.displayHabitat();
		((Reptile)reptile).displayReptileInfo();

	}

}



