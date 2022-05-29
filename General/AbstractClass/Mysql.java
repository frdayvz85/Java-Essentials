package AbstractClass;

public class Mysql extends AbstractDatabase {

    @Override
    void get() {
        System.out.println("Mysql data got");
    }

    @Override
    void update() {
        System.out.println("Mysql updated...");
    }

}
