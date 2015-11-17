/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseclasses;

/**
 *
 * @author mkdesign
 */
public class Course {
    private String room;
    private String courseName;
    private float courseIdNumber;
    
    public void setRoom(String s) {
        this.room = s;
    }
    
    public void setCourseName(String s) {
        this.courseName = s;
    }
    
    public void setCourseIdNumber(Float f) {
        this.courseIdNumber = f;
    }
    
    public String getRoom() {
        return this.room;
    }
    
    public String getCourseName() {
        return this.courseName; 
    }
    
    public float getCourseIdNumber() {
        return this.courseIdNumber;
    }

    @Override
    public String toString() {
        return "Course{" + "room=" + room + ", courseName=" + courseName + ", courseIdNumber=" + courseIdNumber + '}';
    }
    
}
