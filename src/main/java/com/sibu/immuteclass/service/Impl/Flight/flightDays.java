package com.sibu.immuteclass.service.Impl.Flight;

import com.sibu.immuteclass.service.Interface.Airport; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.478EDCCD-7285-E3A7-559A-FB63C357D0ED]
// </editor-fold> 
public final class flightDays implements Airport {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.65990256-8E47-C61E-F288-986E4B1614AA]
    // </editor-fold> 
    private int flightDaysID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CDD02B07-04D5-530B-0782-8ACB84779079]
    // </editor-fold> 
    private String date;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EF01ACC7-67FA-4672-C58C-3EDB28783214]
    // </editor-fold> 
    private String departureCity;
    
    private String arriveCity;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2D595BBB-8032-AC7D-DB33-A02A10406AEE]
    // </editor-fold> 
    private flightDays () {
    }
    
    private flightDays(Builder builder)
    {
        flightDaysID = builder.flightDaysID;
        date = builder.date;
        departureCity = builder.departureCity;
        arriveCity = builder.arriveCity;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A8E82DC3-2EF6-84CE-A1DC-4B983A308BC1]
    // </editor-fold> 
    public String getDate () {
        return date;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1E535FDC-75E4-1485-A41D-1F62E6E6DC64]
    // </editor-fold> 
    public String getDepartureCity () {
        return departureCity;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5B417698-6841-35AD-F4A8-A54AB5BCA412]
    // </editor-fold> 
    public int getFlightDaysID () {
        return flightDaysID;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.57CD9FD6-CC08-FFC4-E6E5-45BC6962200D]
    // </editor-fold> 
    public int flightID () {
        return 0;
    }

    public String getArriveCity() {
        return arriveCity;
    }

    public static class Builder {
        private int flightDaysID;
        private String date;
        private String departureCity;
        private String arriveCity;

        public Builder(int id) {
            
            this.flightDaysID = id;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 17 * hash + this.flightDaysID;
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
            if (this.flightDaysID != other.flightDaysID) {
                return false;
            }
            return true;
        }
        
        public Builder Date(String dt)
        {
            date = dt;
            return this;
        }
        
        public Builder DepartureCity(String deptCity)
        {
            departureCity = deptCity;
            return this;
        }
        
        public Builder ArriveCity(String arrCity)
        {
            arriveCity = arrCity;
            return this;
                   
        }
        
        public flightDays build()
        {
            return new flightDays(this);
        }
    }

}

