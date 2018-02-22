package ru.savgroup.shop.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "atribute_value")
@Entity
public class AtributeValue {

    @ManyToOne()
    private Post post;

    @ManyToOne()
    private Atributes atributes;

    @Column(name = "value")
    private String value;
}
