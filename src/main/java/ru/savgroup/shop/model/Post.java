package ru.savgroup.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Post")
@Entity
public class Post {

    @Id
    @Column
    @NotEmpty
    private int id;

    @Column(name = "title")
    @NotEmpty(message = "title can not be empty")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    @NotEmpty(message = "price can not be empty")
    private double price;

    @Column(name = "timestamp")
    @NotEmpty
    private String timestamp;

    @ManyToOne()
    private User user;

    @Column(name = "category_id")
    @NotEmpty(message = "category can not be empty")
    private int categoryId;

    @Column(name = "country_id")
    @NotEmpty(message = "region can not be empty")
    private int countryId;
}
