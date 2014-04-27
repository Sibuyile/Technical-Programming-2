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
public class Status implements Serializable{
    
     
    private String statusID;
    private String statusName;
    private String amount;
    private String totalSeatClass;
    
    private Status(Builder builder)
    {
        statusID = builder.statusID;
        statusName = builder.statusName;
        amount = builder.amount;
        totalSeatClass = builder.seats;
        
    }

    public static class Builder {
        private String statusID;
        private String statusName;
        private String amount;
        private String seats;

        public Builder(String id) {
            
            this.statusID = id;
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder Name(String name)
        {
            statusName = name;
            return this;
        }
        
        public Builder Amount(String amt)
        {
            amount = amt;
            return this;
        }

      
        
        public Builder Seats(String seat)
        {
            seats = seat;
            return this;
        }
        
        public Builder status(Status s)
        {
            statusID = s.getStatusID();
            statusName = s.getStatusName();
            amount = s.getAmount();
            seats = s.getTotalSeatClass();
            
            return this;
            
        }
        
        public Status build()
        {
            return new Status(this);
            
        }

    }
    

    public String getStatusID() {
        return statusID;
    }

    public String getStatusName() {
        return statusName;
    }

    public String getAmount() {
        return amount;
    }

    public String getTotalSeatClass() {
        return totalSeatClass;
    }
    
    
    
    
    
}
