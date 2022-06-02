package Enums;

public enum Meals {
    KABAB(50, "Azerbaijan"),
    PIZZA(75, "Hungary"),
    LAHMACUN(70, "Turkey"),
    DONER(80, "Germany");

    final double price;
    final String location;

    Meals(double price, String location) {
        this.price = price;
        this.location = location;
    }

}
