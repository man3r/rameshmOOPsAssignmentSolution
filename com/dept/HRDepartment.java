package com.dept;

/*
* Author: Ramesh Mantripragada
* Date: 22 Aug 2021
* Assignment: Graded Assessment -1 OOPS
*/

public class HRDepartment extends SuperDepartment {

    HRDepartment() {
    }

    // Returns Department Name
    public String departmentName() {
        return " HR Department";
    }

    // Returns Today's work
    public String getTodaysWork() {
        return "Fill today’s worksheet and mark your attendance";
    }

    // Returns Work deadline
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    // Returns Activity
    public String doActivity() {
        return "team Lunch";
    }
}
