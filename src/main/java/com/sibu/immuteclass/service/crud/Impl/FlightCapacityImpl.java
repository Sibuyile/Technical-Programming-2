/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.FlightCapacity;
import com.sibu.immuteclass.service.crud.FlightCapacityCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class FlightCapacityImpl implements FlightCapacityCrud {
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public FlightCapacity find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public FlightCapacity persist(FlightCapacity entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public FlightCapacity merge(FlightCapacity entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public FlightCapacity remove(FlightCapacity entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<FlightCapacity> findAll() {
        return null;
    }
    
}
