/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Flight implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String flightName;
    private String arriveCity;
    private String totalCapacity;
    private String seatsAvailable;
    @Column(unique = true)
    private String departureCity;
    @Embedded
    private Status status;
    private Reservation res; 
    List <ListOfFlights> lof;
    List <FlightDays> flyDays;
    private CancelFlight canFly;
    List <SearchFlight> sFly;
   // @OneToMany

    @JoinColumn(name = "flight_id")
    @OneToMany(cascade = CascadeType.ALL)
    private Ticket tic;
    private FlightCapacity flyCap;
    private Passenger pass;
    
 //   @JoinColumn(name = "flight_id")

      private Flight () {
    }
    
    private Flight(Builder builder)
    {
        id = builder.id;
        flightName = builder.flightName;
        arriveCity = builder.arriveCity;
        departureCity = builder.departureCity;
        totalCapacity = builder.totalCapacity;
        seatsAvailable = builder.seatsAvailable;
        status = builder.status;
        res = builder.res;
        lof = builder.lof;
        flyDays = builder.flyDays;
        canFly = builder.canFly;
        sFly = builder.sFly;
        tic = builder.tic;
        flyCap = builder.flyCap;
        pass = builder.pass;
      
        
    }

    
    public static class Builder {
        
        
        private String flightName;
        private String arriveCity;
        private String departureCity;
        private String totalCapacity;
        private String seatsAvailable;
        private Long id;
        private Status status;
        private Reservation res;
        private List<ListOfFlights> lof;
        private CancelFlight canFly;
        private List<FlightDays> flyDays;
        private List<SearchFlight> sFly;
        private Ticket tic;
        private FlightCapacity flyCap;
        private Passenger pass;
    

         public Builder(String departureCity) {
            this.departureCity = departureCity;
        }
         
         public Builder id(Long value) {
            id = value;
            return this;
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
        
        public Builder status(Status st)
        {
            status = st;
            return this;
            
        }
        
        public Builder res(Reservation value)
        {
            res = res;
            return this;
            
        }
        
        public Builder canFly(CancelFlight cf)
        {
            canFly = cf;
            return this;
            
        }
        
       public Builder lof(List<ListOfFlights> value) {
           
            lof = value;
            return this;
        }
        
        public Builder flyDays(List<FlightDays> value) {
           
            flyDays = value;
            return this;
        }
        
         public Builder sFly(List<SearchFlight> value) {
           
            sFly = value;
            return this;
        }
         
        public Builder tic(Ticket value)
        {
            tic = value;
            return this;
            
        }
        
        public Builder flyCap(FlightCapacity fly)
        {
            flyCap = fly;
            return this;
            
        }
        
        public Builder pass(Passenger p)
        {
            pass = p;
            return this;
            
        }
        
        public Builder flight(Flight f)
        {
            id = f.getId();
            flightName = f.getFlightName();
            arriveCity = f.getArriveCity();
            departureCity = f.getDepartureCity();
            totalCapacity = f.getTotalCapacity();
            seatsAvailable = f.getSeatsAvailable();
            status = f.getStatus();
            res = f.getRes();
            tic = f.getTic();
            flyCap = f.getFlycap();
            pass = f.getPass();
              
            return this;
             
        }

        public Flight build()
        {
           return new Flight(this);
            
        }
    
    }
    
    public String getFlightName() {
            return flightName;
        }

        public String getArriveCity() {
            return arriveCity;
        }

        public String getDepartureCity() {
            return departureCity;
        }

        public String getTotalCapacity() {
            return totalCapacity;
        }

        public String getSeatsAvailable() {
            return seatsAvailable;
        }

        public Status getStatus() {
            return status;
        }

        public Reservation getRes() {
            return res;
        }

        public List<ListOfFlights> getLof() {
            return lof;
        }

        public CancelFlight getCanFly() {
            return canFly;
        }

        public List<FlightDays> getFlyDays() {
            return flyDays;
        }

        public List<SearchFlight> getsFly() {
            return sFly;
        }
        
         public Ticket getTic() {
        return tic;
    }

    public FlightCapacity getFlycap() {
        return flyCap;
    }

    public Passenger getPass() {
        return pass;
    }

    @Id
    public Long getId() {
        return id;
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
        if (!(object instanceof Flight)) {
            return false;
        }
        Flight other = (Flight) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sibu.flightsystemweb.domain.Flight[ id=" + id + " ]";
    }
    
}
