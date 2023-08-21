package app.query;

public class PictureQuery {
    private PictureQuery() {
    }

    public static final String FIND_BY_DATE = "SELECT * FROM MyFeedback WHERE initDate = CURDATE()";
}
