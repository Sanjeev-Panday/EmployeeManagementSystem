package com.example.employeemanagement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    private String name;
    private int age;
    private Department department;
    private double salary;
    private List<Project> projects;
}