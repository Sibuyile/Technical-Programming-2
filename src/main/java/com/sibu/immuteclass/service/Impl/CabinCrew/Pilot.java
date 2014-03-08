package com.sibu.immuteclass.service.Impl.CabinCrew;

import com.sibu.immuteclass.service.Impl.Flight.Flight;
import com.sibu.immuteclass.service.Interface.CabinCrew; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.8211ABA7-57BD-68E8-7A44-7BE0F02FC42E]
// </editor-fold> 
public final class Pilot implements CabinCrew {

    private String name;
    private String email;
    private String phoneNo;
    private String address;
    private String dob;
    
    Flight f;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7FFAC4B9-F705-6065-DD85-18C6EEA70CC8]
    // </editor-fold> 
    private int pilotID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B4F2C33C-76FB-9938-C1C6-123919B7C58E]
    // </editor-fold> 
    private Pilot () {
    }
    
    private Pilot(Builder builder)
    {
        pilotID = builder.pilotID;
    }

    
    @Override
    public int hashCode () {
        int hash = 5;
        hash = 97 * hash + this.pilotID;
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
        final Pilot other = (Pilot) obj;
        if (this.pilotID != other.pilotID) {
            return false;
        }
        return true;
    }

    // </editor-fold>
    public int getPilotID() {
        return pilotID;
    }

    @Override
    public String name() {
        
        return name = "Simthembile";
    }

    @Override
    public String address() {
        
        return address = "2636 Varha Road";
    }

    @Override
    public String phoneNo() {
        
        return phoneNo = "043642294";
    }

    @Override
    public String dob() {
        
             return dob = "2 February 1990";
    }

    @Override
    public String email() {
        
        return email = "ssmith@gmail.com";
    }

    @Override
    public int flightID() {
        
        return f.flightID();
    }

    public static class Builder {
        private int pilotID;

        public Builder(int id) {
            
            this.pilotID = id;
            
        }
        
        public Pilot build()
        {
            return new Pilot(this);
        }
    }


}

