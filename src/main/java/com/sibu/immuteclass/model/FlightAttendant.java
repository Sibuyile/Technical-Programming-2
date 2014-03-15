package com.sibu.immuteclass.model;

import com.sibu.immuteclass.service.Interface.CabinCrew; 
import java.util.Objects;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.14B7F4DC-2178-577D-4A60-EA3EDBC9744B]
// </editor-fold> 
public final class FlightAttendant implements CabinCrew {

    private String name;
    private String email;
    private String phoneNo;
    private String address;
    private String dob;
   // private String clone;
    
    Flight f;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7BFD2473-80E4-2994-A8A0-39DF83DEFA04]
    // </editor-fold> 
    private String flightAttendantID;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3BDD293D-94B7-166F-972C-F62AD4E54A57]
    // </editor-fold> 
    private FlightAttendant () {
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DC9014E7-F37F-23F5-42DE-1838D54B41AB]
    // </editor-fold> 
    public String getFlightAttendantID () {
        return flightAttendantID;
    }

   private FlightAttendant(Builder builder)
   {
       
       flightAttendantID = builder.flightAttendantID;
       email = builder.email;
       name = builder.name;
       phoneNo = builder.phoneNo;
       address = builder.address;
       dob = builder.dob;
     //  clone = builder.clone;
       
   }
   
   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.flightAttendantID);
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
        final FlightAttendant other = (FlightAttendant) obj;
        if (this.flightAttendantID != other.flightAttendantID) {
            return false;
        }
        return true;
    }
   

    @Override
    public String name() {

        return name = "Sibu";
    }

    @Override
    public String address() {

    return address = "50 Swallow Drive";
    
    }

    @Override
    public String phoneNo() {
        
        return phoneNo = "0436422866";
    }

    @Override
    public String dob() {
        
        return dob = "17 April 1991";
    }

    @Override
    public String email() {
        
        return email = "sibum0341@gmail.com";
    }

    @Override
    public String flightID() {
        
        return f.flightID();
    }
   
    public static class Builder {
        
        private String flightAttendantID;
        private String email;
        private String name;
        private String phoneNo;
        private String address;
        private String dob;
       // private Object clone;
        
         public Builder()
         {
             
             
             
         }

        public Builder(String id) {
            
            flightAttendantID = id;
            
        }
        
        public Builder name(String n)
        {
            
            name = n;
            return this;
        }
        
        public Builder email(String em)
        {
            
            email = em;
            return this;
        }
        
        public Builder phoneNo(String pNo)
        {
            phoneNo = pNo;
            return this;
        }
        
        public Builder address(String add)
        {
            address = add;
            return this;
        }
        
        public Builder dOb(String dOB)
        {
            dob = dOB;
            return this;
        }
        
       /* public Builder clone(FlightAttendant fa)
        {
            clone = fa;
                    return this;
            
        }*/
        
        public Builder flightAttendant(FlightAttendant fa)
        {
            flightAttendantID = fa.getFlightAttendantID();
            name = fa.name();
            email = fa.email();
            phoneNo = fa.phoneNo();
            address = fa.address();
            dob = fa.dob();
            
            return this;
            
        }
        
        public FlightAttendant build()
        {
            return new FlightAttendant(this);
        }
        
    }
   

}

