package com.departments;

public class HRDepartment extends SuperDepartment {

    @Override
    public String departmentName() {
        return "HR Department";
    }

    @Override
    public String getTodaysWork() {
        return "Fill today’s worksheet and mark your attendance";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "team Lunch";
    }

    @Override
    public void display() {
        System.out.println("Welcome to " + departmentName());
        System.out.println(doActivity());
        System.out.println(getTodaysWork());
        System.out.println(getWorkDeadline());
        System.out.println(isTodayAHoliday());
    }

}
