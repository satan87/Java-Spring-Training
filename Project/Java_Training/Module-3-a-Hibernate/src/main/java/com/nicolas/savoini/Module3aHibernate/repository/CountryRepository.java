package com.nicolas.savoini.Module3aHibernate.repository;

import com.nicolas.savoini.Module3aHibernate.entity.CountryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<CountryEntity, Long> {
}