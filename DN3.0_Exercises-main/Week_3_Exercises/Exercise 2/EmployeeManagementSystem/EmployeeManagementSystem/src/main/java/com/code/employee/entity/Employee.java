package com.code.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="employees")
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="email",nullable = false, unique = true)
    private String email;
    
    @Column(name="salary",nullable = false)
    private double salary;
//relationship with department one employee can work in one department
//under one department there will be many employees

    @ManyToOne  //relationship many to one
    @JoinColumn(name = "department_id", nullable = false)  //creating a foreign key department_id ref to the primary key of the department
    private Department department;
}
