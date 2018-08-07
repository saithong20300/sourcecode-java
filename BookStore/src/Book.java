import java.math.BigDecimal;

public class Book {
    // properties
    private int bookId;
    private String bookName;
    private double bookPrice;

    // constructor
    public Book(int bookId, String bookName, double bookPrice) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Book(String bookName, double bookPrice) {

        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Book() {
        this(1, "N/S", 0);

    }

    // method
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public static Book CreateBookNameAndPrice(String name, double price) {
        Book book = new Book();
        book.bookName = name;
        book.bookPrice = price;
        return book;
    }

    public static Book CreateBookNameOnly(String name) {
        Book book = new Book();
        book.bookName = name;
        return book;
    }

}

class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookId(1);
        book1.setBookName("First Book");
        book1.setBookPrice(900);

        Book book2 = new Book(2, "Second", 400);

        Book book3 = Book.CreateBookNameAndPrice("Now", 400);
        Book book31 = Book.CreateBookNameOnly("Now");

        Book book4 = new BookBuilder().setName("").setPrice(4).build();
    }
}

class BookBuilder {
    private Book book = new Book();

    public BookBuilder setId(int id) {
        book.setBookId(id);
        return this;
    }

    public BookBuilder setName(String name) {
        book.setBookName(name);
        return this;
    }

    public BookBuilder setPrice(int price) {
        book.setBookPrice(price);
        return this;
    }

    public Book build() {
        return book;
    }

}
