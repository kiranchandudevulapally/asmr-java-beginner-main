public class Book {
    String title;
    int numPages;
    String author;

    Book(String title, int numPages, String author) {
        this.title = title;
        this.numPages = numPages;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " - " + author + " (" + numPages + ")";
    }
}
