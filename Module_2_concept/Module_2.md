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




</details>


## Record

<details>

 <summary>See</summary>


</details>

