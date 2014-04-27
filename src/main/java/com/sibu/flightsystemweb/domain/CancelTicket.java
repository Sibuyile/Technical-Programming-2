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
public class CancelTicket implements Serializable{
    
     private String cancelTicketID;
    private String cancelTicket;
    
     private CancelTicket()
     {
         
     }
     
     private CancelTicket(Builder builder)
     {
         cancelTicketID = builder.cancelTicketID;
         cancelTicket = builder.cancelTicket;
        
         
     }
     
     public static class Builder {
        private String cancelTicketID;
        private String cancelTicket;
 

        public Builder(String id) {
            
             this.cancelTicketID = id;
            
        } 

       
        public Builder() { }
        
        public Builder cancel(String cancel)
        {
            cancelTicket = cancel;
            return this;
        }
        
        
        public Builder cancelTicket(CancelTicket ct)
        {
            cancelTicketID = ct.getCancelTicketID();
            cancelTicket = ct.getCancelTicketID();
          
            
            return this;
            
        }
     
        
        
        public CancelTicket build()
        {
            return new CancelTicket(this);
        }
     }
        

    public String getCancelTicketID() {
        return cancelTicketID;
    }

    public String getCancelTicket() {
        return cancelTicket;
    }

    
     
    
}
