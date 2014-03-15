/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.model;

import java.util.Objects;



/**
 *
 * @author stud
 */
public final class Payment {
    
    private String paymentID;
    private String paidAmount;
    private String paymentDate;
    Reservation r;
    
    private Payment()
    {
        
        
    }
    
    private Payment(Builder builder)
    {
        paymentID = builder.paymentID;
        paidAmount = builder.paidAmount;
        paymentDate = builder.paymentDate;
        
    }

    public static class Builder {
        private String paymentID;
        private String paidAmount;
        private String paymentDate;

        public Builder(String id) {
            
            this.paymentID = id;
            
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder paidAmount(String pa)
        {
            paidAmount = pa;
            return this;
            
        }
        
        public Builder paymentDate(String pd)
        {
            paymentDate = pd;
            return this;
            
        }
        
        public Builder payment(Payment p)
        {
            paymentID = p.paymentID;
            paidAmount = p.paidAmount;
            paymentDate = p.paymentDate;
        //    r.getReservationID();
            
            return this;
        }
        
        public Payment build()
        {
            
            return new Payment(this);
        }
    }

    public String getPaymentID() {
        return paymentID;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public Reservation getR() {
        return r;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.paymentID);
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
        final Payment other = (Payment) obj;
        if (!Objects.equals(this.paymentID, other.paymentID)) {
            return false;
        }
        return true;
    }
    
    
    
}
