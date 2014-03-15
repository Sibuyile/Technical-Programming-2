/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.FlightAttendant;
import com.sibu.immuteclass.service.crud.FlightAttendantCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class FlightAttendantImpl implements FlightAttendantCrud {
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public FlightAttendant find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public FlightAttendant persist(FlightAttendant entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public FlightAttendant merge(FlightAttendant entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public FlightAttendant remove(FlightAttendant entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<FlightAttendant> findAll() {
        return null;
    }
    
}
