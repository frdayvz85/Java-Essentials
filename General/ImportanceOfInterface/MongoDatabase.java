package ImportanceOfInterface;

public class MongoDatabase implements IDatabase {
    @Override
    public void add() {
        System.out.println("Mongo Database added...");
    }

    @Override
    public void delete() {
        System.out.println("Mongo Database deleted...");
    }

    @Override
    public void get() {
        System.out.println("Mongo Database got...");
    }

    @Override
    public void update() {
        System.out.println("Mongo Database updated...");
    }

}
