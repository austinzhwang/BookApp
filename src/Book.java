public class Book {

    private String title;
    private String author;
    private String desc;
    private double price;
    private boolean isInStock;

    public Book() {

    }

    public Book(String title, String author, String desc, double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.desc = desc;
        this.price = price;
        this.isInStock = isInStock;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    // Returns the price of the number of books requested if the books are in stock
    // Otherwise return 0
    public double getPrice (int numBooks) {
        final double BOOK_PRICE = 5;
        if (isInStock()) {
            return BOOK_PRICE * numBooks;
        }
        return 0;
    }

    // Enhance the Book Class
    public String getDisplayText() {
        return "Author: " + getAuthor() + " | Title: " + getTitle() + " | Description: " + getDesc();
    }
}
