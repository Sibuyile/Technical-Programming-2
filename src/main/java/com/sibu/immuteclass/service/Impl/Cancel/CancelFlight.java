package com.sibu.immuteclass.service.Impl.Cancel;


import com.sibu.immuteclass.service.Impl.FlightTickets.SearchFlight;
import java.util.List;

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
    
     private int cancelFlightID;
    private boolean cancelFlight;
     private List<SearchFlight> flightID;
     
     
     private CancelFlight()
     {
         
     }
     
     private CancelFlight(Builder builder)
     {
         cancelFlightID = builder.cancelFlightID;
         cancelFlight = builder.cancelFlight;
         flightID = builder.flightID;
         
     }
     
    public static class Builder {
       
        private int cancelFlightID;

        private boolean cancelFlight;
         private List<SearchFlight> flightID;

     

        public Builder(int id) {
            
             this.cancelFlightID = id;
            
        } 
        
        public Builder cancel(boolean cancel)
        {
            cancelFlight = cancel;
            return this;
        }
        
        public Builder flightID(List <SearchFlight> fly)
        {
            flightID = fly;
            return this;
        }
        
        public CancelFlight build()
        {
            return new CancelFlight(this);
        }
       
    }

    public int getCancelFlightID() {
        return cancelFlightID;
    }

    public boolean isCancelFlight() {
        return cancelFlight;
    }

    public List<SearchFlight> getFlightID() {
        return flightID;
    }
     
    
     @Override
        public int hashCode() {
            int hash = 3;
            hash = 41 * hash + this.cancelFlightID;
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
