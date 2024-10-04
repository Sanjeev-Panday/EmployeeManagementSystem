package com.example.employeemanagement;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private String projectName;
    private String clientName;
    private double budget;
}