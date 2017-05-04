package com.onebit.wjluk.beaconoid.model;

/**
 * Created by jason on 4/05/17.
 */

public class Ad {
    private int id,bId,cId;
    private String name,description;
    private double price;
    public Ad() {

    }
    public Ad(int id,String name,int bId,int cId,double price, String description){
        this.id = id;
        this.name = name;
        this.bId = bId;
        this.cId = cId;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}