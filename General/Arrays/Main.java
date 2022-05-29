package Arrays;

import java.util.Scanner;

public class Main {

    public static void average(int[] arrs) {
        int total = 0;
        for (int i = 0; i < arrs.length; i++) {
            total += arrs[i];
        }

        System.out.println("Average " + (double) total / 2);
    }

    public static double average2(int[] arrs) {
        int total = 0;
        for (int i = 0; i < arrs.length; i++) {
            total += arrs[i];
        }

        return total / 2;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = new int[5];
        // arr2[0] = 1;
        // arr2[1] = 2;
        // arr2[2] = 3;
        // arr2[3] = 4;
        // arr2[4] = 5;

        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < arr1.length; i++) {
        // System.out.println(arr1[i]);
        // }

        System.out.println("Enter the number of Array2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Array2 " + arr2[i]);
        }

        average(arr1);

        double result = average2(arr2);
        System.out.println(result);

    }
}
