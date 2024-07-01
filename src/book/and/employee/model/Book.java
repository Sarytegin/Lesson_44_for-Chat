package book.and.employee.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private String image;
    private boolean isIssued;
    private Employee issuedTo;

    public Book(int id, String title, String author, String image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.image = image;
        this.isIssued = false;
        this.issuedTo = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public Employee getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(Employee issuedTo) {
        this.issuedTo = issuedTo;
    }
}
