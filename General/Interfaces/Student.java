package Interfaces;

public class Student implements IDatabase {

    @Override
    public void log() {
        System.out.println("Student added...");
    }

}
