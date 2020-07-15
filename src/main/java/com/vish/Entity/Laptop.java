package com.vish.Entity;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {

    private int lapId;
    private int brand;

    public Laptop(){
        System.out.println("Laptop obj created");
    }
    public int getLapId() {
        return lapId;
    }

    public void setLapId(int lapId) {
        this.lapId = lapId;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }
    public void show(){
        System.out.println("inside Laptop show");
    }
}
