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
public final class PassengerType {
    
   private String passTypeID;
   private String adult;
   private String infant;
   private String child;
   
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

    public String getPassType() {
        return passTypeID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.passTypeID);
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
        final PassengerType other = (PassengerType) obj;
        if (!Objects.equals(this.passTypeID, other.passTypeID)) {
            return false;
        }
        return true;
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
            passTypeID = pt.getPassType();
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
