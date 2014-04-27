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
public class FlightDays implements Serializable{
     
    private String flightDaysID;
    private String date;
    private String departureCity;
    private String arriveCity;
    
     private FlightDays () {
    }
    
    private FlightDays(Builder builder)
    {
        flightDaysID = builder.flightDaysID;
        date = builder.date;
        departureCity = builder.departureCity;
        arriveCity = builder.arriveCity;
    }

     public static class Builder {
        private String flightDaysID;
        private String date;
        private String departureCity;
        private String arriveCity;

        public Builder(String id) {
            
            this.flightDaysID = id;
        }
        
         public Builder()
         {
             
             
             
         }

          public Builder Date(String dt)
        {
            date = dt;
            return this;
        }
        
        public Builder DepartureCity(String deptCity)
        {
            departureCity = deptCity;
            return this;
        }
        
        public Builder ArriveCity(String arrCity)
        {
            arriveCity = arrCity;
            return this;
                   
        }

       
        
        public Builder flightDays(FlightDays fd)
        {
            flightDaysID = fd.getFlightDaysID();
            date = fd.getDate();
            departureCity = fd.getDepartureCity();
            arriveCity = fd.getArriveCity();
            
            return this;
            
        }
        
        public FlightDays build()
        {
            return new FlightDays(this);
        }
    }


  
    
     public String getFlightDaysID() {
            return flightDaysID;
        }

        public String getDate() {
            return date;
        }

        public String getDepartureCity() {
            return departureCity;
        }

        public String getArriveCity() {
            return arriveCity;
        }
    
    
    
    
}
