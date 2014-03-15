package com.sibu.immuteclass.model;

//import Interface.Airport; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3888DD0A-F1DF-6BB1-B059-23948B868E19]
// </editor-fold> 
public final class Passenger {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.368AB156-B68C-6EC6-2406-11078AAC87D1]
    // </editor-fold> 
    private String passengerID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EDCACCD3-5982-2DED-9320-1FD45209073B]
    // </editor-fold> 
    private String details;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.40B91113-CFF5-82A9-387E-4BC8A5FD8CBD]
    // </editor-fold> 
    private String dOB;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6BD43880-A1EC-C8A1-0EEA-4A5A06C3041E]
    // </editor-fold> 
    private String phoneNo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4371D9A3-F898-C8FD-F672-676CF6588BD4]
    // </editor-fold> 
    private String emailAdd;
    
    Flight f;
    Reservation r;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3C417325-D12C-316A-521D-A492A0BD375B]
    // </editor-fold> 
    private Passenger () {
    }
    
    
    private Passenger(Builder builder)
    {
       // super();
        passengerID = builder.passengerID;
        details = builder.details;
        dOB = builder.dOB;
        phoneNo = builder.phoneNo;
        emailAdd = builder.emailAdd;
    }
    
     public static class Builder {
        private String passengerID;
        private String details;
        private String phoneNo;
        private String dOB;
        private String emailAdd;

        public Builder(String id) {
            
            this.passengerID = id;
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder details(String details)
        {
            details = details;
            return this;
        }
        
        public Builder phoneNumber(String pNo)
        {
            phoneNo = pNo;
            return this;
        }
        
        public Builder dob(String dOb)
        {
            dOB = dOb;
            return this;    
            
        }
        
        public Builder emailAd(String email)
        {
            emailAdd = email;
            return this;
        }
        
        public Builder passenger(Passenger ps)
        {
            passengerID = ps.getPassengerID();
            details = ps.getDetails();
            phoneNo = ps.getPhoneNo();
            dOB = ps.getDOB();
            emailAdd = ps.getEmailAdd();
            
            return this;
        }
        
        public Passenger build()
        {
            return new Passenger(this);
        }
        
        
    }
    
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.35AA5158-CCCF-A057-D617-F7CB7663E287]
    // </editor-fold> 
    public String getDOB () {
        return dOB;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F8B2F9DE-8DB1-A200-D787-C0B98FE848A8]
    // </editor-fold> 
    public String getDetails () {
        return details;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1DB7E361-81C6-AF77-D663-37A31E39F71E]
    // </editor-fold> 
    public String getEmailAdd () {
        return emailAdd;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C4345141-5ECF-06C8-F8C1-A5A49C25076E]
    // </editor-fold> 
    public String getPassengerID () {
        return passengerID;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AF7536D6-EA26-6C6B-790A-233CE470B432]
    // </editor-fold> 
    public String getPhoneNo () {
        return phoneNo;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.440B5AC2-C97D-D92B-B28D-8B40EADF6A0B]
    // </editor-fold> 
    public String getReservationID () {
        return r.getReservationID();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D034BD39-AB9B-67D7-9E2F-07DE9F4E1470]
    // </editor-fold> 
    public String flightID () {
        return  f.flightID();
    }

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Passenger other = (Passenger) obj;
        if (this.passengerID != other.passengerID) {
            return false;
        }
        return true;
    }

   

}

