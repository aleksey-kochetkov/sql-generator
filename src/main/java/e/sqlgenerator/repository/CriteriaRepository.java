package e.sqlgenerator.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class CriteriaRepository {
    @Autowired
    private EntityManager em;

    public void run() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
    }
}
