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
public class InternationalFlight implements Serializable{
    
    private String flightName;
    private String departureCity;
    private String arriveCity;
    private String totalCapacity;
    private String seatsAvailable;
 
      private InternationalFlight () {
    }
    
    private InternationalFlight(Builder builder)
    {
     
        flightName = builder.flightName;
        arriveCity = builder.arriveCity;
        departureCity = builder.departureCity;
        totalCapacity = builder.totalCapacity;
        seatsAvailable = builder.seatsAvailable;
        
    }
    
    
    public static class Builder {
        
        private String intflightID;
        private String flightName;
        private String arriveCity;
        private String departureCity;
        private String totalCapacity;
        private String seatsAvailable;

        public Builder(String id) {
            
            this.intflightID = id;
  
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
        
        public Builder internationalFlight(InternationalFlight intF)
        {
           
            flightName = intF.getFlightName();
            arriveCity = intF.getArriveCity();
            departureCity = intF.getDepartureCity();
            totalCapacity = intF.getTotalCapacity();
            seatsAvailable = intF.getSeatsAvailable();
            
            return this;
            
        }

      
        public InternationalFlight build()
        {
           return new InternationalFlight(this);
            
        }
        
        
    }

    public String getFlightName() {
        
         /*  f.getFlightName("SAA");
        f.setFlightName("British Airways");
        f.setFlightName("AirQuarius Avaition");
        f.setFlightName("Comair");
        f.setFlightName("Federal Air");
        */
        
        return flightName;
    }


    public String getArriveCity() {
        return arriveCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getTotalCapacity() {
        
         
        int total = 500;
        total = Integer.parseInt(totalCapacity);
        
        
        
        return totalCapacity;
    }

    public String getSeatsAvailable() {
        
        
        
        return seatsAvailable;
    }

    
    
}
