package com.example.employeemanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = DataGenerator.generateEmployees();
        List<String> empOlderThan40 = employees.stream().filter(e -> e.getAge() > 40).map(Employee::getName).toList();
        System.out.println(empOlderThan40);

        List<String> uniqueDepartments = employees.stream().map(employee -> employee.getDepartment().name()).distinct().toList();
        System.out.println(uniqueDepartments);

        List<String> projects =  employees.stream().flatMap(employee -> employee.getProjects().stream()).map(Project::getProjectName).distinct().toList();
        Stream<Project> streamOfProjects = employees.stream().flatMap(employee -> employee.getProjects().stream());
        System.out.println(projects);

        Map<String,List<Employee>> groupedByDepartmentName = employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment().name()));

        System.out.println(groupedByDepartmentName);
    }
}
