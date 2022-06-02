import java.util.ArrayList;

// Write a function getting an ArrayList of strings and returning a copy which doesn't 
// include those strings whose length are an even number.

class Main {
    public static ArrayList<String> getEvenLength(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<String>();
        for (String element : list) {
            final int len = element.length();
            if (len % 2 == 0) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Farid");
        list.add("ELTE");
        list.add("Budapest");
        list.add("Java");
        list.add("JavaScript");
        list.add("React");

        System.out.println(list);

        ArrayList<String> newList = new ArrayList<String>(list);
        System.out.println(getEvenLength(newList));
    }
}
