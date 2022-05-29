package AbstractClass;

public class Mongo extends AbstractDatabase {
    @Override
    void get() {
        System.out.println("Mongo data got");
    }

    @Override
    void update() {
        System.out.println("Mongo updated...");
    }
}
