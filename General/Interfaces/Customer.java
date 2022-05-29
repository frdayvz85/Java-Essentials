package Interfaces;

public class Customer implements IDatabase {

    @Override
    public void log() {
        System.out.println("Customer added...");

    }

}
