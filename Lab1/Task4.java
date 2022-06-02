class Task4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid number of the arguments!");
            System.exit(0);
        } else {
            System.out.println("Hello " + args[0]);
        }
    }
}
