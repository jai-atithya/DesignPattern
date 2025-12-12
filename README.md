# Builder Pattern

This repository demonstrates different ways to implement the **Builder Design Pattern** in Java.  

**Category:** Creational Design Pattern  

The Builder pattern is a **creational design pattern** that helps in constructing complex objects step by step.  
It separates the construction of an object from its representation, allowing the same construction process to create different representations.

---

## Table of Contents

- [Without Builder](#without-builder)
- [With Builder - Separate](#with-builder---separate)
- [With Builder - Inner](#with-builder---inner)
- [With Builder and Director](#with-builder-and-director)

---

## Without Builder

In this approach, objects are created **directly using constructors** or setters.  
This can become **complex and hard to maintain** when the object has many fields or optional parameters.

---

## With Builder - Separate

Here, a **separate Builder class** is used to construct the object step by step.  

- Builder class contains methods to set optional and required fields.
- The `build()` method returns the final object.
- Improves readability and maintainability.

---

## With Builder - Inner

This variation uses an **inner static Builder class** inside the main class.  

- Builder is defined inside the class it builds.
- Cleaner syntax: `ClassName.Builder()`
- Keeps the builder closely coupled with the class it constructs.
- Common in modern Java implementations.

---

## With Builder and Director

This approach introduces a **Director class** that controls the building process.  

- Director knows the sequence of steps to construct an object.
- Useful when multiple types of objects are constructed using the same building steps.
- Builder handles individual step details, Director orchestrates construction.

---

Thank you for visiting this repository.  
If you find it helpful, consider starring it on GitHub.  
Peace ✌️
