package app.service;

import app.entity.MyFeedback;
import app.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements IPictureService {

    @Autowired
    IPictureRepository pictureRepository;


    @Override
    public void save(MyFeedback feedback) {
        pictureRepository.save(feedback);
    }

    @Override
    public List<MyFeedback> findAll() {
        return pictureRepository.findAll();
    }

    @Override
    public void updateLike(long id) {
        pictureRepository.updateLike(id);
    }
}
