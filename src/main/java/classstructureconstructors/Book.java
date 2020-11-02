package classstructureconstructors;

public class Book {
    private String title;
    private String author;
    private String regNumb;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getRegNumb() {
        return regNumb;
    }
    public void register(String regNumber) {
        this.regNumb = regNumb;
    }
}
