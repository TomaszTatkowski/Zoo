package model;

public class AnimalConcrete extends AnimalAbstract {

    private int leapLength;

    public AnimalConcrete(String type, String name, String sound, int leapLength) {
        super(type, name, sound);
        this.leapLength = leapLength;
    }

    @Override
    public void makeALeap() {
        System.out.println(getName() + " made " + leapLength + " meter leap.");
    }
}
