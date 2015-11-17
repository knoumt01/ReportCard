/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseclasses;

import java.util.ArrayList;

public class Student extends Person {
    private float currentGPA;
    private String dateOfGraduation;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public void setCurrentGPA (float f) {
        this.currentGPA = f;
    }
    
    public void setDateOfGraduation (String s) {
        this.dateOfGraduation = s;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
    public float getCurrentGPA() {
        return this.currentGPA;
    }

    public String getDateOfGraduation() {
        return this.dateOfGraduation;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" + "currentGPA=" + currentGPA + ", dateOfGraduation=" + dateOfGraduation + ", courses=" + courses + '}';
    }
    
}    