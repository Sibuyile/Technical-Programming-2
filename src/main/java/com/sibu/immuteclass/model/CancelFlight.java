package com.sibu.immuteclass.model;


import java.util.List;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud
 */
public final class CancelFlight {
    
     private String cancelFlightID;
    private String cancelFlight;
     private List<SearchFlight> flightID;
     private Object clone;
     
     
     private CancelFlight()
     {
         
     }
     
     private CancelFlight(Builder builder)
     {
         cancelFlightID = builder.cancelFlightID;
         cancelFlight = builder.cancelFlight;
         flightID = builder.flightID;
         clone = builder.clone;
         
     }
     
    public static class Builder {
       
        private String cancelFlightID;

        private String cancelFlight;
         private List<SearchFlight> flightID;
         private Object clone; 

     
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
            cancelFlight = cf.isCancelFlight();
            flightID = cf.getFlightID();
            
            return this;
            
        }
        
          public Builder clone(CancelFlight cf) {
            
            clone = cf;
           // return this;
            
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

    public String isCancelFlight() {
        return cancelFlight;
    }

    public List<SearchFlight> getFlightID() {
        return flightID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.cancelFlightID);
        return hash;
    }
     
    
    
        
        
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Builder other = (Builder) obj;
            if (this.cancelFlightID != other.cancelFlightID) {
                return false;
            }
            return true;
        }
    
}
