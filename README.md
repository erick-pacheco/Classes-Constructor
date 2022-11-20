# Class
Java Classes/Objects
Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

<strong>State</strong> is an object's characteristics. For example, let's say we are working with a Dog object. What kind of state do you think a Dog should have? Here are some ideas:

- furColor
- name
- breed

<strong>Behavior</strong> is what an object can do. Some things a dog object could probably do are:

- bark
- sleep
- chewOnShoe

`Classes` can be used to define the state and behavior for the objects that are being created from them. In this lab, we'll learn about how to define and create objects.

There is one method required in all Java applications for your project to compile. That method is called the `main` method.

```java
public static void main(String args[]){
//body
}
```

The `main` method is an entry point of the Java program and will invoke all the other methods required by your program.

 

`public` - Non - public methods are not allowed to be executed by any program. For java runtime to execute the main method, it must be public.

`static` - When java runtime starts, there is no object of the class present. JVM needs to load the class into memory and call the main method. For this reason, the main has to be static.

`void` - In the Java programming language, every method needs to have a return type. Since the main method does not return anything, the return type is void

`main` - This is the method's name. When the java program starts, it looks for the main name. This name is fixed and cannot be changed.

`String[] args` or `String args[]` - The `main` method accepts a single argument of the type String array. ***It is a Java command-line argument***. A mechanism through which the runtime system passes information to our application.


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

### Constructor
There are some distinct differences between a constructor and a method that we should cover.

constructors help initialize the state of our objects.
constructors ALWAYS have the SAME NAME OF THE CLASS they are located in.
constructors DO NOT have return types.
constructors are invoked implicitly: if you are using the default no-argument constructor provided by Java, you do not have to create one yourself.

***It is called a constructor because it builds or constructs the values at the time of object creation.***


### Methods
Methods, on the other hand:

A method is the behavior of our objects.
A method MUST have a return type.
A method is invoked explicitly.
The compiler does not provide a method.
A method name may or may not match the name of the class, although it is best practice that it doesn’t match the name of the class.

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