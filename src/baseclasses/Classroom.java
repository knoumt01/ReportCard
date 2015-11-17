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
public class Classroom {
    private String roomNumber;
    private String roomType;
    
    public void setRoomNumber(String a) {
        this.roomNumber = a;
    }
    
    public void setRoomType(String a) {
        this.roomType = a;
    }
    
    public String getRoomNumber() {
        return this.roomNumber;
    }
    
    public String getRoomType() {
        return this.roomType;
    }

    @Override
    public String toString() {
        return "Classroom{" + "roomNumber=" + roomNumber + ", roomType=" + roomType + '}';
    }
    
}
