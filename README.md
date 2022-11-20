# Class
Java Classes/Objects
Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

### Constructor
A constructor is a block of code that will be run when a class is instantiated. Instantiation is the process of Java creating an instance of an object in memory according to the class type. To start the process of instantiation, we use the `new` keyword. A constructor is executed once per object that gets created.

Below is the syntax of a constructor:

```java
public class SpecialClass {

  // below is a no-arg constructor
  public SpecialClass(){
      …
  }

}
```

In this particular example, we created a `no-arg constructor`, meaning the constructor does not take in any arguments. If we did not create any constructors within a class, a default no-arg constructor is created by the compiler instead.

The `default no-arg constructor` is like starting the person with a blank slate. No hair color, no height, or weight; each value would be empty (null) or 0 for numerical values.

## Object
An instance of a particular class; also the core concept of the OOP

When we `intantiate` a Class, the `new` instance is placed in a `reference variable`. Observe:
```java
/*
car = Reference Variable
*/
Car car = new Car();
```

## Nodding Acquaintance
| Keyword      | Description |
| ----------- | ----------- |
| `initialize`      | `initialize` - set to the value or put in the condition appropriate to the start of an operation. So this is the starting point of our variable when we give it a value. We initialize the variable to a value. For example: <br />   ```int initialized = "variable" ```  |
| `instantiate`   | instantiate - represent as or by an instance. When we create an object we instantiate it by creating an instance of the class. `MUST` always use the `new` keyword. <br/>   ``` Document hello = new Document(); ``` |

Learn more on [w3school](https://www.w3schools.com/java/java_classes.asp)