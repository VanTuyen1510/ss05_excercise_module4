package app.service;

import app.entity.MyFeedback;

import java.util.List;

public interface IPictureService {
    void save(MyFeedback feedback);
    List<MyFeedback> findAll();
    void updateLike(long id);
}
