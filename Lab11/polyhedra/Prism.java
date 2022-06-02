package polyhedra;

abstract class Prism {
    double height;

    public Prism(double height) {
        this.height = height;
    }

    public abstract double baseArea(); // abstract

    // Any prism volume is V = BH where B is area of base and H is height of prism
    public double volume() { // concrete
        return height * baseArea();
    }
}