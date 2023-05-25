/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.spring.rest;

import com.pockocmoc.spring.rest.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author marat
 */
public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.showAllEmployee();
//        System.out.println(allEmployees);
//        
//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);
//        Employee employee = new Employee("Sveta", "Sokolova", "Sales", 670);
//        employee.setId(11);
//        communication.saveEmployee(employee);

            communication.deleteEmployee(3);

    } 
}
