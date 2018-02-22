package ru.savgroup.shop.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class PostPicture {
    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column(name = "pic_pat")
    private String picUrl;

    @Column
    @ManyToOne
    private Post post;
}
