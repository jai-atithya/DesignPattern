# Design Patterns

Greetings! Welcome to the **Design Patterns** repository.  
This project contains detailed explanations and implementations of the classic **Gang of Four (GoF)** design patterns.  
Each pattern is implemented on a dedicated branch for clarity and easy navigation.

---

## Table of Contents

- [What Are Design Patterns?](#what-are-design-patterns)
- [Gang of Four (GoF)](#gang-of-four-gof)
- [Creational Design Patterns (5)](#creational-design-patterns-5)
- [Structural Design Patterns (7)](#structural-design-patterns-7)
- [Behavioural Design Patterns (11)](#behavioural-design-patterns-11)
- [Viewing the Design Patterns](#viewing-the-design-patterns)

---

## What Are Design Patterns?

Design Patterns are **generalised, reusable solutions** to problems that frequently occur in software design.  
They serve as **blueprints** that help create scalable, maintainable, and flexible software systems.

---

## Gang of Four (GoF)

The GoF design patterns originate from the 1994 book  
**“Design Patterns: Elements of Reusable Object-Oriented Software.”**

It introduced **23 foundational design patterns**, grouped into three categories:

- **Creational**
- **Structural**
- **Behavioural**

---

# Creational Design Patterns (5)

Creational patterns deal with the **process of object creation**, providing more flexibility and control.

1. Singleton  
2. Factory Method  
3. Abstract Factory  
4. Builder  
5. Prototype  

---

# Structural Design Patterns (7)

Structural patterns define ways to **compose classes and objects** to form larger, well-structured systems.

1. Adapter  
2. Composite  
3. Proxy  
4. Decorator  
5. Facade  
6. Bridge  
7. Flyweight  

---

# Behavioural Design Patterns (11)

Behavioural patterns describe **interactions, communication, and algorithms** between objects within a system.

1. Template Method  
2. Strategy  
3. Observer  
4. Command  
5. State  
6. Chain of Responsibility  
7. Mediator  
8. Iterator  
9. Visitor  
10. Interpreter  
11. Memento  

---

## Viewing the Design Patterns

Each pattern is available on its **own branch** within this repository.

To explore a pattern:

1. Open the **Branches** section of the repository.  
2. Select the branch named after the design pattern.  
3. Review the implementation and explanation contained within that branch.

## Cloning a Specific Pattern

You have two ways to work with a specific design pattern branch:

### Method 1: Clone only the branch you need

```bash
git clone --branch [branchname] https://github.com/jai-atithya/DesignPattern.git --single-branch
```

Replace [branchname] with the name of the pattern branch you want to access.

Example: To clone the Builder pattern branch:
```bash
git clone --branch creational/builderPattern https://github.com/jai-atithya/DesignPattern.git --single-branch
```

This will download only that branch, keeping your local repository clean and focused.

---

### Method 2: Clone the whole repository and checkout the branch
```bash
git clone https://github.com/jai-atithya/DesignPattern.git
```
```bash
cd DesignPattern
```
```bash
git checkout [branchname]
```
Replace [branchname] with the name of the branch you want to switch to.
This method downloads the entire repository first, and then lets you switch to the desired branch.

---

Thank you for visiting this repository.  
If you find it helpful, consider starring it on GitHub.  
Peace ✌️

---
