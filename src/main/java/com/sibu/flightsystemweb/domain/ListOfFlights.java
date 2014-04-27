/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author stud
 */
@Embeddable
public class ListOfFlights implements Serializable{
    
     private String listID;
    private List< Flight> list;

     private ListOfFlights () {
    }
    
    private ListOfFlights(Builder builder)
    {
        listID = builder.listID;
        list = builder.list;
        
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
    
    public List<Flight> getList() {
        return list;
    }
    
    
    
}
