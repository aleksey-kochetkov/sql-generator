package e.sqlgenerator.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
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
        Root<Item> item = criteria.from(Item.class);
        select();
        TypedQuery<Item> query = em.createQuery(criteria);
        query.getResultList();
    }
}
