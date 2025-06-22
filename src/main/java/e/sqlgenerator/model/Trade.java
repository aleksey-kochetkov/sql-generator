package e.sqlgenerator.model;

import java.math.BigDecimal;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table
public class Trade {
    private Date date;
    private BigDecimal buy;

    @Id
    @Column
    public String getDate() {
        return date;
    }

    public void setCodeFrom(String codeFrom) {
        this.codeFrom = codeFrom;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public void setBuy(BigDecimal buy) {
        this.buy = buy;
    }
}
