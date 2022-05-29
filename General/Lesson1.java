import java.util.Scanner;

public class Lesson1 {
    public static void greet() {
        System.out.println("Greetings from the teacher!");
    }

    public static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number");
        int num = scan.nextInt();
        int fact = 1;

        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial: " + fact);
    }

    public static void greetings(String name) {
        System.out.println("Welcome " + name);
    }

    public static void sum(int a, int b, int c) {
        System.out.println("Sum " + (a + b + c));
    }

    // with return
    public static int sum2(int a, int b, int c) {
        return (a + b + c);
    }

    public static int productwiththree(int a) {
        return (a * 3);
    }

    public static int sumwithten(int a) {
        return (a + 10);
    }

    public static int subtractwithfive(int a) {
        return (a - 5);
    }

    public static void scorCalculate(String name, int skor) {
        System.out.println(name + " isimli oyuncunun skoru " + skor);
    }

    public static void scorCalculate(int skor) {
        System.out.println("Isimsiz oyuncunun skoru " + skor);
    }

    public static void scorCalculate(String name) {
        System.out.println(name + " oyuncunun skoru");
    }

    public static void main(String[] args) {
        // greet();
        // factorial();
        // greetings("Farid");
        // sum(5, 6, 9);
        // int result = sum2(5, 7, 8);// we can't do this for sum because doesnt have
        // return;
        // System.out.println("Result: " + result);
        // System.out.println("Sum of numbers: " + sum2(5, 6, 9));
        // System.out.println("RESULT: " +
        // subtractwithfive(sumwithten(productwiththree(5))));
        scorCalculate("Farid", 450);
        scorCalculate(500);
        scorCalculate("Farid");
    }
}
