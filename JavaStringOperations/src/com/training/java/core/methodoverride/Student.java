package com.training.java.core.methodoverride;

import java.time.LocalDate;

public class Student {
    private int rollNumber;
    private int registerNumber;
    private String name;
    private LocalDate dateOfBirth;

    public Student(int rollNumber, int registerNumber, String name, LocalDate dateOfBirth) {
        super();
        this.rollNumber = rollNumber;
        this.registerNumber = registerNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Student [rollNumber=").append(rollNumber)
                .append(", registerNumber=").append(registerNumber)
                .append(", name=").append(name)
                .append(", dateOfBirth=").append(dateOfBirth)
                .append("]").toString();
    }

}
