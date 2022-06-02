class MathUtils {
    public static double power(int base, int exp) { // 2^3
        double result = 1;
        for (int i = 1; i <= Math.abs(exp); ++i) {
            result *= base;
        }

        if (exp < 0) { // 0^-2
            if (base == 0) {
                throw new IllegalArgumentException();
            }
            result = 1.0 / result; // 2^-2
        }
        return result;
    }
}