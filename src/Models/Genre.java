package Models;

public class Genre {
    private int genreId;
    private String genreName;
    public Genre()
    {
        genreName = "";
    }
    public Genre(Genre obj)
    {
        this(obj.genreId, obj.genreName);
    }
    public Genre(String genreName)
    {
        this.genreName = genreName;
    }
    public Genre(int genreId, String genreName)
    {
        this.genreId = genreId;
        this.genreName = genreName;
    }

    public int getGenreId() {
        return genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}
