package app.repository;

import app.entity.MyFeedback;

import java.util.List;

public interface IPictureRepository {
    void save(MyFeedback feedback);
    List<MyFeedback> findAll();
    void updateLike(long id);

}
