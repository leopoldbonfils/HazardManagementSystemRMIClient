/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author HP
 */

public class Reporter implements Serializable{
    
    
    private int reporterId;
   
    private String fullName;
    
    private String phoneNumber;
    
    private String email;
    
    private String gender;
   
    private List<Hazard> hazards;

    public Reporter() {
    }

    public Reporter(int reporterId) {
        this.reporterId = reporterId;
    }

    public Reporter(int reporterId, String fullName, String phoneNumber, String email, String gender, List<Hazard> hazards) {
        this.reporterId = reporterId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.hazards = hazards;
    }

    public int getReporterId() {
        return reporterId;
    }

    public void setReporterId(int reporterId) {
        this.reporterId = reporterId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Hazard> getHazards() {
        return hazards;
    }

    public void setHazards(List<Hazard> hazards) {
        this.hazards = hazards;
    }
    
    

   
    
}
