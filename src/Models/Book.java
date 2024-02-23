package Models;

public class Book {
    private int bookId;
    private String title;
    private int publishingYear;
    private String cover;
    private String description;
    private Author author;
    private Genre genre;


    public Book() {
        title = "";
        cover = "";
        description = "";
        author = new Author();
        genre = new Genre();
    }
    public Book(Book obj)
    {
        this(obj.bookId, obj.title, obj.publishingYear, obj.description, obj.author, obj.genre, obj.cover);
    }



    public Book(String title, int publishingYear, String description, Author author, Genre genre, String cover) {
        cover = (cover == null) ? "" : cover;
        this.title = title;
        this.publishingYear = publishingYear;
        this.cover = cover;
        this.description = description;
        this.author = new Author(author);
        this.genre = new Genre(genre);
    }


    public Book(int bookId, String title, int publishingYear, String description, Author author, Genre genre, String cover) {
        cover = (cover == null) ? "" : cover;
        this.bookId = bookId;
        this.title = title;
        this.publishingYear = publishingYear;
        this.description = description;
        this.author = new Author(author);
        this.genre = new Genre(genre);
        this.cover = cover;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return new Author(author);
    }

    public void setAuthor(Author author) {
        this.author = new Author(author);
    }

    public Genre getGenre() {
        return new Genre(genre);
    }

    public void setGenre(Genre genre) {
        this.genre = new Genre(genre);
    }
}
