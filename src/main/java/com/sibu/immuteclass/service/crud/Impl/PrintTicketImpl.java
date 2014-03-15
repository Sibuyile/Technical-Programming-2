/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sibu.immuteclass.service.crud.Impl;

import com.sibu.immuteclass.model.PrintTicket;
import com.sibu.immuteclass.service.crud.PrintTicketCrud;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stud
 */
public class PrintTicketImpl implements PrintTicketCrud{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PrintTicket find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PrintTicket persist(PrintTicket entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PrintTicket merge(PrintTicket entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PrintTicket remove(PrintTicket entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PrintTicket> findAll() {
        return null;
    }
    
}
