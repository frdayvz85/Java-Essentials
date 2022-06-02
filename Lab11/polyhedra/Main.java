package polyhedra;

class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 5);
        System.out.println(cylinder);
        System.out.println("Cylinder base area = " + cylinder.baseArea());

        Cube cube = new Cube(4);
        System.out.println(cube);
        System.out.println("Cube base area = " + cube.baseArea());

    }
}
