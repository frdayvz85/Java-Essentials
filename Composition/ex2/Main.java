public class Main {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[3];
        authors[0] = new Author("Farid Eyvazov", "Farid@gmail.com", 'm');
        authors[1] = new Author("Nizami Alimammadov", "Nizami@gmail.com", 'm');
        authors[2] = new Author("Sevda Babayeva", "Sevda@gmail.com", 'f');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for beginners", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()

        // javaDummy.getAuthorNames();

        // System.out.println("Author's name is: " + javaDummy.getAuthorNames());

    }
}
