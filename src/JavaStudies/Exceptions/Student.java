/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaStudies.Exceptions;

/**
 * @author Vinicius Coutinho
 * 
 * This class is only for testing
 * purposes only, in other classes.
 * 
 */
public class Student {
    
    private String name;
    private double grades;
    private boolean goodBehavior;

    public Student(String name, double grades, boolean goodBehavior) {
        this.name = name;
        this.grades = grades;
        this.goodBehavior = goodBehavior;
    }

    public Student() {
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public boolean isGoodBehavior() {
        return goodBehavior;
    }

    public void setGoodBehavior(boolean goodBehavior) {
        this.goodBehavior = goodBehavior;
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", grades=" + grades + ", goodBehavior=" + goodBehavior + '}';
    }
}
