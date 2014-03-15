/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.SearchFlight;
import com.sibu.immuteclass.service.crud.SearchFlightCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class SearchFlightImpl implements SearchFlightCrud{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SearchFlight find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public SearchFlight persist(SearchFlight entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public SearchFlight merge(SearchFlight entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public SearchFlight remove(SearchFlight entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<SearchFlight> findAll() {
        return null;
    }
    
}
