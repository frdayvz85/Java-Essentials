package Interfaces;

public class Main {
    public static void main(String[] args) {
        // IDatabase idatabase = new IDatabase(); //we can't do this
        // Student student = new Student();
        // Customer customer = new Customer();

        // student.log();
        // customer.log();

        IDatabase database1 = new Student();
        IDatabase database2 = new Customer();

        database1.log();
        database2.log();
    }
}
