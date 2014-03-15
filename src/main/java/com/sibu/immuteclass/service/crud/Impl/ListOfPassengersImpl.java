/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.ListOfPassengers;
import com.sibu.immuteclass.service.crud.ListOfPassengersCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class ListOfPassengersImpl implements ListOfPassengersCrud{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ListOfPassengers find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ListOfPassengers persist(ListOfPassengers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ListOfPassengers merge(ListOfPassengers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ListOfPassengers remove(ListOfPassengers entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ListOfPassengers> findAll() {
        return null;
    }
    
}
