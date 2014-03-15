/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.Passenger;
import com.sibu.immuteclass.service.crud.PassengerCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class PassengerImpl implements PassengerCrud{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Passenger find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Passenger persist(Passenger entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Passenger merge(Passenger entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Passenger remove(Passenger entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Passenger> findAll() {
        return null;
    }
    
}
