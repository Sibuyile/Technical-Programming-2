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
public class ListOfPassengers implements Serializable{
    
      
    private String listPassengersID;
    private List<Passenger> list;
    
    
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
    public String getListPassengersID () {
        return listPassengersID;
    }

 
    public static class Builder {
        private String listPassengersID;
        private List<Passenger> list;

        public Builder(String id) {
            
            listPassengersID = id;
            
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder list(List <Passenger> l)
        {
            list = l;
            return this;
        }
        
        public Builder listOfPassengers(ListOfPassengers lp)
        {
            listPassengersID = lp.getListPassengersID();
            list = lp.getList();
            
            return this;
        }
        
        public ListOfPassengers build()
        {
            return new ListOfPassengers(this);
        }
    }


    
}
