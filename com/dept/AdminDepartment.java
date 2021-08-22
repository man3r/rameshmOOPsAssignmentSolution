package com.dept;

/*
* Author: Ramesh Mantripragada
* Date: 22 Aug 2021
* Assignment: Graded Assessment -1 OOPS
*/

public class AdminDepartment extends SuperDepartment {

    // Default constructor
    AdminDepartment() {
    }

    // Returns Department Name
    public String departmentName() {
        return " Admin Department";
    }

    // Returns Today's work
    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    // Returns Work deadline
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}
