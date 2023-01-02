package com.java.readList;

public class Student {

    String studentName;
    int percentage;

    public Student(String studentName, int percentage) {
        super();
        this.studentName = studentName;
        this.percentage = percentage;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "[studentName=" + studentName + ", percentage=" + percentage + "]";
    }


}
