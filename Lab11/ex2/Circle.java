public class Circle implements Shape {
    private int r;

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return this.r;
    }

    public int getPerimeter() {
        return (int) (2 * Math.PI * this.r);
    }

    public int getArea() {
        return (int) (Math.PI * this.r * this.r);
    }
}