package com.vish.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Alien {
    private int aid;
    private String name;

    @Autowired
    @Qualifier("lap")
    private Laptop laptop;

    public Alien(){
        System.out.println("--Alien object created---");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("--inside Alien show--");
        laptop.show();
    }
}
