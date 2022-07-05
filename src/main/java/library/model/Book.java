package library.model;

import java.util.Objects;

public class Book {

    private Integer bookId;
    private String name;
    private String author;
    private String categorize;
    private Integer year;

    public Book(Integer bookId, String name, String author, String categorize, Integer year) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.categorize = categorize;
        this.year = year;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategorize() {
        return categorize;
    }

    public void setCategorize(String categorize) {
        this.categorize = categorize;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookId, book.bookId)
                && Objects.equals(name, book.name)
                && Objects.equals(author, book.author)
                && Objects.equals(categorize, book.categorize)
                && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, name, author, categorize, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", categorize='" + categorize + '\'' +
                ", year=" + year +
                '}';
    }
}
