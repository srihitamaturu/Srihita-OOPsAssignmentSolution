package com.departments;

public class Driver {
    public static void main(String[] args) {
        SuperDepartment adminDepartment = new AdminDepartment();
        SuperDepartment hrDepartment = new HRDepartment();
        SuperDepartment techDepartment = new TechDepartment();

        adminDepartment.display();
        System.out.println();
        hrDepartment.display();
        System.out.println();
        techDepartment.display();
    }
}
