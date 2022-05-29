package oop;

public class Car {
    // fields,properties
    private String color;
    private String model;
    private int engine;
    private int doors;

    // default constructor
    public Car() {
        // this.color = "Blue";
        // this.model = "No info";
        // this.engine = 4;
        // this.doors = 2;

        // short way;
        this("Blue", "No info", 4, 2);
    }

    // constructor with 2 parameters
    public Car(String color, String model) {
        this(color, model, 0, 0);
    }

    // constructor with parameters
    public Car(String color, String model, int engine, int doors) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            System.out.println("Doors count can be 2 or 4.");
        }
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", doors=" + doors + ", engine=" + engine + ", model=" + model + "]";
    }
}
