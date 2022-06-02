package Enums;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.FRIDAY;

        if (day == DaysOfWeek.FRIDAY) {
            System.out.println("Day of week: " + day);
        }

        int index = 0;
        for (DaysOfWeek myDay : DaysOfWeek.values()) {
            System.out.println("Day is " + index++ + " " + myDay);
        }

        // Cereals
        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);
        // Cereals.FROOT_LOOPS.levelOfDeliciousness = 150;// if levelOfDeliciousness is
        // use final keyword then we can not update
        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);

        System.out.println(Meals.KABAB.location + " : " + Meals.KABAB.price);

        for (Meals meal : Meals.values()) {
            System.out.println(meal + " : " + meal.location + " - " + meal.price);
        }

    }
}
