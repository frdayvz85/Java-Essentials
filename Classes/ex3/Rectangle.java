public class Rectangle {
    private float width;
    private float height;

    public Rectangle() {
        width = 5;
        height = 3;
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea() {
        return width * height;
    }

    public float getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "Reactangle [height=" + height + ", width=" + width + "]";
    }
}
