package com.nicolas.savoini.Module3aHibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="countries")
@Data
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(length = 50)
    String name;

    @Column(name = "pop")
    Long population;

    @Column
    String nameInOfficialLanguage;

}
