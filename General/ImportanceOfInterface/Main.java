package ImportanceOfInterface;

class DatabaseManager {
    public void AddDatabase(IDatabase database) {
        database.add();
    }

    public void GetDatabase(IDatabase database) {
        database.get();
    }

    public void DeleteDatabase(IDatabase database) {
        database.delete();
    }

    public void UpdateDatabase(IDatabase database) {
        database.update();
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();

        manager.AddDatabase(new MySqlDatabase());
        manager.UpdateDatabase(new MongoDatabase());
        manager.DeleteDatabase(new OracleDatabase());

    }
}
