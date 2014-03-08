package com.sibu.immuteclass.service.Impl.Flight;

import com.sibu.immuteclass.service.Interface.Airport; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.AE8FE0A2-BF1A-748B-AD8B-6C471D95F58D]
// </editor-fold> 
public class FlightCapacity implements Airport {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EEBC28C1-8605-9AD9-B04D-8271120FAA72]
    // </editor-fold> 
    private int flightCapacityID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0B617A55-7EEF-224F-6902-88B846A20FAC]
    // </editor-fold> 
    private int business;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.377E9F65-5AD7-07C3-79F7-A6F607DBE66D]
    // </editor-fold> 
    private int economy;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BAF41C34-81A5-64E1-2495-33E990BE0B9A]
    // </editor-fold> 
    private int first;
    
    Flight f;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.26D16A8F-0D95-B34B-B6F5-1742124727A3]
    // </editor-fold> 
    private FlightCapacity () {
    }
    
    private FlightCapacity(Builder builder)
    {
        flightCapacityID = builder.flightCapacityID;
        business = builder.business;
        economy = builder.economy;
        first = builder.first;
                
        
    }
    
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4C35B102-184F-AC04-D648-A9DB0B74B628]
    // </editor-fold> 
    public int getBusiness () {
        return business;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C91B5DBB-B298-C5F7-CE97-07B04482E05C]
    // </editor-fold> 
    public int getEconomy () {
        return economy;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.28B4F86C-108D-55BD-0E12-411350C72B95]
    // </editor-fold> 
    public int getFirst () {
        return first;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AA3BBF37-C087-A171-4E73-C007425BF17B]
    // </editor-fold> 
    public int getFlightCapacityID () {
        return flightCapacityID;
    }

    @Override// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E10122F4-437F-4169-FEA7-60EB00CE50F9]
    // </editor-fold> 
    public int flightID () {
        return f.flightID();
    }

    public static class Builder {
        private int flightCapacityID;
        private int business;
        private int economy;
        private int first;

        public Builder(int id) {
            
            this.flightCapacityID = id;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + this.first;
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
            if (this.first != other.first) {
                return false;
            }
            return true;
        }
        
        
        public Builder business(int bus)
        {
            business = bus;
            return this;
        }
        
        public Builder economy(int eco)
        {
            economy = eco;
            return this;
        }
        
        public Builder first(int fir)
        {
            first = fir;
            return this;
        }
        
        public FlightCapacity build()
        {
            return new FlightCapacity(this);
        }
    }
    
    

}

