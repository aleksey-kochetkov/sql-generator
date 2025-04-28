package e.sqlgenerator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table
public class Item {
    @Id
    private String num;
    @Column
    private String name;
}
