package ru.savgroup.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Atributes")
@Entity
public class Atributes {
    @Id
    @Column
    private int id;

    @Column(name = "atrib_name")
    @NotEmpty(message = "atribute name can not be empty")
    private  String atributeName;

    @Column(name = "category_id")
    @NotEmpty(message = "category can not be empty")
    private int categoryId;

    @Column(name = "atrib_type")
    @Enumerated(EnumType.STRING)
    private String atributeType;
}
