import java.awt.List;
import java.sql.Date;

public class Order {
    // properties
    private int id;
    double totalPrice;
    double discountPrice;
    double netPrice;
    private OrderItem[] items = new OrderItem[2];
    private Date orderDate;
    private int count;

    public void addItem(OrderItem orderItem1) {
        items[count++] = orderItem1;
    }

    public void countTotalPrice() {
        for (OrderItem orderItem : items) {
            this.totalPrice += orderItem.book.getBookPrice();
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book(1, "bfdbfdbfdb", 8);
        Book book2 = new Book(2, "fvfdbfdbfbfd", 8);
        // Book book1 = new BookBuilder().setId(1).setName("First
        // Book").setPrice(8).build();
        // Book book2 = new BookBuilder().setId(2).setName("Second
        // Book").setPrice(8).build();
        Order order2 = new Order();
        OrderItem orderItem1 = new OrderItem(book1, 1);
        OrderItem orderItem2 = new OrderItem(book2, 1);
        order2.addItem(orderItem1);
        order2.addItem(orderItem2);
        order2.countTotalPrice();
        System.out.println(order2.totalPrice);
        System.out.println(order2.discountPrice);
        System.out.println(order2.netPrice);

    }

}
