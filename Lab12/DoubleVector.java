class DoubleVector {
    double[] coords;

    public DoubleVector(double x1, double x2) {
        this.coords = new double[2];
        this.coords[0] = x1;
        this.coords[1] = x2;
    }

    public String toString() {
        return "(" + this.coords[0] + "," + this.coords[1] + ")";
    }
}