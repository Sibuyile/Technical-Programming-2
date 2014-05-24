/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.designpatterns.creational.Builder;

/**
 *
 * @author stud
 */
public class Passenger {
    
    private String business;
    private String economy;
    private String firstClass;

    public void setBusiness(String business) {
        this.business = business;
    }

    public void setEconomy(String economy) {
        this.economy = economy;
    }

    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }
    

    public String getBusiness() {
        return business;
    }

    public String getEconomy() {
        return economy;
    }

    public String getFirstClass() {
        return firstClass;
    }
    
    

    @Override
    public String toString() {
        return "Passenger{" + "business=" + business + ", economy=" + economy + ", firstClass=" + firstClass + '}';
    }
    
    
    
}
