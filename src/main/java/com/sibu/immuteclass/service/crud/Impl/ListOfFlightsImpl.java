/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.ListOfFlights;
import com.sibu.immuteclass.service.crud.ListOfFlightsCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class ListOfFlightsImpl implements ListOfFlightsCrud{
    
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ListOfFlights find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ListOfFlights persist(ListOfFlights entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ListOfFlights merge(ListOfFlights entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ListOfFlights remove(ListOfFlights entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ListOfFlights> findAll() {
        return null;
    }
}
