package app.repository;

import app.entity.MyFeedback;
import app.query.PictureQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PictureRepositoryImpl implements IPictureRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override

    public void save(MyFeedback feedback) {
        entityManager.persist(feedback);
    }

    @Override
    public List<MyFeedback> findAll() {
        List<MyFeedback> feedbacks;
        TypedQuery<MyFeedback> query = (TypedQuery<MyFeedback>) entityManager.createNativeQuery(PictureQuery.FIND_BY_DATE, MyFeedback.class);
        feedbacks = query.getResultList();
        return feedbacks;
//        return entityManager.createQuery("from MyFeedback", MyFeedback.class).getResultList();
    }

    @Override
    public void updateLike(long id) {
        MyFeedback feedback = entityManager.find(MyFeedback.class, id);
        feedback.setLikes(feedback.getLikes() + 1);
        entityManager.persist(feedback);
    }
}
