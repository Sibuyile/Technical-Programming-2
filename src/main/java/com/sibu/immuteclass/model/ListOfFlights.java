package com.sibu.immuteclass.model;

import com.sibu.immuteclass.model.Flight;
import com.sibu.immuteclass.service.Interface.Airport; 
import java.util.List;
import java.util.Objects;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6F75DE69-14FA-5DD7-94D6-56C24E52F971]
// </editor-fold> 
public final class ListOfFlights implements Airport {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B86C588F-C537-C9A8-9F1A-92365038F152]
    // </editor-fold> 
    private String listID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.935C9D20-2B3E-BC96-9C3B-14ACA53F884D]
    // </editor-fold> 
    private List< Flight> list;
    
    Flight f;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BB1339A1-E33E-750B-A9EF-FC84B702C215]
    // </editor-fold> 
    private ListOfFlights () {
    }
    
    private ListOfFlights(Builder builder)
    {
        listID = builder.listID;
        list = builder.list;
        
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9831D1CB-1324-7818-C392-E50210267DE3]
    // </editor-fold> 
    public List <Flight> getListFlights () {
        return list;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E2A4A70A-90EF-2648-E160-3457C3CA44E8]
    // </editor-fold> 
    public String getListID () {
        return listID;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A318FDA4-FDC5-03BC-299F-441963AE0B43]
    // </editor-fold> 
    public String flightID () {
        return f.flightID();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.listID);
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
        final ListOfFlights other = (ListOfFlights) obj;
        if (this.listID != other.listID) {
            return false;
        }
        return true;
    }

    public static class Builder {
        private String listID;
        private List<Flight> list;

        public Builder(String id ) {
            
            this.listID = id;
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder listFlights(List <Flight> l)
        {
            list = l;
            return this;
        
        }
        
        public Builder listOfFlights(ListOfFlights lf)
        {
            listID = lf.getListID();
            list = lf.getListFlights();
            
            return this;
        }
        
        public ListOfFlights build()
        {
            return new ListOfFlights(this);
        }
    }

}

