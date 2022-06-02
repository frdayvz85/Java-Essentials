import java.util.Arrays;

class Main3 {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 2, 6, 7, 8, 9, 6 };
        swap(arr1, 2, 3);
        System.out.println(Arrays.toString(arr1));

        Double[] arr2 = { 2.4, 6.7, 7.6, 8.8, 9.2, 6.5 };
        swap(arr2, 0, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
