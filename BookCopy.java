public class BookCopy implements Borrowable {

    private int id;
    private boolean available;
    private Book book;

    public BookCopy(int id, Book book) {
        setId(id);
        setAvailable(true);
        setBook(book);
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    // Getters
    public int getId() {
        return id;
    }

    public boolean getAvailable() {
        return available;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public void borrowItem() {
        setAvailable(false);
    }

    @Override
    public void returnItem() {
        setAvailable(true);
    }

    @Override
    public boolean isAvailable() {
        return getAvailable();
    }

    @Override
    public String toString() {
        return "BookCopy [id=" + id + ", available=" + available + ", book=" + book.getTitle() + "]";
    }
}