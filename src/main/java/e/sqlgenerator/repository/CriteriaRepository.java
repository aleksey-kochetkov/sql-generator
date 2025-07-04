package e.sqlgenerator.repository;

import java.math.BigDecimal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.Tuple;
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
        CriteriaQuery<Tuple> criteria = builder.createQuery(Tuple.class);
        Root<Trade> trade = criteria.from(Trade.class);
        criteria.multiselect(trade.get("buy"), trade.get("buyQuantity"));
        criteria.groupBy(trade.get("buy"));
        criteria.orderBy(builder.desc(trade.get("buy")));
        TypedQuery<Tuple> query = em.createQuery(criteria);
        query.getResultList();
    }
}
