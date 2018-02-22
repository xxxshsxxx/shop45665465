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
@Table(name = "country")
@Entity

public class Country {

        @Id
        @Column
        private int id;

        @Column(name = "region")
        @NotEmpty(message = "State can not be empty")
        private String region;

        @Column(name = "region_parent_id")
        @NotEmpty(message = "Region can not be empty")
        private int regionParentId;

    }


