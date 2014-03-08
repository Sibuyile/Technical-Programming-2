package com.sibu.immuteclass.service.Impl.Cancel;

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
    
    private int cancelTicketID;
    private boolean cancelTicket;
     private int reservationID;
     
     private CancelTicket()
     {
         
     }
     
     private CancelTicket(Builder builder)
     {
         cancelTicketID = builder.cancelTicketID;
         cancelTicket = builder.cancelTicket;
         reservationID = builder.reservationID;
         
     }

    public int getCancelTicketID() {
        return cancelTicketID;
    }

    public boolean isCancelTicket() {
        return cancelTicket;
    }

    public int getReservationID() {
        return reservationID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.cancelTicketID;
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
        private int cancelTicketID;
        private boolean cancelTicket;
        private int reservationID;

        public Builder(int id) {
            
             this.cancelTicketID = id;
            
        } 
        
        public Builder cancel(boolean cancel)
        {
            cancelTicket = cancel;
            return this;
        }
        
        public Builder reservationID(int res)
        {
            reservationID = res;
            return this;
        }
        
        public CancelTicket build()
        {
            return new CancelTicket(this);
        }
        
        
        
        
        
    }
   
    
    
    
}
