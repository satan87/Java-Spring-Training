# Module 2 - Object-Oriented Programming (OOP)

## General



### 1 - Inheritance

<details>

 <summary>See</summary>

Inheritance is the action to based a class on another class.

In Java, we use the word extends.

```
public class Vehicule {...}

public class Car extends Vehicule {...}
```

*Attention* : In Java multiple inheritance is not possible, i,e, a class can only extends one class.

```
public class Mamal {...}

public class Human {...}

public class Person extends Mamal, Human {...} // This is not correct
```


A class can extends an extended class, this is correct:

```
public class Mamal {...}

public class Human extends Mamal {...}

public class Person extends Human {...} 
```

Inheritance is use to create smaller object with well define behavior.


It also helps for code re-use.


**Abstract** class

An abstract class is a class that cannot be instanciated.

It usually contains one or more abstract method.

When a class extends an abstract class, it has to implements all the extract method. 

If it does not, then the class will also be abstract.



</details>


## Interface

<details>

 <summary>See</summary>

A interface defines a protocol for a class to follow.

If a class "agrees" tp follow an interface, it implements it.

```
public class Car implement Drivable { }
```

A class Car implements multiple interfaces.

```
public class FlyingCar implements Drivable, Flyable { }
```

An Interface can extens one or more interface

```

public Interface Drivable {...}

public Interface Flyable

public Interface FlyAndDrive extends Drivable, Flyable

```

Note the keywork extends for an interface to "extends" another interface.

Interface are usually used to describe a possible action for multiple class.

For example, the Java Interface Serialisable indicates that the class can be serialize, the Interface Comparable means the class can be compare to another object, etc.


**Default** method in interface


A default method in an interface is a method wih code.

This was created to assure backward compatibility.


**Static** method in interface

Interface can also define static method.

It is the same as Default, the implementation of the method will be inside the interface.

The idea is to allow the developer to group method that would make sense to be in the interface.



**Functional** interface

A functional interface is noted with the annotation @FunctionalInterface

A functional interface can have only one method. If you try to add more it will not compile.

A functional interface can contains default method.


</details>


## Record

<details>

 <summary>See</summary>




</details>

