package Task6Inher;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public String greets() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat [" + super.toString() + "]";
    }

}
