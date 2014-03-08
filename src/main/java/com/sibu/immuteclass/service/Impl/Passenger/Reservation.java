package com.sibu.immuteclass.service.Impl.Passenger;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.F7C97F68-66B6-27F6-5ABA-3E20A0A62B62]
// </editor-fold> 
public final class Reservation {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.534BAAB7-2CD2-54FF-BDAD-0F29D43FC456]
    // </editor-fold> 
    private String JourneyDate;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8B7215DC-A19F-9232-C0F6-40EC1E3222C1]
    // </editor-fold> 
    private int noOfSeats;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.528FFF03-5A0E-585E-A885-B222846FC577]
    // </editor-fold> 
    private int reservationID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7022CC5D-B6E0-9142-63AE-50EB17B4E29F]
    // </editor-fold> 
    private Reservation () {
    }
    
    private Reservation(Builder builder)
    {
        JourneyDate = builder.journeyDate;
        noOfSeats = builder.noOfSeats;
        reservationID = builder.reservationID;
    }
   

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.010AA5B5-3AAB-83AE-6459-3CA3E0264617]
    // </editor-fold> 
    public String getJourneyDate () {
        return JourneyDate;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5EF6F509-F3A4-0B21-CB7C-3B4702ACABA5]
    // </editor-fold> 
    public int getNoOfSeats () {
        return noOfSeats;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.828654F9-7985-B727-234E-AD09542B90B0]
    // </editor-fold> 
    public int getReservationID () {
        return reservationID;
    }

    public static class Builder {
        private int reservationID;
        private int noOfSeats;
        private String journeyDate;
        int passengerID;
        String Details;
        String DOB;
        String phoneNo;
        String emailAdd;

        public Builder(int id) {
            
         this.reservationID = id;
            
        }
        
        public Builder JourneyDate(String jDate)
        {
            journeyDate = jDate;
            return this;
            
        }
        
        public Builder NoOfSeats(int seats)
        {
            noOfSeats = seats;
            return this;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 61 * hash + this.reservationID;
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
            final Builder other = (Builder) obj;
            if (this.reservationID != other.reservationID) {
                return false;
            }
            return true;
        }
        
        public Reservation build()
        {
            return new Reservation (this);
        }
    }

}


