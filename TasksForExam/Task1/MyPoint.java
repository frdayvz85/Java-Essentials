package Task1;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() { // 1st (default) constructor
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) { // 2nd constructor with parameters
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] { this.x, this.y };
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x1, int y1) {
        double distance = (x1 - this.x) + (y1 - this.y);
        return distance;
    }

    public double distance(MyPoint another) {
        double distance = (another.x - this.x) + (another.y - this.y);
        return distance;
    }

    public double distance() {
        return (this.x - 0) + (this.y - 0);
    }
}
