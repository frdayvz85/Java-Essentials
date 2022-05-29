package AbstractClass;

public class Main {
    public static void main(String[] args) {
        // AbstractDatabase abstractdDatabase= new AbstractDatabase()// we can't do this

        AbstractDatabase abstractDatabase = new Mysql();
        AbstractDatabase abstractDatabase2 = new Mongo();

        abstractDatabase.add();
        abstractDatabase2.add();

        abstractDatabase.update();
        abstractDatabase2.update();
    }
}
