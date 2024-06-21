public class HelloWorld {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("국어책", 3000);

        b1.showPrice();
        b2.showPrice();
    }
}
