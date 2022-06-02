package Task6Inher;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public String greets() {
        return "Woof";
    }

    public String greets(Dog another) {
        return "Woooooooof";
    }

    @Override
    public String toString() {
        return "Dog [" + super.toString() + "]";
    }
}
