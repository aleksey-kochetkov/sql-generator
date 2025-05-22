package e.sqlgenerator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table
public class Trade {
    private String codeFrom;

    @Id
    @Column
    public String getCodeFrom() {
        return this.codeFrom;
    }

    public void setCodeFrom(String codeFrom) {
        this.codeFrom = codeFrom;
    }
}
