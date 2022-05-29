public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        for (int i = 0; i < authors.length; i++) {
            System.out.println(authors[i].getName());
        }
        return "";
    }

    // public String getAuthorEmail() {
    // return author.getEmail();
    // }

    // public char getAuthorGender() {
    // return author.getGender();
    // }

    // @Override
    // public String toString() {
    // return "Book[name=" + name + ",authors={Author[name=" + name +
    // ",email=?,gender=?],......},price=" + price
    // + ",qty=" + qty + "]";
    // }

    public String toString() {
        StringBuilder sb = new StringBuilder("Book").append("[name = ").append(name).append(", authors{");

        for (Author author : authors) {
            sb
                    .append("Author[name = ").append(author.getName())
                    .append(", email = ").append(author.getEmail())
                    .append(", gender = ").append(author.getGender())
                    .append("],");
        }

        sb.append("}").append(",price=").append(price).append(", qty=").append(qty).append("]");

        return sb.toString();
    }
}

// ", Author[name=" + name + ", email=" + email + ", gender=" + gender + "]"