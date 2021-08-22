package com.dept;

/*
* Author: Ramesh Mantripragada
* Date: 22 Aug 2021
* Assignment: Graded Assessment -1 OOPS
*/

// Testing commit
public class Main {

    public static void displayDepartmentInfo(SuperDepartment dept) {
        System.out.println(" Welcome to" + dept.departmentName());
        if (dept.departmentName() == " HR Department") {
            System.out.println(((HRDepartment) dept).doActivity());
        }
        System.out.println(dept.getTodaysWork());
        System.out.println(dept.getWorkDeadline());
        if (dept.departmentName() == " Tech Department") {
            System.out.println(((TechDepartment) dept).getTechStackInformation());
        }
        System.out.println(dept.isTodayAHoliday());
        System.out.println("");
    }

    public static void main(String[] args) {
        displayDepartmentInfo(new AdminDepartment());
        displayDepartmentInfo(new HRDepartment());
        displayDepartmentInfo(new TechDepartment());
    }
}
