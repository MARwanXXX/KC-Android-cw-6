package com.example.android.myapplication;

public class Student {

    private String StudentName;
    private int StudentAge;
    private int StudentGrade;
    private int StudentImg;

    public Student(String studentName, int studentAge, int studentGrade, int studentImg) {
        StudentName = studentName;
        StudentAge = studentAge;
        StudentGrade = studentGrade;
        StudentImg = studentImg;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }

    public int getStudentGrade() {
        return StudentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        StudentGrade = studentGrade;
    }

    public int getStudentImg() {
        return StudentImg;
    }

    public void setStudentImg(int studentImg) {
        StudentImg = studentImg;
    }
}
