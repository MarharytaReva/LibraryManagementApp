package Models;

public class Author {
    private int authorId;
    private String fullname;

    public Author()
    {
        fullname = "";
    }
    public Author(Author obj)
    {
       this(obj.authorId, obj.fullname);
    }

    public Author(String fullname) {
        this.fullname = fullname;
    }
    public Author(int authorId, String fullname) {
        this.authorId = authorId;
        this.fullname = fullname;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
