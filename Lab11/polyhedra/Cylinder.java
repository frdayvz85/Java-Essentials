package polyhedra;

public class Cylinder extends Prism {
    double radius;

    public Cylinder(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    // base area of the cylinder = πr2
    @Override
    public double baseArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Cylinder [ h = %f, r = %f ]", height, radius);
    }

}