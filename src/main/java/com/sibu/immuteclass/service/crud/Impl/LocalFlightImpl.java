/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.LocalFlight;
import com.sibu.immuteclass.service.crud.LocalFlightCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class LocalFlightImpl implements LocalFlightCrud{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public LocalFlight find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public LocalFlight persist(LocalFlight entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public LocalFlight merge(LocalFlight entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public LocalFlight remove(LocalFlight entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<LocalFlight> findAll() {
        return null;
    }
    
}
