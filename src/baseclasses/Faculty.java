/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseclasses;

import java.util.ArrayList;

public class Faculty extends Person {
    private String dateOfHire;
    private double salary;
    private ArrayList<Course> courses = new ArrayList<Course>();
    
    
    public void setDateOfHire(String a) {
        this.dateOfHire = a;
    }
    
    public void setSalary(double a) {
        this.salary = a;
    }
    
    public void setCourses(ArrayList<Course> a) {
        this.courses = a;
    }
    
    public String getDateOfHire() {
        return this.dateOfHire;
    }
    
    public double getSalary() {
        return this.salary;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    @Override
    public String toString() {
        return "Faculty{" + "dateOfHire=" + dateOfHire + ", salary=" + salary + ", courses=" + courses + '}';
    }
    
}
