package com.example.employeemanagement;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Employee> generateEmployees() {
        Project p1 = new Project("Project Alpha", "Client A", 150000);
        Project p2 = new Project("Project Beta", "Client B", 200000);
        Project p3 = new Project("Project Gamma", "Client C", 250000);
        Project p4 = new Project("Project Delta", "Client D", 300000);

        Employee e1 = new Employee("Alice Johnson", 30, Department.DEVELOPMENT, 85000, Arrays.asList(p1, p2));
        Employee e2 = new Employee("Bob Smith", 45, Department.HR, 75000, List.of(p1));
        Employee e3 = new Employee("Charlie Lee", 28, Department.SALES, 65000, Arrays.asList(p2, p4));
        Employee e4 = new Employee("Diana Prince", 35, Department.MARKETING, 70000, Arrays.asList(p1, p3));
        Employee e5 = new Employee("Evan Davis", 50, Department.FINANCE, 95000, List.of(p4));
        Employee e6 = new Employee("Fiona Gallagher", 32, Department.DEVELOPMENT, 88000, Arrays.asList(p2, p3));
        Employee e7 = new Employee("George Martin", 29, Department.SALES, 62000, List.of(p1));
        Employee e8 = new Employee("Hannah Brown", 42, Department.HR, 77000, Arrays.asList(p3, p4));
        Employee e9 = new Employee("Ian Clark", 37, Department.MARKETING, 72000, List.of(p2));
        Employee e10 = new Employee("Jane Doe", 26, Department.DEVELOPMENT, 80000, Arrays.asList(p1, p4));

        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }
}