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
public class Reservation implements Serializable{
    
    
    private String JourneyDate;
    private String noOfSeats;
    private String reservationID;
    private String reservationDate;
    
     private Reservation () {
    }
    
    private Reservation(Builder builder)
    {
        JourneyDate = builder.journeyDate;
        noOfSeats = builder.noOfSeats;
        reservationID = builder.reservationID;
    }
   

    public static class Builder {
        private String reservationID;
        private String noOfSeats;
        private String journeyDate;
        String passengerID;
        String Details;
        String DOB;
        String phoneNo;
        String emailAdd;

        public Builder(String id) {
            
         this.reservationID = id;
            
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder JourneyDate(String jDate)
        {
            journeyDate = jDate;
            return this;
            
        }
        
        public Builder NoOfSeats(String seats)
        {
            noOfSeats = seats;
            return this;
        }
        
        public Builder reservation(Reservation r)
        {
            reservationID = r.getReservationID();
            noOfSeats = r.getNoOfSeats();
            journeyDate = r.getJourneyDate();
            
            return this;
        }

        
        
        public Reservation build()
        {
            return new Reservation (this);
        }
    }
    

    public String getJourneyDate() {
        return JourneyDate;
    }

    public String getNoOfSeats() {
        return noOfSeats;
    }

    public String getReservationID() {
        return reservationID;
    }

    public String getReservationDate() {
        return reservationDate;
    }
    
    
    
    
}
