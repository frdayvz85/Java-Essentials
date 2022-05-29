public class Main {
    public static void main(String[] args) {
        // Test constructor and toString()
        Date d1 = new Date(1, 2, 2022);
        System.out.println(d1); // toString()

        // Test getters and setters
        d1.setDay(12);
        d1.setMonth(5);
        d1.setYear(2029);

        System.out.println(d1); // toString()
        System.out.println("Day: " + d1.getDay());
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Year: " + d1.getYear());

        // Test setDate()
        d1.setDate(3, 4, 2016);
        System.out.println(d1); // toString()

    }
}
