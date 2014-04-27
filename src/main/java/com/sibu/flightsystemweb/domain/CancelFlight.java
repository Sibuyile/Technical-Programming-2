/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embeddable;

/**
 *
 * @author stud
 */

@Embeddable
public class CancelFlight implements Serializable {
    
    private String cancelFlightID;
    private String cancelFlight;
    private List<SearchFlight> flightID;
    
     private CancelFlight()
     {
         
     }
     
     private CancelFlight(Builder builder)
     {
         cancelFlightID = builder.cancelFlightID;
         cancelFlight = builder.cancelFlight;
        
         
     }
     
    public static class Builder {
       
        private String cancelFlightID;

        private String cancelFlight;
         private List<SearchFlight> flightID;
       

     
         public Builder()
         {
             
             
             
         }

        public Builder(String id) {
            
             this.cancelFlightID = id;
            
        } 
        
        public Builder cancel(String cancel)
        {
            cancelFlight = cancel;
            return this;
        }
        
        public Builder flightID(List <SearchFlight> fly)
        {
            flightID = fly;
            return this;
        }
        
        public Builder cancelFlight(CancelFlight cf)
        {
            cancelFlightID = cf.getCancelFlightID();
            cancelFlight = cf.getCancelFlight();
           
            
            return this;
            
        }
        
         
        public CancelFlight build()
        {
            return new CancelFlight(this);
        }
        
        

      
       
    }

    public String getCancelFlightID() {
        return cancelFlightID;
    }

    public String getCancelFlight() {
        return cancelFlight;
    }

    public List<SearchFlight> getFlightID() {
        return flightID;
    }

  
    
    
    
    
}
