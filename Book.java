public class Book {
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void printDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
    
}
