class Complex { // 4 +6 i
    double re, im;

    // abs, add, sub, mul
    double abs() {
        return Math.sqrt(re * re + im * im);
    }

    void add(Complex c) {
        re += c.re;
        im += c.im;
    }

    void sub(Complex c) {
        re -= c.re;
        im -= c.im;
    }

    void mul(Complex c) {
        double new_re = re * c.re - im * c.im;
        double new_im = re * c.im + im * c.re;
    }

    // Create the method conjugate() in class Complex, which turns a complex number
    // to its conjugate.
    void conjugate() {
        im = im * -1;
    }

    // Create the method reciprocate() as well, which turns the complex number to
    // its reciprocal.
    void reciprocate(Complex m) {
        double new_re = re * m.re - im * m.im;
    }
}
