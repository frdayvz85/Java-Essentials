class Main {
    public static void main(String[] args) {
        // Square
        Square sq1 = new Square();
        sq1.setX(4); // width and height
        System.out.println("Square Perimeter:" + sq1.getPerimeter());
        System.out.println("Square Area:" + sq1.getArea());

        // Circle
        Circle c1 = new Circle();
        c1.setR(5);
        System.out.println("Circle Perimeter:" + c1.getPerimeter());
        System.out.println("Circle Area:" + c1.getArea());

        // Rectangle
        Rectangle r1 = new Rectangle();
        r1.setX(3);// height
        r1.setY(4);// width
        System.out.println("Rectangular perimeter:" + r1.getPerimeter());
        System.out.println("Rectangular area:" + r1.getArea());
    }
}