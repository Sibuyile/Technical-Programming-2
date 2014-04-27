/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author stud
 */
@Entity
public class FlightAttendant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
      private String name;
    private String email;
    private String phoneNo;
    private String address;
    private String dob;
    
     private FlightAttendant () {
        
    }

  
   private FlightAttendant(Builder builder)
   {
       
       email = builder.email;
       name = builder.name;
       phoneNo = builder.phoneNo;
       address = builder.address;
       dob = builder.dob;
 
       
   }

   
    public static class Builder {

       

        private String email;
        private String name;
        private String phoneNo;
        private String address;
        private String dob;
  
         public Builder()
         {
             
             
             
         }

        
        public Builder name(String n)
        {
            
            name = n;
            return this;
        }
        
        public Builder email(String em)
        {
            
            email = em;
            return this;
        }
        
        public Builder phoneNo(String pNo)
        {
            phoneNo = pNo;
            return this;
        }
        
        public Builder address(String add)
        {
            address = add;
            return this;
        }
        
        public Builder dOb(String dOB)
        {
            dob = dOB;
            return this;
        }
        
       /* public Builder clone(FlightAttendant fa)
        {
            clone = fa;
                    return this;
            
        }*/
        
        public Builder flightAttendant(FlightAttendant fa)
        {
         
            name = fa.getName();
            email = fa.getEmail();
            phoneNo = fa.getPhoneNo();
            address = fa.getAddress();
            dob = fa.getDob();
            
            return this;
            
        }
        
        public FlightAttendant build()
        {
            return new FlightAttendant(this);
        }
        
    }
   
   
     public String getEmail() {
            return email;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public String getAddress() {
            return address;
        }

        public String getDob() {
            return dob;
        }
        

    public Long getId() {
        return id;
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
        if (!(object instanceof FlightAttendant)) {
            return false;
        }
        FlightAttendant other = (FlightAttendant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sibu.flightsystemweb.domain.FlightAttendant[ id=" + id + " ]";
    }
    
}
