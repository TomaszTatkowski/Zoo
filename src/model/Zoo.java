package model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public Zoo(String zooName) {
        this.zooName = zooName;
    }

    private String zooName;

    private List<Animal> animals = new ArrayList<>();

    public String getZooName() {
        return zooName;
    }

    public void presentAnimals() {
        System.out.println("Zoo: " + getZooName());
        System.out.println("-----------ANIMALS-----------");
        if (animals.size() > 0) {
            for (Animal animal : animals) {
                AnimalAbstract animalAbstract = (AnimalAbstract) animal;
                System.out.println("Type: " + animalAbstract.getType());
                System.out.println("Name: " + animalAbstract.getName());
                animal.makeASound();
                animalAbstract.makeALeap();
                System.out.println();
            }
        }
        else
            System.out.println("There are not animals in this zoo");
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

}
