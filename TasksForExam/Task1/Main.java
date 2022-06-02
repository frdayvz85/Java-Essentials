package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));

        MyPoint p2 = new MyPoint(3, 4);
        MyPoint p3 = new MyPoint(5, 6);
        System.out.println(p2.distance(p3));

        System.out.println(Arrays.toString(p1.getXY()));

        MyPoint p4 = new MyPoint(3, 4);
        System.out.println(p4.distance());
    }
}
