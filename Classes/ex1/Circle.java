public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "Red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        this.radius = r;
        // radius = r; // not good way
        color = "Red";
    }

    /** Constructs a Circle instance with the given radius and given color */
    public Circle(double r, String c) { // 3nd constructor
        // radius = r;
        // color = c;

        this.radius = r;
        this.color = c;
    }

    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        // radius = newRadius;
        this.radius = newRadius;
    }

    /** Returns the radius */
    // Getter for instance variable radius
    public double getRadius() {
        return radius;
    }

    // Setter for instance variable color
    public void setColor(String newColor) {
        // color = newColor;
        this.color = newColor;
    }

    /* Returns the color */
    // Getter for instance variable color
    public String getColor() {
        return color;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?]
     */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

}