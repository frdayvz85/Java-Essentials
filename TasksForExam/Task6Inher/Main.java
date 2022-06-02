package Task6Inher;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Jerry");
        System.out.println(cat);
        System.out.println(cat.greets());

        Dog dog = new Dog("Poty");
        System.out.println(dog);
        System.out.println(dog.greets());
        System.out.println(dog.greets(new Dog("Tom")));

    }
}
