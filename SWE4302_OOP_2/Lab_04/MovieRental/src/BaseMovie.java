import java.util.Date;

public class BaseMovie {
    private String title;
    public Date releaseDate;
    private double duration;

    public BaseMovie(String title, Date releaseDate, double duration) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }
}
