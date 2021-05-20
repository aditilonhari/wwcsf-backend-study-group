package com.objectorientedprogramming;

public class StudentConstructor {

    private String firstName;
    private String lastName;
    private String course;

    public StudentConstructor() {
    }

    public StudentConstructor(String firstName, String lastName, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public static void main(String[] args) {
        StudentConstructor student = new StudentConstructor();
        StudentConstructor studentAbbie = new StudentConstructor("Abbie", "Johnsen",
                "Computer Engineering");
        StudentConstructor studentAnnie = new StudentConstructor("Annie", "Simpson",
                "Data Engineering");
        System.out
                .println(student.firstName + " " + student.lastName + " is enrolled in " + student.course);
        System.out.println(studentAbbie.firstName + " " + studentAbbie.lastName + " is enrolled in "
                + studentAbbie.course);
        System.out.println(studentAnnie.firstName + " " + studentAnnie.lastName + " is enrolled in "
                + studentAnnie.course);
    }
}