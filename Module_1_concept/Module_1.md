# Module 1 - Concept

## General

Java is object-oriented programming (OOP) language.

It started in 1995, and we are now (Nov 2022) at version 19.

Java is supposed to be portable, so it compile into bytecode instead of classic computer code.

To read that bytecode, you need a Java Virtual Machine (JVM).

[Wiki| https://en.wikipedia.org/wiki/Java_(programming_language)]


## New Version

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

[wiki | https://en.wikipedia.org/wiki/Java_version_history]


## Variable Scope

The scope of a variable define where in the code a variable can be used.

There are three (3) scopes:

- Global
  The variable is accessible from anywhere in the code

- Function
  The variable is accessible only inside the function, or the class

- Local
  The variable is accessible inside the closest curly bracket ({})

See example ...


## Ternary

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



## Optional


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



## Lambda

Lambdas have been around since Java 8.

Lambdas are all about pfuntional programtion, and funtion.

With lambdas, functions become its own object and can be a return type, or a parameter.

Lmabdas works great with the API Stream Interface in Java. It allows you to go through collections with minimum code.

[Stream Javadoc|https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html]

The function will see are:
- Map
- Flatmap
- Filter
- Reduce

To follow the flow from old type loop to stream, please refer to below table.


| ID | CONCEPT  |                                                         | PRO               | CON                                                             | CHAINABLE | USE                                               | EXAMPLE                                                              | RESULT      |
|----|----------|---------------------------------------------------------|-------------------|-----------------------------------------------------------------|-----------|---------------------------------------------------|----------------------------------------------------------------------|-------------|
| 0  | No loop  | Easiest method, copy/paste de the code                  | Easy, for beginer | Duplicated code                                                 | NO        | NEVER                                             | ```java System. out .println( "Apple" ) ; System. out .println( "Peach" ); ```  | Apple Peach |
| 2  | FOR loop | Classic for loop Uses an index to go throught the array | Easy to code      | Verbose code  Not always easy to read  Slower than other method | NO        | First time to make the code work  Always refactor | ```java for  (int i = 0; i < 10 ; i++) {    System.out.println("I = " + i);}``` | 1 2 ... 10  |
|    |          |                                                         |                   |                                                                 |           |                                                   |                                                                      |             |












