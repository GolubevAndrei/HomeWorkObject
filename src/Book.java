public class Book {
    private Author author;
    private String bookName;
    private int bookYear;

    public Book(String authorFirstName, String authorLastName, String bookName, int bookYear) {
        Author author = new Author(authorFirstName, authorLastName);
        this.author = author;
        this.bookName = bookName;
        this.bookYear = bookYear;
    }

    public String getAuthorName() {
        return this.author.toString();
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}

