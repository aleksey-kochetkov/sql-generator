package e.sqlgenerator.repository;

import java.math.BigDecimal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import e.sqlgenerator.model.Trade;

@Repository
public class CriteriaRepository {
    @Autowired
    private EntityManager em;

    public void run() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<BigDecimal> criteria = builder.createQuery(BigDecimal.class);
        Root<Trade> trade = criteria.from(Trade.class);
        criteria.multiselect(trade.get("buy"));
        criteria.groupBy(trade.get("buy"));
        criteria.orderBy(builder.desc(trade.get("buy")));
        TypedQuery<BigDecimal> query = em.createQuery(criteria);
        query.getResultList();
    }
}
