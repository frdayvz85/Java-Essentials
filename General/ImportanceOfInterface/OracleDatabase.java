package ImportanceOfInterface;

public class OracleDatabase implements IDatabase {
    @Override
    public void add() {
        System.out.println("Oracle Database added...");
    }

    @Override
    public void delete() {
        System.out.println("Oracle Database deleted...");
    }

    @Override
    public void get() {
        System.out.println("Oracle Database got...");
    }

    @Override
    public void update() {
        System.out.println("Oracle Database updated...");
    }
}
