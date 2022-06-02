package Generics;

public class Main {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(20);
        printer.print();

        Printer<Double> printer2 = new Printer<>(30.5);
        printer2.print();

        Printer<String> printer3 = new Printer<>("Java");
        printer3.print();

        shout("Hello");
        shout(45);

        advancePrint("Welcome to Generics lessons", "Greeat");
        advancePrint("Another lessons are started", 20);

    }

    private static <T> void shout(T thingToShout) {
        System.out.println(thingToShout);
    }

    private static <T, V> void advancePrint(T thingToPrint, V otherThingToPrint) {
        System.out.println(thingToPrint);
        System.out.println(otherThingToPrint);
    }
}
