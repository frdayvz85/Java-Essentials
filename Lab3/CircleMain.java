class Circle {
    private double x = 0;
    private double y = 0;
    private double radius = 1;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    } // read

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;

        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.radius = radius;

    }

    // write
    // public void setX(double x) {
    // this.x = x;
    // }

    // public void setY(double y) {
    // this.y = y;
    // }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}

class CircleMain {
    public static void main(String[] args) {
        // Circle c = new Circle(); // parameterless constructor
        Circle c = new Circle(5, 2, 10); // parameter constructor
        System.out.println("The area of the circle is: " + c.getArea());

        // c.setX(5);
        // c.setY(2);
        // c.setRadius(10);
        // System.out.println("The area of the circle is: " + c.getArea());

    }
}