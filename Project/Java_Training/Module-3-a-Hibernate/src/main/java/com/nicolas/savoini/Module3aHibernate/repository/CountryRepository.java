package com.nicolas.savoini.Module3aHibernate.repository;

import com.nicolas.savoini.Module3aHibernate.entity.CountryEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<CountryEntity, Long> {

    Optional<CountryEntity> findByName(String name);

    @Query(value = "select c from countries c where nameInOfficialLanguage = :c")
    List<CountryEntity> withLetterInOfficialName(String c);

}
