public class Rectangle implements Shape {
    private int height, width;

    public void setX(int height) {
        this.height = height;
    }

    public void setY(int width) {
        this.width = width;
    }

    public int getX() {
        return this.height;
    }

    public int getY() {
        return this.width;
    }

    public int getPerimeter() {
        return (2 * this.height) + (2 * this.width);
    }

    public int getArea() {
        return this.height * this.width;
    }
}
