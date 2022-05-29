package Polymorphism;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(getName() + " is speaking....");
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is singing...");
    }

}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is barking...");
    }

}

class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is neighing...");
    }

}

public class Main {
    public static void speaktry(Animal animal) {
        animal.speak();
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Tiger");
        Bird bird = new Bird("Zippy");
        Dog dog = new Dog("Rudy");
        Horse horse = new Horse("Lady");

        // animal.speak();
        // bird.speak();
        // dog.speak();
        // horse.speak();

        // Animal animal2 = new Bird("Zippy");
        // animal2.speak();
        speaktry(new Animal("Tiger"));
    }
}
