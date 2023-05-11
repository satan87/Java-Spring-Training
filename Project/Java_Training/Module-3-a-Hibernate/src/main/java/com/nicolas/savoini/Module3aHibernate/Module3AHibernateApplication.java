package com.nicolas.savoini.Module3aHibernate;

import com.nicolas.savoini.Module3aHibernate.entity.CountryEntity;
import com.nicolas.savoini.Module3aHibernate.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Module3AHibernateApplication {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {

		SpringApplication.run(Module3AHibernateApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {

		System.out.println("hello world, I have just started up");

		CountryEntity canada = new CountryEntity();
		canada.setName("Canada");
		canada.setPopulation(34_000_000L);
		canada.setNameInOfficialLanguage("Canada");
		countryRepository.save(canada);

		CountryEntity uk = new CountryEntity();
		uk.setName("United Kingdom");
		uk.setPopulation(60_000_000L);
		uk.setNameInOfficialLanguage("United Kingdom");
		countryRepository.save(uk);

		System.out.println("I have Save Canada");

		List<CountryEntity> countries = (List<CountryEntity>) countryRepository.findAll();

		System.out.println("I have " + countries.size() + " countries");

		countries.forEach(System.out::println);


		// Find By Exact name
		String countryNameToFind = "Italy";
		Optional<CountryEntity> italy = countryRepository.findByName(countryNameToFind);
		if(italy.isPresent()) {
			System.out.println(italy.get());
		} else {
			System.out.println("Cannot find country " + countryNameToFind);
		}



		// Find By Letter In Official
		List<CountryEntity> countries2 = countryRepository.withLetterInOfficialName("Canada");
		System.out.println(countries2);

	}

}
