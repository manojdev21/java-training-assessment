package com.training.java.core.privateprotectedclass;

public class Employee extends User {
    private String department;
    private String designation;
    private Profile employeeProfile;

    public Employee(int id, String name, String department, String designation) {
        super(id, name);
        this.department = department;
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void updateProfile(String email, String phone, String country) {
        if (employeeProfile == null) {
            employeeProfile = new Profile(email, phone, country); // The object of Profile is created from the sub-class Employee
        } else {
            employeeProfile.setEmail(email);
            employeeProfile.setPhone(phone);
            employeeProfile.setCountry(country);
        }
    }

    @Override
    public String toString() {
        return "Employee [department=" + department + ", designation=" + designation + ", employeeProfile="
                + employeeProfile + "]";
    }

}
