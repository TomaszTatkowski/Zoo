import model.Animal;
import model.AnimalConcrete;
import model.Zoo;

public class Exercise2Main {
	
	/* Exercise 2
	 * This exercise is designed for you to demonstrate your Object Oriented programming skills.
	 * Model a zoo which can host several animals of different species.
	 * Each species of animal makes a different sound (e.g. A tiger roars).
	 * Each individual animal has a given name (e.g. A tiger called Simba).
	 * A zoo has a name (e.g London Zoo) and hosts some animals.
	 * There is an Animal interface and a Zoo class that have been provided for you to get you started 
	 * though it is up to you whether you want to use these or something else for your 
	 * approach (bearing in mind what skills you should be trying to demonstrate in completing this exercise).
	 * Once you have created your Zoo and Animal model, instantiate two different zoos hosting a few animals each 
	 * inside your main() method of Exercise2Main.
	 * When you run your application, for each zoo you have instantiated, it should print out to the console 
	 * the name of the zoo and information about each animal (species, name and sound) hosted in that zoo.
	 */
	
	/*
	 * Note: to run the application:
	 * Eclipse / Spring Tool Suite: Right click on Exercise2Main.java -> Run as -> Java Application.
	 * Intellij: Click the green arrow marker in the left margin next to the main() method in Exercise2Main.java -> Run 'Exercise2Main.main()'.
	 */	

	public static void main(String[] args) {
		Zoo zooWarsaw = new Zoo("Warsaw");
		Zoo zooLondon = new Zoo("London");
		Zoo zooGlasgow = new Zoo("Glasgow");

		Animal lion = new AnimalConcrete("Lion", "Simba", "Roar", 4);
		Animal dog = new AnimalConcrete("Dog", "Azor", "Woof", 2);

		zooWarsaw.addAnimal(lion);
		zooWarsaw.addAnimal(dog);

		zooLondon.addAnimal(new AnimalConcrete("Snake", "Bambo", "Sssss", 1));
		zooLondon.addAnimal(new AnimalConcrete("Bat", "Igo", "shhhosh", 7));

		zooWarsaw.presentAnimals();
		zooLondon.presentAnimals();
		zooGlasgow.presentAnimals();
	}
}
