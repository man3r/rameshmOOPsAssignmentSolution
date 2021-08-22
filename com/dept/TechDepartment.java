package com.dept;

/*
* Author: Ramesh Mantripragada
* Date: 22 Aug 2021
* Assignment: Graded Assessment -1 OOPS
*/

public class TechDepartment extends SuperDepartment {

    TechDepartment() {
    }

    // Returns Department Name
    public String departmentName() {
        return " Tech Department";
    }

    // Returns Today's work
    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    // Returns Work deadline
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    // Retuns Tech stack information
    public String getTechStackInformation() {
        return " Core Java";
    }
}
