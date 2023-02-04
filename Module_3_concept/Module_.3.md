# Module 3 - Spring Boot


## 1 - Hibernate

<details>

 <summary>See</summary>

 Hibernate is a framework to access databases.

 With Spring, you got two ways to access databases: JPA / Native.

In our code, we'll use JPA.


In order to Map the content of table to a Java Object, you need two pieces for code.
- An Entity, which represents a row
- A Repository, which represents how to access the row


Entity For a Person
```
@Entity(name = "persons")

public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String name;

}

```

Repository for the Person Entity
```
public interface CountryRepository extends CrudRepository<PersonEntity, Long> {}
```

Spring provide a number of base classes for Repository.

CrudRepository is the basic one and allow us to CReate, Update, Delete objecxt in database.

For example, PageAndSortingRepository is aother clss, based on CrudRepository that provide options for pagination, and sorting.


</details>



## 2 - Rest API

<details>

 <summary>See</summary>


</details>



## 3 - Extra

### a - Profiles

<details>

 <summary>See</summary>


</details>


### b - Security

<details>

 <summary>See</summary>


</details>


