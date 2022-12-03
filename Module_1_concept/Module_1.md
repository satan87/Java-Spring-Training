# Module 1 - Concept

## General

Java is object-oriented programming (OOP) language.

It started in 1995, and we are now (Nov 2022) at version 19.

Java is supposed to be portable, so it compile into bytecode instead of classic computer code.

To read that bytecode, you need a Java Virtual Machine (JVM).

[Wiki| https://en.wikipedia.org/wiki/Java_(programming_language)]


### 1 - Versions

<details>

 <summary>See</summary>


Java now releases a new version every six (6) month.

Long Term Support (LTS) versions are main version supposed to stay and be maintained for a longer period of time (multiple years).

- Java 8 - LTS
  - Lambdas
  - Arrays.asList
  - Stream

- Java 9
  - takeWhile, dropWhile, iterate
  - Optionals
  - Private method Interface
  - Try with resource
  - HttpClient

- Java 10
  - var -> Type Inference
  - List.of (doesn't accept null value)

- Java 11 - LTS
  - String: isBlank, lines, strip, repeat
  - var for lambdas ((var s1, var s2) -> s1 + s2)
  - writeString, readString

- Java 12
  - Unicode 11

- Java 13
  - Switch
  - Multiline String (preview)

- Java 14
  - record (preview)

- Java 15
  - record (second preview)
  - sealed class (preview)
  - Multiline String

- Java 16
  - record
  - sealed class (second preview)
  - Pattern matching instanceof

- Java 17 - LTS
  - Sealed class

- Java 18

- Java 19
  - Record


Next LST will be Java 21 (September 2023)

[Wiki](https://en.wikipedia.org/wiki/Java_version_history)

</details>


## Variable Scope

<details>

 <summary>See</summary>

The scope of a variable define where in the code a variable can be used.

There are three (3) scopes:

- Class
  The variable is accessible from anywhere in the class

- Function
  The variable is accessible only inside the function, or the class

- Local
  The variable is accessible inside the closest curly bracket ({})

See example ...


### Static

A class variable, a function, or a class can be static.

A static object will exist only once in memory.

For example, if you declare a static variable for a class, then all instances of this class will share the same value. This value will be in memory only once.

If any instance changes the value, it will be updated for all instances.


### Final

All variables can be tag as final.

In this cases, the value of the variables cannot be change. 

We called them constants.


*Attention*: If you create a final variable for an object, you cannot change the object itself, but you can change the value of its properties.

```
final Cat cat = new Cat();
cat.setWeight(5); // This will works just fine
```

</details>


## Ternary

<details>

 <summary>See</summary>


The ternary operator is a quick way to handle IF cases.

You can use the ternary operator when you want to atribute a value to a variables, or return a value.

Example:

String string = "";

if (a == 1) {
  string = "one";
} else {
  string = "not one";
}

This can be simplify 

String string  = (a == 1) ? "one" : "not one";

the ? signifies THEN

the : signifies ELSE


Exercise with return.

</details>


## Optional

<details>

 <summary>See</summary>


Optional is a new Java type. 

It allows to declare that a variable can be null.  It is meant to avoid nNullPointerException.

Optional < String > string = Optional.of( ... );

The variable string can have 3 states:
- It contains a value (which can be the value null)
- It contains no value (it is empty)
- It is null

*Attention* : NULL and EMPTY are different state for Optional.

*Attention*: null is an ecceptable value for an Optional


    Optional<String> nullOptional = null;
    System.out.println(nullOptional); // print null
    if (nullOptional.isPresent()) { // Will throw an error : Cannot invoke "java.util.Optional.isPresent()" because "nullOptional" is null
      System.out.println("is present");
    }


    String n = null;
    Optional<String> nullString = Optional.ofNullable(n);
    System.out.println(nullString); // print Optional.empty


Optional are very useful when dealing with potention missing information like database request.


</details>

## Lambda

<details>

 <summary>See</summary>


Lambdas have been around since Java 8.

Lambdas are all about functional programing.

With lambdas, functions become an object that can be a return type, or a parameter.

Lmabdas works great with the API Stream Interface in Java. It allows you to go through collections with minimum code.

[Javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)

The function will see are:
- Map
- Flatmap
- Filter
- Reduce

To follow the flow from old type loop to stream, please refer to [html](https://raw.githack.com/satan87/Java-Spring-Training/main/Module_1_concept/lambda.html)



</details>


