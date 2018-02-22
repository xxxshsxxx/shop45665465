package ru.savgroup.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.usertype.UserType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "name can not be empty")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "surname can not be empty")
    private String surname;

    @Column(name = "email")
    @NotEmpty(message = "email can not be empty")
    private String email;

    @Column(name = "password")
    @NotEmpty(message = "password can not be empty")
    private String password;

    @Column(name = "pic_url_pat")
    private String userPic;

    @Column(name = "country_Id")
    @NotEmpty(message = "country can not be empty")
    private int countryId;

    @Column(name = "tel_1")
    private String tel1;

    @Column(name = "tel_2")
    private String tel2;

    @Column(name = "user_type")
    @Enumerated(EnumType.STRING)
    private UserType userType;
}
