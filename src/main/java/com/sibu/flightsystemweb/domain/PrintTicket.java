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
public class PrintTicket implements Serializable{
    
    private String printTicketID;

    private String print;
    
     private PrintTicket () {
    }
    
    private PrintTicket(Builder builder)
    {
        printTicketID = builder.printTicketID;
        print = builder.print;
    }

    public static class Builder {
        private String printTicketID;
        private String print;

        public Builder(String id) {
            
            this.printTicketID = id;
            
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder print(String p)
        {
            print = p;
            return this;
        }
        
        public Builder printTicket(PrintTicket prt)
        {
            printTicketID = prt.getPrintTicketID();
            print = prt.getPrint();
            
            return this;
        }
        
        public PrintTicket build()
        {
            return new PrintTicket(this);
        }
    }

    public String getPrintTicketID() {
        return printTicketID;
    }

    public String getPrint() {
        return print;
    }
    
    
   
    
    
}
