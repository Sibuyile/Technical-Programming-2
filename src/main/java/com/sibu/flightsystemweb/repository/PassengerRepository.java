/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.flightsystemweb.repository;

import com.sibu.flightsystemweb.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author stud
 */
public interface PassengerRepository extends JpaRepository<Passenger, Long>{
    
}
