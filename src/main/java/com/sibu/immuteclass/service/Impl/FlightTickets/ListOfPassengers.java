package com.sibu.immuteclass.service.Impl.FlightTickets;

import com.sibu.immuteclass.service.Impl.Passenger.Passenger;
import com.sibu.immuteclass.service.Interface.Airport; 
import java.util.List;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0E907016-42DE-819E-3292-00C4624B7577]
// </editor-fold> 
public class ListOfPassengers implements Airport {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.86F32386-E0FA-6F11-ADB4-AF1241165378]
    // </editor-fold> 
    private int listPassengersID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4F61485B-6FDA-2857-0B44-ABC1E64996CB]
    // </editor-fold> 
    private List<Passenger> list;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D883BCA4-D9F2-F08D-681F-9B2436DFD6ED]
    // </editor-fold> 
    private ListOfPassengers () {
    }
    
    private ListOfPassengers(Builder builder)
    {
        listPassengersID = builder.listPassengersID;
        list = builder.list;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DBD6BBDD-D791-C67C-8C82-B2FF6B956ECB]
    // </editor-fold> 
    public List <Passenger> getList () {
        return list;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.780A533A-CAF9-03DC-A1D0-87365E58FFE5]
    // </editor-fold> 
    public int getListPassengersID () {
        return listPassengersID;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2D19FD12-E21E-5CE3-8D06-B2DD14A542C0]
    // </editor-fold> 
    public int flightID () {
        return 0;
    }

    public static class Builder {
        private int listPassengersID;
        private List<Passenger> list;

        public Builder(int id) {
            
            listPassengersID = id;
            
        }
        
        public Builder list(List <Passenger> l)
        {
            list = l;
            return this;
        }
        
        public ListOfPassengers build()
        {
            return new ListOfPassengers(this);
        }
    }

}

