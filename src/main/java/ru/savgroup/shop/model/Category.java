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
@Table(name = "category")
@Entity
public class Category {
    @Id
    @Column
    private int id;

    @Column(name = "category_name")
    @NotEmpty(message = "category can not be empty")
    private String categoryName;

    @Column(name = "parent_id")
    @NotEmpty(message = "parent category can not be empty")
    private int parentID;

}
