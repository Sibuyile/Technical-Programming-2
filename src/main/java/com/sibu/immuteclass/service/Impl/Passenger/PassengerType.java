package com.sibu.immuteclass.service.Impl.Passenger;


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
    
   private int passTypeID;
   private int adult;
   private int infant;
   private int child;
   
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

    public int getPassType() {
        return 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.passTypeID);
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

    public int getAdult() {
        return adult;
    }

    public int getInfant() {
        return infant;
    }

    public int getChild() {
        return child;
    }
   

    public static class Builder {
        private int passTypeID;
        private int adult;
        private int child;
        private int infant;

        public Builder(int pt) {
            
            this.passTypeID = pt;
        }
        
        public Builder adult(int a)
        {
            adult = a;  
            return this;
        }
        
        public Builder child(int c)
        {
            
            child = c;
            return this;
        }
        
        public Builder infant(int i)
        {
            infant = i;
            return this;
            
        }
        
        public PassengerType build()
        {
            return new PassengerType(this);
        }
    }
   
   
    
}
