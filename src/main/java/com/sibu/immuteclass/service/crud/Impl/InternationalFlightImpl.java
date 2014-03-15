/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.InternationalFlight;
import com.sibu.immuteclass.service.crud.InternationalFlightCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class InternationalFlightImpl implements InternationalFlightCrud {
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public InternationalFlight find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public InternationalFlight persist(InternationalFlight entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public InternationalFlight merge(InternationalFlight entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public InternationalFlight remove(InternationalFlight entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<InternationalFlight> findAll() {
        return null;
    }
    
}
