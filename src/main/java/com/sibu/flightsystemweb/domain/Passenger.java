/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
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
public class Passenger implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String details;
    private String dOB;
    private String emailAdd;
    @Column(unique = true)
    private String phoneNo;
    @Embedded
    private PassengerType pT;
    private Payment pm;
    private Ticket tic;
 //   @OneToMany(cascade = CascadeType.ALL)
 //   @JoinColumn(name = "passenger_id")
    
    
      private Passenger () {
    }
    
    
    private Passenger(Builder builder)
    {
       // super();
       
        details = builder.details;
        dOB = builder.dOB;
        phoneNo = builder.phoneNo;
        emailAdd = builder.emailAdd;
    }
    
     public static class Builder {
        private String passengerID;
        private String details;
        private String phoneNo;
        private String dOB;
        private String emailAdd;

        public Builder(String id) {
            
            this.passengerID = id;
        }
        
         public Builder()
         {
             
             
             
         }
        
        public Builder details(String details)
        {
            details = details;
            return this;
        }
        
        public Builder phoneNumber(String pNo)
        {
            phoneNo = pNo;
            return this;
        }
        
        public Builder dob(String dOb)
        {
            dOB = dOb;
            return this;    
            
        }
        
        public Builder emailAd(String email)
        {
            emailAdd = email;
            return this;
        }
        
        public Builder passenger(Passenger ps)
        {
         
            details = ps.getDetails();
            phoneNo = ps.getPhoneNo();
            dOB = ps.getdOB();
            emailAdd = ps.getEmailAdd();
            
            return this;
        }
        
        public Passenger build()
        {
            return new Passenger(this);
        }
        
        
    }
    

    public Long getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }

    public String getdOB() {
        return dOB;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public PassengerType getpT() {
        return pT;
    }

    public Payment getPm() {
        return pm;
    }

    public Ticket getTic() {
        return tic;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Passenger)) {
            return false;
        }
        Passenger other = (Passenger) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sibu.flightsystemweb.domain.Passenger[ id=" + id + " ]";
    }
    
}
