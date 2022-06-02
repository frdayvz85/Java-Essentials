import stringutils.IterWord;

// Exercise 2
class IterWord {
    public static void main(String[] args) {

        String str;
        int counter;

   
        public IterWord(String str) {
            if (str == null) {
                throw new IllegalArgumentException("The string should not be a null value");
            }
            this.str = str;
            this.counter = 0;
        }
    
        public void restart() {
            counter = 0;
        }
    
        public boolean hasNext() {
            return counter < str.length();
        }
    
        public void printNext() {
            if (hasNext()) {
                System.out.println(str.charAt(counter++));
            }
        }

    }
}
