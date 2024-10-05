/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Duong Minh Quyen
 */
public class Product {
    private int prid;
    private String prname;
    private int estimatehour ;

    public Product() {
    }

    public Product(int prid, String prname, int estimatehour) {
        this.prid = prid;
        this.prname = prname;
        this.estimatehour = estimatehour;
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public String getPrname() {
        return prname;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }

    public int getEstimatehour() {
        return estimatehour;
    }

    public void setEstimatehour(int estimatehour) {
        this.estimatehour = estimatehour;
    }
    
}
