package model;

public abstract class AnimalAbstract implements Animal {
    public AnimalAbstract(String type, String name, String sound) {
        this.type = type;
        this.name = name;
        this.sound = sound;
    }

    private String type;
    private String name;
    private String sound;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeASound() {
        System.out.println(type + " " + name + " said: " + sound);
    }

    public abstract void makeALeap();
}
