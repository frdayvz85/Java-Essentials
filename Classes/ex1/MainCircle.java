public class MainCircle {
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println(c1.getColor() + " circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        // The circle has radius of 1.0 and area of 3.141592653589793

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        System.out.println(c2.getColor() + " circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        // Declare an instance of class circle called c3.
        // Construct the instance c3 by invoking the third constructor
        // with the given radius and given color.
        Circle c3 = new Circle(3.0, "Green");
        System.out.println(c3.getColor() + " circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());

        Circle c4 = new Circle(); // construct an instance of Circle
        c4.setRadius(5.5); // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("Orange"); // Change color
        System.out.println("color is: " + c4.getColor()); // Print color via getter

        // You cannot do the following because setRadius() returns void, which cannot be
        // printed
        // System.out.println(c4.setRadius(4.4));

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString()); // explicit call
    }
}
