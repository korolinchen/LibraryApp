import java.util.Objects;

public class BookOfLibrary {

    private String bookTitle;
    private String authorSurname;
    private String authorFirstName;
    private String yearOfPublication;

    public BookOfLibrary() {
    }

    public BookOfLibrary(String bookTitle, String authorSurname, String authorFirstName, String yearOfPublication) {
        this.bookTitle = bookTitle;
        this.authorSurname = authorSurname;
        this.authorFirstName = authorFirstName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookOfLibrary book = (BookOfLibrary) o;
        return Objects.equals(bookTitle, book.bookTitle) && Objects.equals(authorSurname, book.authorSurname) && Objects.equals(authorFirstName, book.authorFirstName) && Objects.equals(yearOfPublication, book.yearOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, authorSurname, authorFirstName, yearOfPublication);
    }

    @Override
    public String toString() {
        return bookTitle + "," + authorSurname + "," + authorFirstName + "," + yearOfPublication + " ";
    }
}
