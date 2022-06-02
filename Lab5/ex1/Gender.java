package main;

import person.Person;
import person.Gender;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ali-Mammadov", "Nizami", "CS", Gender.MALE, 1999);
        Person p2 = new Person("Ali-Mammadov", "Nizami", "CS", Gender.MALE, 1999);
        Person p3 = new Person("Eyvazov", "Farid", "CS", Gender.MALE, 2000);
        Person p4 = new Person("Aliyeva", "Leyla", "CS", Gender.FEMALE, 2001);

        System.out.println(p1.toString());
        System.out.println(p3.toString());

        System.out.println(p1.sameAs(p3));
    }
}