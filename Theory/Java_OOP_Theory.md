# Java OOP – Theory Questions and Answers

### Q1. Explain the four basic principles of Object-Oriented Programming.

1. **Encapsulation:** Combining data and methods into a single unit called a class.
2. **Inheritance:** Allowing one class to acquire properties and methods from another class.
3. **Polymorphism:** Allowing the same method or operation to perform different tasks.
4. **Abstraction:** Hiding internal implementation details and showing only essential features.

### Q2. Differentiate between a class and an object in Java.

- **Class:** A blueprint or template used to create objects.
- **Object:** An instance of a class that contains data and methods.

### Q3. What is a constructor? Explain its main types.

A constructor is a special member of a class used to initialize objects. It has the same name as the class and does not have a return type.

Main types:
1. Default constructor
2. No-argument constructor
3. Parameterized constructor

### Q4. How does inheritance help in Java programming?

Inheritance allows a child class to reuse the properties and methods of a parent class. It reduces code duplication and improves code reusability.

### Q5. What is method overloading? Give its purpose.

Method overloading means defining multiple methods with the same name but different parameter lists. It allows similar operations to be performed with different inputs.

### Q6. Explain encapsulation with a simple example.

Encapsulation means wrapping variables and methods inside a class and restricting direct access to data.

For example, declaring variables as `private` and accessing them through public getter and setter methods.

### Q7. What is the difference between compile-time errors and runtime errors?

- **Compile-time errors:** Errors detected by the compiler before the program runs, such as missing semicolons.
- **Runtime errors:** Errors that occur while the program is executing, such as division by zero.

### Q8. Why is the main() method important in Java?

The `main()` method is the starting point of a Java application. The Java Virtual Machine (JVM) begins program execution from this method.

### Q9. What are access modifiers in Java? Name their types.

Access modifiers control the visibility and accessibility of classes, variables, methods and constructors.

The four access levels are:
1. `public` – Accessible from anywhere.
2. `private` – Accessible only within the same class.
3. `protected` – Accessible within the same package and through inheritance.
4. Default – Accessible within the same package.

### Q10. What is the use of the this and super keywords in Java?

- `this` refers to the current object of a class. It is commonly used to access current class variables and constructors.
- `super` refers to the immediate parent class. It is used to access parent class variables, methods and constructors.
