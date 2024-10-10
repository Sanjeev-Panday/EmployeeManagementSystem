# Employee Management System 🚀

Welcome to the **Employee Management System** project! This is not your ordinary project—it's a fun, hands-on way to master Java  **Streams** and **Functional Interfaces** with real-world-inspired challenges. Whether you're a seasoned developer looking to level up your functional programming skills or someone curious about the power of Java streams, you're in the right place! 💻

![Java Streams](https://img.shields.io/badge/Java-Streams%20%26%20Functional%20Programming-blue) ![Lombok](https://img.shields.io/badge/Project-Lombok-orange) ![GitHub](https://img.shields.io/badge/Practice-Challenge%20Mode-brightgreen)

## 🔥 Project Overview

The **Employee Management System** is a mock organizational system where you'll interact with a dataset of employees, departments, and projects. This project is designed to help you practice Java 8 features, specifically **Streams**, **Lambdas**, **Functional Interfaces**, and **Lombok**.

Here’s a sneak peek of what you'll be working with:
- Employees with attributes like `name`, `age`, `department`, `salary`, and the projects they're working on.
- A system that simulates real-world data processing tasks.
- **Lombok** annotations to reduce boilerplate code, letting you focus on business logic and functional programming.

## 📂 Project Structure

```plaintext
EmployeeManagementSystem/
├── src/
│   └── com/
│       └── example/
│           └── employeemanagement/
│               ├── Solution.java
│               ├── Employee.java
│               ├── Department.java
│               ├── Project.java
│               └── DataGenerator.java
├── README.md
├── pom.xml (for Maven dependencies)
```

## 🏆 The Challenges

Below is a series of fun challenges (tasks) that you can complete to master Java 8 Streams and Functional Interfaces. Each task will help you explore a new aspect of the Java Streams API. Treat this as a game: solve each task, and you'll be one step closer to becoming a Java 8 master!

### 1. Filter and Collect

*Challenge:* Find all employees older than 40 and collect their names into a list.

💡 *Hint:* Use `filter()` and `map()` operations.

### 2. Mapping and Collecting

*Challenge:* Create a list of all unique department names where employees work.

💡 *Hint:* Use `map()` and `distinct()`.

### 3. FlatMapping

*Challenge:* List all unique project names that employees are working on.

💡 *Hint:* Use `flatMap()` to flatten the project lists and `map()` to extract the project names.

### 4. Grouping

*Challenge:* Group employees by their departments.

💡 *Hint:* Use `Collectors.groupingBy()`.

### 5. Partitioning

*Challenge:* Partition employees into two groups based on whether they earn more than $80,000.

💡 *Hint:* Use `Collectors.partitioningBy()`.

### 6. Reducing

*Challenge:* Calculate the total salary expenditure of the company.

💡 *Hint:* Use `mapToDouble()` and `sum()` or `reduce()`.

### 7. Custom Collector

*Challenge:* Implement a custom collector to concatenate all employee names, separated by commas.

💡 *Hint:* Use `Collector.of()` to create a custom collector.

### 8. Parallel Streams

*Challenge:* Use parallel streams to process employees and find the maximum salary.

💡 *Hint:* Use `parallelStream()` and `max()`.

### 9. Functional Interfaces

*Challenge:* Create a custom `FunctionalInterface` named `EmployeePredicate` that tests an `Employee` object based on some criteria (e.g., age > 30 and department is DEVELOPMENT). Use it to filter employees.

💡 *Hint:* Define an interface with a method `boolean test(Employee e)`.

### 10. Optional Usage

*Challenge:* Safely handle retrieval of an employee who may or may not exist in the list (e.g., find an employee named "Zoe").

💡 *Hint:* Use `findFirst()` and wrap the result in an `Optional`.

### 11. Statistics with Collectors

*Challenge:* Compute statistical data such as average age, total salary, and count of employees.

💡 *Hint:* Use `Collectors.summarizingDouble()` and `Collectors.averagingInt()`.

### 12. Chaining Stream Operations

*Challenge:* Find the names of clients whose projects are handled by employees in the SALES department.

💡 *Hint:* Combine `filter()`, `flatMap()`, and `map()`.

### 13. Exception Handling in Streams

*Challenge:* Handle potential exceptions when accessing project budgets (e.g., if a project budget is negative, throw an exception).

💡 *Hint:* Use `peek()` for debugging and handle exceptions within lambda expressions.

### 14. Function Composition

*Challenge:* Compose two functions: one that takes an `Employee` and returns their name, and another that takes a name and returns it in uppercase. Apply the composed function to all employees.

💡 *Hint:* Use `Function.andThen()` or `Function.compose()`.

### 15. Sorting with Custom Comparator

*Challenge:* Sort the list of employees first by department, then by salary in descending order.

💡 *Hint:* Use `Comparator.comparing()` with `thenComparing()`.


## 📝 Incremental Solutions

We believe the best way to master Java Streams and Functional Interfaces is by tackling challenges head-on. That's why we've included the **`Solution.java`** file, where solutions to the tasks are being added **incrementally**. But here's the catch — we highly encourage you to **try solving the challenges on your own first** before peeking into the answers. 💡

Think of **`Solution.java`** as your safety net — when you're stuck or want to compare your approach, feel free to refer to it for guidance or validation. We'll be updating it over time with elegant solutions, but the real growth comes from experimenting and solving the tasks yourself! 🎯

Remember, **the journey is more important than the destination**, so have fun, and don't be afraid to make mistakes. Happy coding! 🚀
