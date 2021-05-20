package com.designpatterns.creational.builder;

/**
 * @author prachi.shah
 */
public class BuilderInitializer {

    public static void main(String[] args) {
        Employee employeeJane = new Employee("Jane", "Doe");
        Employee employeeJohn = new Employee("John", "Smith", "Engineering", "Mr. Good Manager");
        Employee employeeChristina = new Employee("Christina", "Delacruz", "1111 fake st", "Apt. 2222",
                "San Francisco", "California", "94111");
        Employee employeePaul = new Employee("Paul", "Harris", "1111 fake st", "Apt. 2222",
                "San Francisco", "California", "94111", "Engineering", "Mr. Good Manager");

        // Print Employee Details
        System.out.println(employeeJane.getEmployeeDetails());
        System.out.println(employeeJohn.getEmployeeDetails());
        System.out.println(employeeChristina.getEmployeeDetails());
        System.out.println(employeePaul.getEmployeeDetails());
    }
}
