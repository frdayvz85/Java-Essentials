package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("pants");
            // int myInt = Integer.parseInt("5");
            System.out.println("After parsing pantss");
            return;
        } catch (Exception e) {
            System.out.println("Error happened: " + e);
        } finally {
            System.out.println("Final part");
        }

        System.out.println("End");

        System.out.println(printNumber());
    }

    private static int printNumber() {
        try {
            return 3;
        } catch (Exception e) {
            return 4;
        } finally {
            return 5;
        }
    }
}
