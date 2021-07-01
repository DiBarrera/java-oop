# Java OOP

## Acquired knowledge about Object Oriented Java and the application of the four pillars of OOP: Encapsulation, Abstraction, Inheritance and Polymorphism.

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#Overviwe">Overviwe</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
    <li><a href="#Topics-reviewed">Topics reviewed</a></li>
    <li><a href="#Basics">Basics</a></li>
    <li><a href="#Acquired-skills">Acquired skills</a></li>
  </ol>
</details>



<!-- Overviwe -->
## Overviwe

In this repository you will find a brief summary of what was learned in the [platzi](https://platzi.com/cursos/java-oop/) course of Java SE Object Oriented.

---------

In Java you can apply the programming paradigms, which are a theory that provides a base and standardized model to solve problems in the code. The OOP helps in the analysis and understanding for the solution of problems in a sustainable way in the future.

---------

This repository is divided into the following parts.
* The steps to clone the repository and be able to view it.
* The main topics seen in the course
* Some of the basics concepts taught.
* Skills acquired at the end of the course.



<!-- GETTING STARTED -->
## Getting Started

## Setup

- Fork this repo
- Clone this repo

```shell
$ mkdir java-oop
$ cd java-oop
$ git clone https://github.com/DiBarrera/java-oop
```

You will find the following files:

- **A src directory**, Containing a Main.java file and two directories, 
- A model directory, and a ui, inside model are the files for creating a project to make appointments with a doctor. 
- Inside ui ther's our directory of user interface.
- There are no dependencies, so nothing more is necessary than cloning it.........

**Tree**

```markdown
.
├── README.md
└── src
    ├── Main.java
    ├── model
    │   ├── AppointmentDoctor.java
    │   ├── AppointmentNurse.java
    │   ├── Doctor.java
    │   ├── ISchedulable.java
    │   ├── Nurse.java
    │   ├── Patient.java
    │   └── User.java
    └── ui
        ├── UIDoctorMenu.java
        ├── UIMenu.java
        └── UIPatientMenu.java
```



<!-- Topics reviewed -->
## Topics reviewed

The topics seen are an introduction to what Java is, how it is composed, the most used tools, how to create a development environment and basic concepts on how to program in Java, all under the WORA philosophy (Write Once, Run Anywhere).
This course was followed using the IntelliJ IDEA IDE.

### Topics

- What is and Object.
- UML.
- Properties of an Object.
- Behavior of an Object.
- Classes in Java.
- Classes to generate more objects.
- Modularity: 
- To reuse code.
- Improve readability.
- Fast troubleshooting.
- Creating a class.
- Constructor method.
- Variables and static methods.
- Create static elements.
- Constant variables.
- Constructor overload.
- Memory types: Stack and Heap.
- Encapsulation: Access Modifiers.
- Getters and Setters.
- Instantiate arrays.
- Nested classes.
- Array and Arraylist.
- Inner and local classes of a method.
- Enumeration.
- Inheritance.
- Super and This.
- Polymorphism: Method Overwriting.
- Interfaces.
- Collections.
- Mapping: HashMap, LinkedHashMap, TreeMap.
- Abstract classes.
- Abstract members.
- Anonymous classes.
- Differences between Interfaces and Abstract classes.
- Interface inheritance.




<!-- Basics -->
## Basics

### Creating a class

#### Declaring an object
```markdown
// Type of Object ---- Object Name
Doctor myDoctor;
``` 

#### Instantiate an Object
```markdown
// Object name ---- Base class to create some kind of objects
myDoctor = new Doctor();

// Another Object
anotherDoctor = new Doctor();
``` 

#### Declare and instantiate an object on the same line
```markdown
// Declare the object ---- Instantiate the object
Doctor myDoctor = new Doctor();
``` 

#### Using the object
```markdown
// Declare the object ---- Instantiate the object
Doctor myDoctor = new Doctor();
myDoctor.name = "Diego Barrera";
myDoctor.showName();
``` 

### Constructor method
```markdown
// Instance name = new ConstructorMethod();
myDoctor = new Doctor();
``` 

#### configure the behavior of our object
```markdown
public class Doctor {
  // Attributes...

  // Constructor Method:
  Doctor(/* parameters */) {
    // Instructions that are executed when creating / instantiating
    // a new object with the class Doctor ...
  }
}
``` 

### Statci variables

#### Accessing method
```markdown
Doctor myDoctor = new Doctor();
myDoctor.showName();
``` 

### Constant variables

#### Creating a constant variable with final
```markdown
public class Calculator {
  public static final double
  PI = 3.1415926
}
``` 

#### Getters and Setters
```markdown
public class Patient {
  private String name;

  public String getName() {
    return "Patient name is " + this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }
}
``` 

#### Nested classes
```markdown
class OutterClass {
  ... class NestedClass {
  }
}
``` 


#### Enumerations
```markdown
public enum Numbers {
	One, Two, Three, Four, Five, Six, Seven, Eight, Nine
}
``` 

#### Inheritance
```markdown
public class SuperClass {
  // ...
}

public class SubClass extends SuperClass {
  // ...
}
``` 

#### Super and This
```markdown
public class User {
  // Super class
}
public class aUser extends User {
  // Subclass
}
``` 

#### Polymorphism
```markdown
class SuperClass {
  public void serveralInstructions() {
    Syste.out.println("What serveral instrucionts does")
  }
}

class subClass1 extends SuperClass {
  public void doesInstructions() {
    Syste.out.println("What an instruction 1 does")
  }
}

class subClass2 extends SuperClass {
  public void doesInstructions() {
    Syste.out.println("What an instruction 2 does")
  }
}
``` 

#### Interfaces
```markdown
public interface IsAnInterface {
  instructions(Instr1 instr1, string DoThis);
}
public class Instruction1
implements IsAnInterface {

}
``` 

#### Abstract class
```markdown
public abstract class GeometricFigures {
  // ...
}

class Circle extends GeometricFigures {
  // ...
}
``` 

#### Abstract members
```markdown
public abstract class Figure {
  abstract void drwaAFigure(); // Mandatory
  void drawA3DFigure(); // Not mandatory
}

class Square extends Figure {
  void draw() {
    // Instructions for drawing a circle...
  }
}
``` 


#### Anonymous classes
```markdown
// Abstract class:
public abstract class Figure {
  abstract void draw();
}

// Anonymous class:
Figure figure = new Figure() {
  @Override
  public void showFigureDetails() {
    // Instructions...
  }
};
``` 

#### Differences between interfaces and abstract classes
| Abstrac class      | Interface                         |
| ------------- | ------------------------------ |
| Define subclasses. Reuse methods from your super class.     | Abstract and non-abstract methods. |
| Instances cannot be used, only inheritance.     | The methods can be implemented in many families. |
| Cannot create objects.     | Focuses on the behavior that can bring to a class. |
| Only used to redefine new classes without creating new objects.     | Non-linear implementation. |

#### Interfaces
```markdown
public interface MyInterface {
  // Default methods: allows us to inherit the definition
  // of the function and its implementation...
  default void defaultMethod() {
    privateMethod("Hello from the default method!");
  }

  // Private methods: allow us to define behavior,
  // but it can only be used from other classes of this interface, 
  // it is not inherited to the child class
  private void privateMethod(final String message) {
    System.out.println(message);
  }

  // Abstract methods:
  // All methods are abstract by default...
  void normalMethod(); {
}
``` 




<!-- Acquired skills -->
## Acquired skills

- Write my own Object Oriented programs.
- Create classes.
- Use the 4 pillars of the OOP:
- Inheritance, Abstraction, Encapsulation and Polymorphism.
