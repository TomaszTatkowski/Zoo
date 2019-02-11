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
    }

    public void addAnimal(Animal animal) {
        hostedAnimals.add(animal);
    }

}
