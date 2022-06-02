package utils;

import circle.utils.Point;

class Circle {
    // Create the circle.Circle class, which stores the radius of the circle
    // (double) and the center of the circle (x, y fields).
    double radius;
    double x, y;

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

class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
    }
}
