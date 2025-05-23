/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author HP
 */
public class Location implements Serializable{
    
    private int locationId;
    
    private String province;
   
    private String district;
    
    private String sector;
    
    private String cell;
    
    private String village;
   
    private List<Hazard> hazards;

    public Location() {
    }

    public Location(int locationId) {
        this.locationId = locationId;
    }

    public Location(int locationId, String province, String district, String sector, String cell, String village, List<Hazard> hazards) {
        this.locationId = locationId;
        this.province = province;
        this.district = district;
        this.sector = sector;
        this.cell = cell;
        this.village = village;
        this.hazards = hazards;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public List<Hazard> getHazards() {
        return hazards;
    }

    public void setHazards(List<Hazard> hazards) {
        this.hazards = hazards;
    }
    

    
}
