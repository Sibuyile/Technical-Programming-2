/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author stud
 */
@Embeddable
public class LocalFlight implements Serializable{
    
    private String flightName;
    private String departureCity;
    private String arriveCity;
    private String totalCapacity;
    private String seatsAvailable;
    private String LocflightID;
    
     private LocalFlight () {
    }
    
    private LocalFlight(Builder builder)
    {
        LocflightID = builder.LocflightID;
        flightName = builder.flightName;
        arriveCity = builder.arriveCity;
        departureCity = builder.departureCity;
        totalCapacity = builder.totalCapacity;
        seatsAvailable = builder.seatsAvailable;
        
    }
    
    
    public static class Builder {
        
        private String LocflightID;
        private String flightName;
        private String arriveCity;
        private String departureCity;
        private String totalCapacity;
        private String seatsAvailable;

        public Builder(String id) {
            
            this.LocflightID = id;
  
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder flightName(String name)
        {
            flightName = name;
            return this;
        }
        
        public Builder arriveCity(String arrCity)
        {
            arriveCity = arrCity;
            return this;
        }
        
        public Builder departureCity(String deptCity)
        {
            departureCity = deptCity;
            return this;
        }
        
        public Builder totalCapacity(String tot)
        {
            totalCapacity = tot;
            return this;
        }
        
        public Builder seatsAvailable(String seatsAv)
        {
            seatsAvailable = seatsAv;
            return this;
        }
        
        public Builder local(LocalFlight locF)
        {
           
            flightName = locF.getFlightName();
            arriveCity = locF.getArriveCity();
            departureCity = locF.getDepartureCity();
            totalCapacity = locF.getTotalCapacity();
            seatsAvailable = locF.getSeatsAvailable();
            
            return this;
            
        }
        
        public LocalFlight build()
        {
           return new LocalFlight(this);
            
        }
        
        
    }
    

    public String getFlightName() {
        return flightName;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArriveCity() {
        
        /* f.setDepartureCity("South African Airways");
        f.setDepartureCity("Airlink");
        f.setDepartureCity("Mango");
        f.setDepartureCity("Kulula");
        f.setDepartureCity("South African Express");*/
        
        
        return arriveCity;
    }

    public String getTotalCapacity() {
        return totalCapacity;
    }

    public String getSeatsAvailable() {
        return seatsAvailable;
    }

    public String getLocflightID() {
        return LocflightID;
    }

   
    
    
}
