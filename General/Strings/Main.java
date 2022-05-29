package Strings;

public class Main {
    public static void main(String[] args) {
        String name = "Farid";
        String name2 = new String("Farid");

        // System.out.println(name);
        // System.out.println(name.length());

        // System.out.println("Last character " + name.charAt(name.length() - 1));
        // for (int i = 0; i < name2.length(); i++) {
        // System.out.println(name2.charAt(i));
        // }

        System.out.println(name2.startsWith("Fa")); // true
        System.out.println(name2.startsWith("fa")); // false
    }
}
