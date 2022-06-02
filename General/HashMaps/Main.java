package HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> users = new HashMap<String, Integer>();
        users.put("Farid", 123);
        users.put("Shamil", 231);
        users.put("Nizami", 321);
        // {Nizami=321, Farid=783, Shamil=231}

        System.out.println(users);
        System.out.println(users.get("Farid"));// 123
        System.out.println(users.containsKey("Nizami"));// true
        System.out.println(users.containsValue(231)); // true

        users.put("Farid", 783);
        System.out.println(users);

        for (String user : users.keySet()) {
            System.out.println(user); // return user key
        }

        for (Integer user : users.values()) {
            System.out.println(user); // return user value
        }

        users.remove("Shamil");
        System.out.println(users);

        users.clear();
        System.out.println(users);
    }
}
