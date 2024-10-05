/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
        
/**
 *
 * @author Duong Minh Quyen
 */
public class Employee {
    private String eid;
    private String ename;
    private Date dob;
    private String phone;
    private String did;
    private String salarylevel;
    private String position;
    private int hourrate;

    public Employee() {
    }

    public Employee(String eid, String ename, Date dob, String phone, String did, String salarylevel, String position, int hourrate) {
        this.eid = eid;
        this.ename = ename;
        this.dob = dob;
        this.phone = phone;
        this.did = did;
        this.salarylevel = salarylevel;
        this.position = position;
        this.hourrate = hourrate;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getSalarylevel() {
        return salarylevel;
    }

    public void setSalarylevel(String salarylevel) {
        this.salarylevel = salarylevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHourrate() {
        return hourrate;
    }

    public void setHourrate(int hourrate) {
        this.hourrate = hourrate;
    }
    
}
