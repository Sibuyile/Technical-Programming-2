/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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
public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
@Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ticket_id")
	private String ticketNumber;
	private String passengerName;
	private String passengerSurname;
	private String seatsBooked;
        @Embedded
        private CancelTicket canTic;
        private Payment pm;
        private PrintTicket pt;

    public CancelTicket getCanTic() {
        return canTic;
    }

    public Payment getPm() {
        return pm;
    }

    public PrintTicket getPt() {
        return pt;
    }

    public SearchTicket getSt() {
        return st;
    }

    public List<ListOfPassengers> getLop() {
        return lop;
    }
        private SearchTicket st;
        List <ListOfPassengers> lop;
    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public String getSeatsBooked() {
        return seatsBooked;
    }

    public String getAmountPaid() {
        return amountPaid;
    }
	private String amountPaid;


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
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sibu.flightsystemweb.domain.Ticket[ id=" + id + " ]";
    }
    
}
