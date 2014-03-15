/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.PassengerType;
import com.sibu.immuteclass.service.crud.PassengerTypeCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class PassengerTypeImpl implements PassengerTypeCrud{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PassengerType find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PassengerType persist(PassengerType entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PassengerType merge(PassengerType entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PassengerType remove(PassengerType entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PassengerType> findAll() {
        return null;
    }
    
}
