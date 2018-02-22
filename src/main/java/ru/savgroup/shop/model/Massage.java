package ru.savgroup.shop.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Massage")
@Entity

public class Massage {
    @Id
    @Column
    @NotEmpty
    private int id;

    @Column(name = "text")
    @NotEmpty(message = "name can not be empty")
    private String text;

    @Column(name = "to_id")
    @NotEmpty
    private int toId;

    @Column(name = "from_id")
    @NotEmpty
    private int fromId;

    @Column(name = "timestamp")
    @NotEmpty
    private String timestamp;
}
