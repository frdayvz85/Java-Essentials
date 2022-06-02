package circle.utils;

public class Point {
    private double x, y, radius;

    // create getters and setters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.radius = radius;
    }

}
