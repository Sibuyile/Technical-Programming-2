/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.CancelTicket;
import com.sibu.immuteclass.service.crud.CancelTicketCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class CancelTicketImpl implements CancelTicketCrud{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CancelTicket find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CancelTicket persist(CancelTicket entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CancelTicket merge(CancelTicket entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CancelTicket remove(CancelTicket entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CancelTicket> findAll() {
        return null;
    }

   
    
    
}
