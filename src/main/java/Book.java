public class Book {
    String title;
    int price;

    public Book() { }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public void showPrice() {
        System.out.println(title+"의 가격은"+price+"원 입니다.");
    }
}
