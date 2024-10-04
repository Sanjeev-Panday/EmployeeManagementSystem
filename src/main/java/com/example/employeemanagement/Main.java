package com.example.employeemanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = DataGenerator.generateEmployees();
        // Task 1 : Find all employees older than 40 and collect their names into a list.
        List<String> empOlderThan40 = employees.stream()
                .filter(e -> e.getAge() > 40)
                .map(Employee::getName)
                .toList();

        // Task 2: Create a list of all unique department names where employees work.
        List<String> uniqueDepartments = employees.stream()
                .map(employee -> employee.getDepartment().name())
                .distinct()
                .toList();

        // Task 3: List all unique project names that employees are working on.
        List<String> projects =  employees.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .map(Project::getProjectName)
                .distinct()
                .toList();

        // Task 4: Group employees by their departments.
        Map<String,List<Employee>> groupedByDepartmentName = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment().name()));

    }
}
