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
public class Person {
    private String name;
    private String address;
    private String socialSecurityNumber;
    private String dateOfBirth;
    
    public void setName(String a) {
        this.name = a;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setAddress(String a) {
        this.address = a;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setSocialSecurityNumber(String a) {
        this.socialSecurityNumber = a;
    }
    
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }
    
    public void setDateOfBirth(String a) {
        this.dateOfBirth = a;
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", socialSecurityNumber=" + socialSecurityNumber + ", dateOfBirth=" + dateOfBirth + '}';
    }
    
}
