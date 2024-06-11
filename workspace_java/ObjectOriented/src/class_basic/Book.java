package class_basic;

public class Book {
    String title;
    private String writer;
    private int price;

    public Book() {
        this.title = "";
        this.writer = "";
        this.price = 0;
    }

    public Book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
