class MainComplex {
    public static void main(String[] args) {
        Complex num1 = new Complex();
        num1.re = 3;
        num1.im = -1;

        Complex num2 = new Complex();
        num1.re = 3;
        num1.im = 1;

        System.out.println("abs(3-1i)= " + num1.abs());

        System.out.println(num1.re + " " + num1.im);
        System.out.println(num1.re);
        num1.add(num2);

        System.out.println(num1.re + " " + num1.im);
        System.out.println(num1.re + " " + num1.im);

        num1.sub(num2);
        System.out.println(num1.re + " " + num1.im);
        System.out.println(num1.re + " " + num1.im);

        num1.mul(num2);
        System.out.println(num1.re + " " + num1.im);
        System.out.println(num1.re + " " + num1.im);
        num1.conjugate();

        System.out.println(num1.re + " " + num1.im);

    }
}
