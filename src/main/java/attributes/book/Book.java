package attributes.book;

public class Book {

    private String title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String title) {
        this.title = title;


    }

    public static void main(String[] args) {
        Book book = new Book("Mocsok");
        System.out.println(book.getTitle());

        book.setTitle("Ragasztó");
        System.out.println(book.getTitle());
    }
}
