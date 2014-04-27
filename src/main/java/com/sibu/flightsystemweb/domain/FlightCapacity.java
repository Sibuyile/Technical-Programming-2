/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author stud
 */
@Entity
public class FlightCapacity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String flightCapacityID;
    private String business;
    private String economy;
    private String first;
    @Embedded
    private InternationalFlight iFly;
    private LocalFlight lf;
  // @OneToMany(cascade = CascadeType.ALL)
   // @JoinColumn(name = "flightCapacity_id")
    
    private FlightCapacity () {
    }
    
    private FlightCapacity(Builder builder)
    {
        flightCapacityID = builder.flightCapacityID;
        business = builder.business;
        economy = builder.economy;
        first = builder.first;
                
        
    }
    
     public static class Builder {
        private String flightCapacityID;
        private String business;
        private String economy;
        private String first;

        public Builder(String id) {
            
            this.flightCapacityID = id;
        }
        
         public Builder()
         {
             
             
             
         }
        
        
        public Builder business(String bus)
        {
            business = bus;
            return this;
        }
        
        public Builder economy(String eco)
        {
            economy = eco;
            return this;
        }
        
        public Builder first(String fir)
        {
            first = fir;
            return this;
        }
        
        public Builder flightCapacity(FlightCapacity fc)
        {
            flightCapacityID = fc.getFlightCapacityID();
            business = fc.getBusiness();
            economy = fc.getEconomy();
            first = fc.getFirst();
            
            return this;
            
        }
        
        public FlightCapacity build()
        {
            return new FlightCapacity(this);
        }
    }
    
    
    
    

    public Long getId() {
        return id;
    }

    public InternationalFlight getiFly() {
        return iFly;
    }

    public LocalFlight getLf() {
        return lf;
    }

    public String getFlightCapacityID() {
        return flightCapacityID;
    }

    public String getBusiness() {
        return business;
    }

    public String getEconomy() {
        return economy;
    }

    public String getFirst() {
        return first;
    }

  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlightCapacity)) {
            return false;
        }
        FlightCapacity other = (FlightCapacity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sibu.flightsystemweb.domain.FlightCapacity[ id=" + id + " ]";
    }
    
}
