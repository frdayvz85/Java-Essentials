class Point {
    private double x, y;
    int id = 1;

    // static int current_id = 1;

    public Point(double init_x, double init_y) {
        x = init_x;
        y = init_y;
        id = id++; // increase id by 1
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return id + "(" + x + "," + y + ")";
    }

    public static Point centerOfMass(Point[] arr) {
        double center_x = 0, center_y = 0;

        for (int i = 0; i < arr.length; ++i) {
            center_x += arr[i].getX();
            center_y += arr[i].getY();
        }

        center_x /= arr.length;
        center_y /= arr.length;

        return new Point(center_x, center_y);
    }

}