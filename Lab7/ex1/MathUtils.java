class MathUtils {

    public static int Increment(int x) { // ++1
        if (x < 2147483647)
            return ++x;

        else {
            throw new IllegalArgumentException();
        }
    }
}