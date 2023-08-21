package app.entity;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Table(name = "MyFeedback")
@Entity
public class MyFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int rate;
    private String author;
    private String comment;
    private String initDate;

    @ColumnDefault("0")
    private long likes;

    public MyFeedback() {

    }

    public MyFeedback(long id, int rate, String author, String comment, long likes) {
        this.id = id;
        this.rate = rate;
        this.author = author;
        this.comment = comment;
        this.likes = likes;
    }

    public MyFeedback(long id, int rate, String author, String comment, String initDate, long likes) {
        this.id = id;
        this.rate = rate;
        this.author = author;
        this.comment = comment;
        this.initDate = initDate;
        this.likes = likes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }
}
