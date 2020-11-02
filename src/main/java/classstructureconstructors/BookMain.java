package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Pierce Brown", "Red Rising");

        book.register("8712");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Registration Number: " + book.getRegNumb());
    }
}
