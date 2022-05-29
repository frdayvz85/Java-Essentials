package ImportanceOfInterface;

public class MySqlDatabase implements IDatabase {

    @Override
    public void add() {
        System.out.println("Mysql Database added...");
    }

    @Override
    public void delete() {
        System.out.println("Mysql Database deleted...");
    }

    @Override
    public void get() {
        System.out.println("Mysql Database got...");
    }

    @Override
    public void update() {
        System.out.println("Mysql Database updated...");
    }

}
