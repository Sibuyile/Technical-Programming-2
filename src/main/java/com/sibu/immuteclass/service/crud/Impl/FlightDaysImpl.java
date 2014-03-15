/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.FlightDays;
import com.sibu.immuteclass.service.crud.FlightDaysCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class FlightDaysImpl implements FlightDaysCrud{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public FlightDays find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public FlightDays persist(FlightDays entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public FlightDays merge(FlightDays entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public FlightDays remove(FlightDays entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<FlightDays> findAll() {
        return null;
    }
    
}
