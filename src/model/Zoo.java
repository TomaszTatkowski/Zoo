package model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public Zoo(String zooNamed) {
        this.zooName = zooNamed;
    }

    private String zooName;

    private List<Animal> hostedAnimals = new ArrayList<>();

    public String getZooName() {
        return zooName;
    }

    public void presentAnimals() {
        System.out.println("Zoo: " + getZooName());
        System.out.println("-----------ANIMALS-----------");
        if (hostedAnimals.size() > 0) {
            for (Animal animal : hostedAnimals) {
                AnimalConcrete animalConcret = (AnimalConcrete) animal;
                System.out.println("Type: " + animalConcret.getType());
                System.out.println("Name: " + animalConcret.getName());
                animal.makeASound();
                animalConcret.makeALeap();
                System.out.println();
            }
        }
        else
            System.out.println("There are not animals in this zoo");
    }

    public void addAnimal(Animal animal) {
        hostedAnimals.add(animal);
    }

}
