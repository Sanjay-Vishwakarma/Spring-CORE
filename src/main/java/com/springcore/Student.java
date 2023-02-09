package com.springcore;

public class Student {

    private String studentName;
    private String studentAddress;
    private String studentId;

    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
    	System.out.println("setting name");
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
    	System.out.println("setting address");

        this.studentAddress = studentAddress;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
    	System.out.println("setting id");

        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }

    public Student(String studentName, String studentAddress, String studentId) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentId = studentId;
    }

    public Student() {
        super();
    }

}
