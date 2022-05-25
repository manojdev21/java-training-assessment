package com.training.java.core.privateprotectedclass;

import java.util.ArrayList;
import java.util.List;

public class Student { // example for private class
    private int rollNo;
    private String name;
    private List<Laptop> laptops;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.laptops = new ArrayList<>();
    }

    private class Laptop { // only accessed by outer class Student
        private String brand;
        private int ram;
        private String storage;

        public Laptop(String brand, int ram, String storage) {
            super();
            this.brand = brand;
            this.ram = ram;
            this.storage = storage;
        }

        @Override
        public String toString() {
            return "Laptop [brand=" + brand + ", ram=" + ram + ", storage=" + storage + "]";
        }
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public String getName() {
        return this.name;
    }

    public void addNewLaptop(String brand, int ram, String storage) {
        laptops.add(new Laptop(brand, ram, storage)); // creating the object of Laptop class
    }

    public void printLaptops() {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

}
