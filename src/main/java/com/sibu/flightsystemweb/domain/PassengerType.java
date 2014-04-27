/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author stud
 */
@Embeddable
public class PassengerType implements Serializable{
    
   private String passTypeID;
   private String adult;
   private String infant;
   private String child;

    public String getPassTypeID() {
        return passTypeID;
    }

    public String getAdult() {
        return adult;
    }

    public String getInfant() {
        return infant;
    }

    public String getChild() {
        return child;
    }
   
     private PassengerType()
   {
       
   }
   
   private PassengerType(Builder builder)
   {
       passTypeID = builder.passTypeID;
       adult = builder.adult;
       child = builder.child;
       infant = builder.infant;
       
   }

    public static class Builder {
        private String passTypeID;
        private String adult;
        private String child;
        private String infant;

        public Builder(String pt) {
            
            this.passTypeID = pt;
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder adult(String a)
        {
            adult = a;  
            return this;
        }
        
        public Builder child(String c)
        {
            
            child = c;
            return this;
        }
        
        public Builder infant(String i)
        {
            infant = i;
            return this;
            
        }
        
        public Builder passengerType(PassengerType pt)
        {
        
            adult = pt.getAdult();
            child = pt.getChild();
            infant = pt.getInfant();
            
            return this;
        }
        
        public PassengerType build()
        {
            return new PassengerType(this);
        }
    }
   
   
    
    
}
