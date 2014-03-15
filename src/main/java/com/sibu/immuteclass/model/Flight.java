package com.sibu.immuteclass.model;

import com.sibu.immuteclass.service.Interface.Airport; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2394B273-4B04-C323-730E-6455DD152CA1]
// </editor-fold> 
public final class Flight implements Airport {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7AC96D3D-CFA5-9E52-1329-423DE1F3F86C]
    // </editor-fold> 
    private String flightName;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BECE983C-E19F-8946-7F8F-C6FF0E0D1AD9]
    // </editor-fold> 
    private String departureCity;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9764EF18-E2BF-266F-DC24-8F58368CB9A0]
    // </editor-fold> 
    private String arriveCity;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0A048607-953B-93A3-278E-9B27E288E822]
    // </editor-fold> 
    private String totalCapacity;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A174C4F8-89DE-EFA0-9FFC-49A39BC04946]
    // </editor-fold> 
    private String seatsAvailable;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2ADCA441-8A81-EDCE-61C7-7765E40896B2]
    // </editor-fold> 
    private String flightID;
    private Object clone;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.723EB652-1075-792B-60D7-E27150798E42]
    // </editor-fold> 
    private Flight () {
    }
    
    private Flight(Builder builder)
    {
        flightID = builder.flightID;
        flightName = builder.flightName;
        arriveCity = builder.arriveCity;
        departureCity = builder.departureCity;
        totalCapacity = builder.totalCapacity;
        seatsAvailable = builder.seatsAvailable;
        clone = builder.clone;
        
    }
    
    
    public static class Builder {
        
        private String flightID;
        private String flightName;
        private String arriveCity;
        private String departureCity;
        private String totalCapacity;
        private String seatsAvailable;
        private Object clone;

        public Builder(String id) {
            
            this.flightID = id;
  
        }
        
        public Builder()
        {
            
        }
        
        public Builder flightName(String name)
        {
            flightName = name;
            return this;
        }
        
        public Builder arriveCity(String arrCity)
        {
            arriveCity = arrCity;
            return this;
        }
        
        public Builder departureCity(String deptCity)
        {
            departureCity = deptCity;
            return this;
        }
        
        public Builder totalCapacity(String tot)
        {
            totalCapacity = tot;
            return this;
        }
        
        public Builder seatsAvailable(String seatsAv)
        {
            seatsAvailable = seatsAv;
            return this;
        }
        
        public Builder clone(Flight f)
        {
            clone = f;
                    return this;
            
        }
        
        
        public Builder flight(Flight f)
        {
            flightID = f.getFlightID();
            flightName = f.getFlightName();
            arriveCity = f.getArriveCity();
            departureCity = f.getDepartureCity();
            totalCapacity = f.getTotalCapacity();
            seatsAvailable = f.getSeatsAvailable();
            
            return this;
             
        }
        
        public Flight build()
        {
           return new Flight(this);
            
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4C37524A-E567-47CB-C7A6-5D7A2DD681DF]
    // </editor-fold> 
    public String getArriveCity () {
        return arriveCity;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E747B805-BC02-DDAF-6602-A6CA026DB167]
    // </editor-fold> 
    public String getDepartureCity () {
        return departureCity;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.08C99855-D06E-1768-2A5D-B7D35CACFE4C]
    // </editor-fold> 
    public String getFlightID () {
        
        
        return flightID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9CAEC9AE-AD99-E92F-8F98-57BFCB069DA6]
    // </editor-fold> 
    public String getFlightName () {
        return flightName;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3545C756-7AEB-C153-4687-493334DF1A11]
    // </editor-fold> 
    public String getSeatsAvailable () {
        return seatsAvailable;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BBB75512-A352-E9B8-2FC9-DBB0E464849F]
    // </editor-fold> 
    public String getTotalCapacity () {
        return totalCapacity;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.576E78E6-82CD-13F6-CEFE-D3801BA07781]
    // </editor-fold> 
    public String flightID () {
        
        return  flightID;
                
    }

   

}

