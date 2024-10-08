package com.example.employeemanagement;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution {
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

        // Variants:
        //Map<K, D> result = stream.collect(Collectors.groupingBy(classifier, downstreamCollector));
        //Grouping Employees by Department and Counting Them
        Map<Department, Long> empCountPerDepartment = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment, Collectors.counting()));

        //Grouping Employees by Department and Summing Their Salaries
        Map<Department, Double> totalSalaryPerDepartment = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));

        //Map<K, D> result = stream.collect(Collectors.groupingBy(classifier, supplier, downstreamCollector));
        // Grouping Employees by Department and Using a TreeMap for Sorted Keys
        Map<Department, List<Employee>> sortedEmployeePerDepartment = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment, TreeMap::new, Collectors.toList()));

        // Task 5: Partition employees into two groups based on whether they earn more than $80,000.

        Map<Boolean, List<Employee>> partitionBy80000 = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 80000));

        // Variant Get employee name
        Map<Boolean, List<String>> partitionBy80000Names = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 80000, Collectors.mapping(Employee::getName, Collectors.toList())));

        // Task 6: Calculate the total salary expenditure of the company.

        Double totalExpenditure = employees.stream().mapToDouble(Employee::getSalary).sum();

        // Task 7: Implement a custom collector to concatenate all employee names, separated by commas.
        String concatdNames1 = employees.stream().map(Employee::getName).collect(Collector.of(StringBuilder::new,
                (sb , name) -> {
                    if(!sb.isEmpty()) {
                        sb.append(", ");
                    }
                    sb.append(name);
                },
                (sb1, sb2) -> {
                    if(!sb1.isEmpty() && !sb2.isEmpty()){
                        sb1.append(", ");
                    }
                    return sb1.append(sb2);
                },
                StringBuilder::toString
                ));

        // Variant : with Joining
        String concatdNames2 = employees.stream().map(Employee::getName).
                collect(Collectors.joining(", "));


    }
}
