package com.sibu.immuteclass.model;

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
public final class CancelTicket {
    
    private String cancelTicketID;
    private String cancelTicket;
     private String reservationID;
     private Object clone;
     
     private CancelTicket()
     {
         
     }
     
     private CancelTicket(Builder builder)
     {
         cancelTicketID = builder.cancelTicketID;
         cancelTicket = builder.cancelTicket;
         reservationID = builder.reservationID;
         clone = builder.clone;
         
     }

    public String getCancelTicketID() {
        return cancelTicketID;
    }

    public String isCancelTicket() {
        return cancelTicket;
    }

    public String getReservationID() {
        return reservationID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.cancelTicketID);
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
        final CancelTicket other = (CancelTicket) obj;
        if (this.cancelTicketID != other.cancelTicketID) {
            return false;
        }
        return true;
    }

    public static class Builder {
        private String cancelTicketID;
        private String cancelTicket;
        private String reservationID;
        private Object clone;

        public Builder(String id) {
            
             this.cancelTicketID = id;
            
        } 

       
        public Builder() { }
        
        public Builder cancel(String cancel)
        {
            cancelTicket = cancel;
            return this;
        }
        
        public Builder reservationID(String res)
        {
            reservationID = res;
            return this;
        }
        
        public Builder clone(CancelTicket ct)
        {
            clone = ct;
                return this;
            
        }
        
        public Builder cancelTicket(CancelTicket ct)
        {
            cancelTicketID = ct.getCancelTicketID();
            cancelTicket = ct.isCancelTicket();
            reservationID = ct.getReservationID();
            
            return this;
            
        }
        
        
        public CancelTicket build()
        {
            return new CancelTicket(this);
        }
        
        
        
        
        
    }
   
    
    
    
}
