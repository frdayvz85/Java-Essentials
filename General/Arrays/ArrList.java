package Arrays;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> groups = new ArrayList<String>();

        groups.add("Group A");
        groups.add("Group B");
        groups.add("Group C");

        // for (int i = 0; i < groups.size(); i++) {
        // System.out.println(groups.get(i));
        // }

        if (groups.isEmpty()) {
            System.out.println("No groups found");
        } else {
            System.out.println("More than one group found:" + groups.size());
        }

        System.out.println(groups);
        System.out.println(groups.indexOf("Group sB"));
        // groups.remove(2); //remove the index with 2

        for (String group : groups) {
            System.out.println(group);
        }
    }
}
