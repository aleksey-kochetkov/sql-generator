package e.sqlgenerator.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import e.sqlgenerator.model.Item;

@Repository
public class CriteriaRepository {
    @Autowired
    private EntityManager em;

    public void run() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Item> criteria = builder.createQuery(Item.class);
    }
}
