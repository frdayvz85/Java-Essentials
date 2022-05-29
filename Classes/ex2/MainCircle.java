public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // default constructor
        System.out.println(circle1);

        Circle circle2 = new Circle(2.0); // with given value
        System.out.println(circle2);

        // getters and setters
        Circle circle3 = new Circle(3.0); // with given value also we can use default constructor
        circle3.setRadius(5.0);
        System.out.println(circle3);
        System.out.println("The radius is " + circle3.getRadius());

        // getArea and getCircumference
        System.out.println("Area is " + circle3.getArea());
        System.out.println("Circumference is " + circle3.getCircumference());

    }
}
