import java.util.Objects;

public class Books {

    private String name;
    private String author;
    private String categorize;

    public Books() {
    }

    public Books(String name) {
        this.name = name;
    }

    public Books(String name, String author, String categorize) {
        this.name = name;
        this.author = author;
        this.categorize = categorize;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(name, books.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", categorize='" + categorize + '\'' +
                '}';
    }

}
