/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.CancelFlight;
import com.sibu.immuteclass.service.crud.CancelFlightCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class CancelFlightService implements CancelFlightCrudService {
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CancelFlight find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CancelFlight persist(CancelFlight entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CancelFlight merge(CancelFlight entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CancelFlight remove(CancelFlight entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CancelFlight> findAll() {
        return null;
    }


   
    
}
