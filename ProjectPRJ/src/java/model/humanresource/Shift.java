/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.humanresource;
import java.sql.*;
/**
 *
 * @author Duong Minh Quyen
 */
public class Shift {
    private String sid;
    private Time start;
    private Time end;

    public Shift() {
    }

    public Shift(String sid, Time start, Time end) {
        this.sid = sid;
        this.start = start;
        this.end = end;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }
    
    
}
