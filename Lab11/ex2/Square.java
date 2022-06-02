public class Square implements Shape {
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public int getPerimeter() {
        return 4 * this.x;
    }

    public int getArea() {
        return this.x * this.x;
    }
}